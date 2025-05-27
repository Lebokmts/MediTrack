
package repositories.inmemory;

import repositories.PrescriptionRepository;
import models.Prescription;
import java.util.stream.Collectors;

import java.util.*;

public class InMemoryPrescriptionRepository implements PrescriptionRepository {
    private final Map<String, Prescription> prescriptions = new HashMap<>();

    @Override
    public void save(Prescription prescription) {
        prescriptions.put(prescription.getPrescriptionID(), prescription);
    }

    @Override
    public Optional<Prescription> findById(String id) {
        return Optional.ofNullable(prescriptions.get(id));
    }

    @Override
    public List<Prescription> findAll() {
        return new ArrayList<>(prescriptions.values());
    }

    @Override
    public void delete(String id) {
        prescriptions.remove(id);
    }

    @Override
    public List<Prescription> searchByPatientName(String name){
        return prescriptions.values().stream()
                .filter(p -> p.getPatient() != null &&
                        p.getPatient().getName() != null &&
                        p.getPatient().getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
}
