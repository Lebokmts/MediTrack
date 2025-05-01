package services;

import models.User;
import repositories.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {
    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public void registerUser(User user) {
        userRepo.save(user);
    }

    public Optional<User> getUserById(String id) {
        return userRepo.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public void deleteUser(String id) {
        userRepo.delete(id);
    }
}


