/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;
import models.Prescription;
import models.Reminder;
/**
 *
 * @author Kelebogile
 */

public interface PrescriptionPlanFactory {
    Prescription createPrescription();
    Reminder createReminder();
}

