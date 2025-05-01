package controllers;

import com.google.gson.Gson;
import models.Doctor;
import models.User;
import repositories.inmemory.InMemoryUserRepository;
import services.UserService;

import static spark.Spark.*;

public class UserController {

    public static void initRoutes() {
        Gson gson = new Gson();
        UserService userService = new UserService(new InMemoryUserRepository());

        // Register user
        post("/api/users", (req, res) -> {
            User user = gson.fromJson(req.body(), Doctor.class); // Defaulting to Doctor for now
            userService.registerUser(user);
            res.status(201);
            return "User registered";
        });

        // Get all users
        get("/api/users", (req, res) -> {
            res.type("application/json");
            return gson.toJson(userService.getAllUsers());
        });

        // Get user by ID
        get("/api/users/:id", (req, res) -> {
            User user = userService.getUserById(req.params("id"))
                    .orElseThrow(() -> new Exception("User not found"));
            res.type("application/json");
            return gson.toJson(user);
        });

        // Delete user
        delete("/api/users/:id", (req, res) -> {
            userService.deleteUser(req.params("id"));
            return "User deleted";
        });
    }
}

