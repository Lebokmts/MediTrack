/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import repositories.inmemory.InMemoryUserRepository;
import models.User;
import models.Doctor;

public class Main {
    public static void main(String[] args) {
        InMemoryUserRepository userRepo = new InMemoryUserRepository();
        User doc = new Doctor("D001", "Dr. Smith", "doc@example.com", "1234");
        userRepo.save(doc);

        userRepo.findById("D001").ifPresent(User::login);
    }
}



