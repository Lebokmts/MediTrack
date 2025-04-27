/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kelebogile
 */
package repositories;

import models.Doctor;
import models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.inmemory.InMemoryUserRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class InMemoryUserRepositoryTest {

    private InMemoryUserRepository userRepo;

    @BeforeEach
    void setUp() {
        userRepo = new InMemoryUserRepository();
    }

    @Test
    void testSaveAndFindById() {
        User doc = new Doctor("D001", "Dr. Smith", "dr@example.com", "pass123");
        userRepo.save(doc);

        Optional<User> found = userRepo.findById("D001");
        assertTrue(found.isPresent());
        assertEquals("Dr. Smith", found.get().getName());
    }

    @Test
    void testDelete() {
        userRepo.save(new Doctor("D002", "Dr. Jane", "jane@example.com", "pass456"));
        userRepo.delete("D002");

        assertFalse(userRepo.findById("D002").isPresent());
    }

    @Test
    void testFindAll() {
        userRepo.save(new Doctor("D003", "Dr. A", "a@example.com", "pass"));
        userRepo.save(new Doctor("D004", "Dr. B", "b@example.com", "pass"));
        assertEquals(2, userRepo.findAll().size());
    }
}

