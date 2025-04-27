/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kelebogile
 */
package repositories.inmemory;

import repositories.MedicationRepository;
import models.Medication;

import java.util.*;

public class InMemoryMedicationRepository implements MedicationRepository {
    private final Map<String, Medication> medications = new HashMap<>();

    @Override
    public void save(Medication medication) {
        medications.put(medication.getMedicationID(), medication);
    }

    @Override
    public Optional<Medication> findById(String id) {
        return Optional.ofNullable(medications.get(id));
    }

    @Override
    public List<Medication> findAll() {
        return new ArrayList<>(medications.values());
    }

    @Override
    public void delete(String id) {
        medications.remove(id);
    }
}
