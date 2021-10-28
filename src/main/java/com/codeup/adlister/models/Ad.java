package com.codeup.adlister.models;
import java.text.DateFormat;
import java.sql.Date;

public class Ad {
    private long id;
    private long userId;
    private String title;
    private String description;
    private Date date_created;


    public Ad(long id, long userId, String title, String description, Date date_created) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.date_created = date_created;
    }

    public Ad(long userId, String title, String description, Date date_created) {
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.date_created = date_created;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public Date getDate(){return date_created;}

    public void setDate(Date date_created) {
        this.date_created = date_created;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
