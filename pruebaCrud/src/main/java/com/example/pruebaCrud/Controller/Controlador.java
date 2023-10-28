package com.example.pruebaCrud.Controller;
import com.example.pruebaCrud.Entity.producto;
import com.example.pruebaCrud.Services.productoServiceIMPL.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CRUDRepo")
public class Controlador {
    @Autowired
    private PSIMPL impl;
   @GetMapping
    @RequestMapping(value = "ConsultarProducto", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarProducto(){
        List<producto>producto=this.impl.ConsultarProducto();
        return ResponseEntity.ok(producto);
    }

  
    @PostMapping("CrearProducto")
    public ResponseEntity<?>CrearProducto(@RequestBody producto producto){
        producto productocreado=this.impl.CrearProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productocreado);
    }


  
    @PutMapping("ModificarProducto")
    public ResponseEntity<?>ModificarProducto(@RequestBody producto producto){
        producto productomodificado=this.impl.ModificarProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productomodificado);
    }

  
    @GetMapping("BuscarProducto/{id}")
    public ResponseEntity<?>BuscarProducto(@PathVariable int id){
        producto producto=this.impl.BuscarProducto(id);
        return ResponseEntity.ok(producto);
    }

    @DeleteMapping("EliminarProducto/{id}")
    public ResponseEntity<?>EliminarProducto(@PathVariable int id){
        this.impl.EliminarProducto(id);
        return ResponseEntity.ok().build();
    }

}
