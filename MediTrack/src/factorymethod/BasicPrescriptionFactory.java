
package factorymethod;

import models.Prescription;

public class BasicPrescriptionFactory extends PrescriptionFactory {
    @Override
    public Prescription createPrescription() {
        return new Prescription("RX001", "2024-04-01", "2024-05-01", "Created");
    }
}
