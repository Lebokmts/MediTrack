/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

import models.Prescription;
/**
 *
 * @author Kelebogile
 */
public class BasicPrescriptionFactory extends PrescriptionFactory {
    @Override
    public Prescription createPrescription() {
        return new Prescription("RX001", "2024-04-01", "2024-05-01", "Created");
    }
}
