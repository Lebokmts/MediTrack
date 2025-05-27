
package services;

import models.Prescription;
import repositories.PrescriptionRepository;

import java.util.List;
import java.util.Optional;

public class PrescriptionService {
    private final PrescriptionRepository prescriptionRepo;

    public PrescriptionService(PrescriptionRepository prescriptionRepo) {
        this.prescriptionRepo = prescriptionRepo;
    }

    public Prescription createPrescription(Prescription prescription) {
        return prescriptionRepo.save(prescription);
    }

    public List<Prescription> getAllPrescriptions() {
        return prescriptionRepo.findAll();
    }

    public Optional<Prescription> getPrescriptionById(String id) {
        return prescriptionRepo.findById(id);
    }

    public void deletePrescription(String id) {
        prescriptionRepo.delete(id);
    }

    public Prescription verifyPrescription(String id) {
        Prescription prescription = prescriptionRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Prescription not found: " + id));
        prescription.setStatus("Verified");
        return prescriptionRepo.save(prescription);
    }

    public List<Prescription> searchPrescriptionsByPatientName(String name) {
        return prescriptionRepo.searchByPatientName(name);
    }

}
