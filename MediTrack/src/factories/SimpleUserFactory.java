/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;
/**
 *
 * @author Kelebogile
 */

import models.Doctor;
import models.Patient;
import models.Pharmacist;
import models.User;

public class SimpleUserFactory {

    public static User createUser(String type, String userID, String name, String email, String passwordHash) {
        switch (type.toLowerCase()) {
            case "doctor":
                return new Doctor(userID, name, email, passwordHash);
            case "patient":
                return new Patient(userID, name, email, passwordHash);
            case "pharmacist":
                return new Pharmacist(userID, name, email, passwordHash);
            default:
                throw new IllegalArgumentException("Unknown user type: " + type);
        }
    }
}

