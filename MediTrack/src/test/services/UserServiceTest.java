package services;

import models.Doctor;
import models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.inmemory.InMemoryUserRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    private UserService userService;

    @BeforeEach
    public void setUp() {
        userService = new UserService(new InMemoryUserRepository());
    }

    @Test
    public void testRegisterAndGetUser() {
        User user = new Doctor("D001", "Dr. Smith", "doc@example.com", "pass");
        userService.registerUser(user);

        Optional<User> retrieved = userService.getUserById("D001");
        assertTrue(retrieved.isPresent());
        assertEquals("Dr. Smith", retrieved.get().getName());
    }
}
