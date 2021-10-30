
package com.codeup.adlister.models;

public class User {
    private long id;
    private String username;
    private String email;
    private String password;
    private long zip_code;
    private long phone_number;

    public long getZip_code() {
        return zip_code;
    }

    public void setZip_code(long zip_code) {
        this.zip_code = zip_code;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public User() {}

    public User(String username, String email, String password, long zip_code , long phone_number) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.zip_code = zip_code;
        this.phone_number = phone_number;
    }

    public User(long id, String username, String email, String password, long zip_code, long phone_number) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.zip_code = zip_code;
        this.phone_number = phone_number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

