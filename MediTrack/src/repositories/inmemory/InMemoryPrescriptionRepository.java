/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kelebogile
 */
package repositories.inmemory;

import repositories.PrescriptionRepository;
import models.Prescription;

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
}

