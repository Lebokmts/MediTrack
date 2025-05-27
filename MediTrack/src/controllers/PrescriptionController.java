package controllers;

import com.google.gson.Gson;
import models.Prescription;
import repositories.inmemory.InMemoryPrescriptionRepository;
import services.PrescriptionService;

import static spark.Spark.*;

public class PrescriptionController {

    public static void initRoutes() {
        Gson gson = new Gson();
        PrescriptionService service = new PrescriptionService(new InMemoryPrescriptionRepository());

        // Create
        post("/api/prescriptions", (req, res) -> {
            Prescription p = gson.fromJson(req.body(), Prescription.class);
            service.createPrescription(p);
            res.status(201);
            return "Prescription created";
        });

        // Get all
        get("/api/prescriptions", (req, res) -> {
            res.type("application/json");
            return gson.toJson(service.getAllPrescriptions());
        });

        // Get by ID
        get("/api/prescriptions/:id", (req, res) -> {
            Prescription p = service.getPrescriptionById(req.params("id"))
                    .orElseThrow(() -> new Exception("Not found"));
            res.type("application/json");
            return gson.toJson(p);
        });

        // Verify prescription
        put("/api/prescriptions/:id/verify", (req, res) -> {
            service.verifyPrescription(req.params("id"));
            return "Prescription verified.";
        });

        // Delete
        delete("/api/prescriptions/:id", (req, res) -> {
            service.deletePrescription(req.params("id"));
            return "Prescription deleted.";
        });

        // Get prescription by user name
        get("/api/prescriptions/search", (req, res) -> {
            String nameQuery = req.queryParams("name");
            if (nameQuery == null || nameQuery.isEmpty()) {
                res.status(400);
                return "Query parameter 'name' is required.";
            }
            res.type("application/json");
            return gson.toJson(service.searchPrescriptionsByPatientName(nameQuery));
        });

    }
}


