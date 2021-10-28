
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



















































//package com.codeup.adlister.models;
//
//import com.codeup.adlister.util.Password;
//
//public class User {
//
//    private long id;
//    private String username;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String password;
//
//    private String zipCode;
//    private String phoneNumber;
//
//    public User(long id, String username,String firstName, String lastName, String email, String password,  String zipCode, String phoneNumber) {
//
//        this.id = id;
//        this.username = username;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.password = password;
//    private long zip_code;
//    private long phone_number;
//
//    public long getZip_code() {
//        return zip_code;
//    }
//
//    public void setZip_code(long zip_code) {
//        this.zip_code = zip_code;
//    }
//
//    public long getPhone_number() {
//        return phone_number;
//    }
//
//    public void setPhone_number(long phone_number) {
//        this.phone_number = phone_number;
//    }
//
//        this.zipCode = zipCode;
//        this.phoneNumber = phoneNumber;
//    }
//
//    public User(String username,String firstName, String lastName, String email, String password,  String zipCode, String phoneNumber) {
//    public User(String username, String email, String password, long zip_code , long phone_number) {
//        this.username = username;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.password = password;
//
//        this.zipCode = zipCode;
//        this.phoneNumber = phoneNumber;
//
//    }
//
//    public User(String username, String email, String password, long zip_code, long phone_number) {
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getZipCode() {
//        return zipCode;
//    }
//
//    public void setZipCode(String zipCode) {
//        this.zipCode = zipCode;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
////    public User(String username, String email, String password, String firstName, String lastName, String zipCode, String phoneNumber) {}
////
////    public User(String username, String email, String password) {
////        this.username = username;
////        this.email = email;
////        this.password = password;
////    }
//
//    public User(long id, String username, String email, String password) {
//        this.zip_code = zip_code;
//        this.phone_number = phone_number;
//    }
//
//    public User(long id, String username, String email, String password, long zip_code, long phone_number) {
//        this.id = id;
//        this.username = username;
//        this.email = email;
//        this.password = password;
//        this.zip_code = zip_code;
//        this.phone_number = phone_number;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = Password.hash(password);
//    }
//}
