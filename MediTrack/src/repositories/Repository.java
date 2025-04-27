/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kelebogile
 */

package repositories;

import java.util.List;
import java.util.Optional;

public interface Repository<T, ID> {
    void save(T entity);                // Create/Update
    Optional<T> findById(ID id);        // Read
    List<T> findAll();                  // Read All
    void delete(ID id);                 // Delete
}
