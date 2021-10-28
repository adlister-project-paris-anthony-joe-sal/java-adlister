package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import org.mindrot.jbcrypt.BCrypt;

import java.sql.*;

public class MySQLUsersDao implements Users {
    private Connection connection;

    public MySQLUsersDao(Config config) {
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


                        //    @Override
                        //    public User findByUsername(String username) {
                        //        String query = "SELECT * FROM users WHERE username = ? LIMIT 1";
                        //        try {
                        //            PreparedStatement stmt = connection.prepareStatement(query);
                        //
                        //            stmt.setString(1, username);
                        //            return extractUser(stmt.executeQuery());
                        //        } catch (SQLException e) {
                        //            throw new RuntimeException("Error finding a user by username", e);
                        //        }
                        //    }


    @Override
    public User findByUsername(String username) {
        User user = null;
        String query = "SELECT * FROM users WHERE username = ?";
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User(
                        rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("zipcode"),
                        rs.getString("phone_number")
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }







    @Override
    public Long insert(User user) {



        String query = "INSERT INTO users(username,first_name,last_name,email,password,zip_code,phone_number) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getFirstName());
            stmt.setString(3, user.getLastName());
            stmt.setString(4, user.getEmail());
            stmt.setString(5, user.getPassword());
            stmt.setString(6, user.getZipCode());
            stmt.setString(7, user.getPhoneNumber());



            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating new user", e);
        }
    }


    private User extractUser(ResultSet rs) throws SQLException {
        if (! rs.next()) {
            return null;
        }
        return new User(
            rs.getLong("id"),
            rs.getString("username"),
                rs.getString("first_name"),
                rs.getString("last_name"),
            rs.getString("email"),
            rs.getString("password"),

                rs.getString("zip_code"),
                rs.getString("phone_number")
        );
    }
    public static void main(String[] args) {
        Users usersDao = new MySQLUsersDao(new Config());
        System.out.println(usersDao.findByUsername("bilbo123"));
        System.out.println(usersDao.findByUsername("salazar1979"));

        User newUser = new User(
                "bilbo",
                "sssss",
                "rrrrrrr",
                "add@gmail.com",
                "bilbo@email.com",
                "letmein",
                "150"
        );
        usersDao.insert(newUser);
    }

}
