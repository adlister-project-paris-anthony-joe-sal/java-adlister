package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public List<Ad> all() {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("SELECT * FROM ads");
            ResultSet rs = stmt.executeQuery();
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        try {
            String insertQuery = "INSERT INTO ads(user_id, title, description, date_created) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            stmt.setLong(1, ad.getUserId());
            stmt.setString(2, ad.getTitle());
            stmt.setString(3, ad.getDescription());
            stmt.setTimestamp(4, ad.getDate());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }


    @Override
    public void delete(String id) {
        try {
            String deleteQry = "DELETE FROM  ads WHERE  id = ?";
            PreparedStatement stmt = connection.prepareStatement(deleteQry);
            stmt.setLong(1, Long.parseLong(id));
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting a new ad.", e);
        }
    }



    @Override
    public Ad attainAdId(long id) {
        String query = "SELECT * FROM ads WHERE id = ? LIMIT 1";
        try {

            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            return extractAd(rs);
        }catch(SQLException e) {
            throw new RuntimeException("Error finding Ad id.",  e);
        }

    }



    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(

            rs.getLong("id"),
            rs.getLong("user_id"),
            rs.getString("title"),
            rs.getString("description"),
            rs.getTimestamp("date_created")

        );
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }




    @Override
    public void edit( Ad newAd) {
        try {
            String editQuery = "UPDATE ads SET title = ?, description = ?, date_created = ?, adlister_db.categories.name = ? WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(editQuery, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, newAd.getTitle());
            stmt.setString(2, newAd.getDescription());
            stmt.setTimestamp(3, newAd.getDate_created());
            stmt.setString(4, newAd.getCategory());
            stmt.setLong(5, newAd.getId());
            stmt.executeUpdate();
        } catch(SQLException e) {
            throw new RuntimeException("Error editing ad. ", e);
        }
    }

    public List<Ad> sortAds() {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("SELECT * FROM ads ORDER BY date_created ASC");
            ResultSet rs = stmt.executeQuery();
            System.out.println("Ads should be sorted now");
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
    }

    public List<Ad> sortAdsAscending() {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("SELECT * FROM ads ORDER BY date_created DESC");
            ResultSet rs = stmt.executeQuery();
            System.out.println("Ads should be sorted now");
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
    }

}





