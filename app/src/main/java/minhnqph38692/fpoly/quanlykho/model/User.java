package minhnqph38692.fpoly.quanlykho.model;

public class User {
//    String id;
    String username;//khoa chinh;

    String name;
    String password;
    int position;//chuc vu 1|0
    String avatar;
    String profile;//gioi thieu tom tat
    String lastLogin;// lan cuoi login
    String createdDate;////ngay tao tk
    String lastAction;//hanh dong cuoi cung tren he thong

    public User(String username,String name, String password, int position, String avatar, String profile, String lastLogin, String createdDate, String lastAction) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.position = position;
        this.avatar = avatar;
        this.profile = profile;
        this.lastLogin = lastLogin;
        this.createdDate = createdDate;
        this.lastAction = lastAction;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastAction() {
        return lastAction;
    }

    public void setLastAction(String lastAction) {
        this.lastAction = lastAction;
    }
}
