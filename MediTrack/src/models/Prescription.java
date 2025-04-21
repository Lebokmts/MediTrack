
import prototypes.PrescriptionPrototype;

public class Prescription implements PrescriptionPrototype {
    // (keep your attributes and methods as is...)

    // Implement clone() method
    @Override
    public Prescription clone() {
        return new Prescription(this.prescriptionID + "_COPY", this.issueDate, this.expiryDate, this.status);
    }
}
