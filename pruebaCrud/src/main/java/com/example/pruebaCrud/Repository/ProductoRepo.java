package com.example.pruebaCrud.Repository;

import com.example.pruebaCrud.Entity.producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepo extends CrudRepository<producto,Integer> {
}
