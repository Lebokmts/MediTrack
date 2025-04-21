/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kelebogile
 */
package test;

import factories.SimpleUserFactory;
import models.User;
import models.Doctor;
import models.Patient;
import models.Pharmacist;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleUserFactoryTest {

    @Test
    public void testDoctorCreation() {
        User user = SimpleUserFactory.createUser("doctor", "D001", "Dr. Smith", "email", "pass");
        assertTrue(user instanceof Doctor);
    }

    @Test
    public void testPatientCreation() {
        User user = SimpleUserFactory.createUser("patient", "P001", "Jane", "email", "pass");
        assertTrue(user instanceof Patient);
    }

    @Test
    public void testPharmacistCreation() {
        User user = SimpleUserFactory.createUser("pharmacist", "PH001", "Phil", "email", "pass");
        assertTrue(user instanceof Pharmacist);
    }
}

