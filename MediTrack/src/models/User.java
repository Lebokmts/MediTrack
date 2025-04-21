/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Kelebogile
 */
public class User {
    protected String userID;
    protected String name;
    protected String email;
    protected String role;
    protected String passwordHash;

    public User(String userID, String name, String email, String role, String passwordHash) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.role = role;
        this.passwordHash = passwordHash;
    }

    public void login() {
        System.out.println(name + " logged in.");
    }

    public void logout() {
        System.out.println(name + " logged out.");
    }

    public void updateProfile(String newEmail) {
        this.email = newEmail;
        System.out.println("Profile updated.");
    }
}
