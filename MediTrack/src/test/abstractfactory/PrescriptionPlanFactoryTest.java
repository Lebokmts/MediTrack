/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kelebogile
 */
package test;

import abstractfactory.PrescriptionPlanFactory;
import abstractfactory.StandardPrescriptionFactory;
import models.Prescription;
import models.Reminder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrescriptionPlanFactoryTest {
    @Test
    public void testStandardFactoryCreatesBothObjects() {
        PrescriptionPlanFactory factory = new StandardPrescriptionFactory();
        Prescription rx = factory.createPrescription();
        Reminder rem = factory.createReminder();

        assertNotNull(rx);
        assertNotNull(rem);
    }
}