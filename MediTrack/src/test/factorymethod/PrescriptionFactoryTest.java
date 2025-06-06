/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kelebogile
 */
package test;

import factorymethod.BasicPrescriptionFactory;
import factorymethod.PrescriptionFactory;
import models.Prescription;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrescriptionFactoryTest {
    @Test
    public void testCreatePrescription() {
        PrescriptionFactory factory = new BasicPrescriptionFactory();
        Prescription p = factory.createPrescription();
        assertNotNull(p);
        assertEquals("RX001", p.getPrescriptionID());
    }
}
