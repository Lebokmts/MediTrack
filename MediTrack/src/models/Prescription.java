/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import prototypes.PrescriptionPrototype;
/**
 *
 * @author Kelebogile
 */



public class Prescription implements PrescriptionPrototype {
    // (keep your attributes and methods as is...)

    // Implement clone() method
    @Override
    public Prescription clone() {
        return new Prescription(this.prescriptionID + "_COPY", this.issueDate, this.expiryDate, this.status);
    }
}
