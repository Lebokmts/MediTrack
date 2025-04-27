/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kelebogile
 */
package repositories;

import models.AuditLog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.inmemory.InMemoryAuditLogRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class InMemoryAuditLogRepositoryTest {

    private InMemoryAuditLogRepository repo;

    @BeforeEach
    void setUp() {
        repo = new InMemoryAuditLogRepository();
    }

    @Test
    void testSaveAndFindById() {
        AuditLog log = new AuditLog("LOG001", "Login", "Success");
        repo.save(log);

        Optional<AuditLog> found = repo.findById("LOG001");
        assertTrue(found.isPresent());
        assertEquals("Login", found.get().getAction());
    }

    @Test
    void testDelete() {
        repo.save(new AuditLog("LOG002", "Upload", "Fail"));
        repo.delete("LOG002");
        assertFalse(repo.findById("LOG002").isPresent());
    }

    @Test
    void testFindAll() {
        repo.save(new AuditLog("LOG003", "Scan", "Success"));
        repo.save(new AuditLog("LOG004", "Update", "Pending"));
        assertEquals(2, repo.findAll().size());
    }
}