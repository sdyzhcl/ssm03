package com.hwua.entity;

public class User {

    private Integer user_id;
    private String user_username;
    private String user_password;
    private Integer user_sex;
    private String user_birthday;
    private String user_idCard;
    private String user_email;
    private String user_tel;
    private String user_address;

    public User() {
    }

    public User(Integer user_id, String user_username, String user_password, Integer user_sex, String user_birthday, String user_idCard, String user_email, String user_tel, String user_address) {
        this.user_id = user_id;
        this.user_username = user_username;
        this.user_password = user_password;
        this.user_sex = user_sex;
        this.user_birthday = user_birthday;
        this.user_idCard = user_idCard;
        this.user_email = user_email;
        this.user_tel = user_tel;
        this.user_address = user_address;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Integer getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(Integer user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(String user_birthday) {
        this.user_birthday = user_birthday;
    }

    public String getUser_idCard() {
        return user_idCard;
    }

    public void setUser_idCard(String user_idCard) {
        this.user_idCard = user_idCard;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_username='" + user_username + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_sex=" + user_sex +
                ", user_birthday='" + user_birthday + '\'' +
                ", user_idCard='" + user_idCard + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_tel='" + user_tel + '\'' +
                ", user_address='" + user_address + '\'' +
                '}';
    }
}
