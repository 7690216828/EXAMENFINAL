package com.example.pruebaCrud.Services.productoServiceIMPL;

import com.example.pruebaCrud.Entity.producto;
import com.example.pruebaCrud.Repository.ProductoRepo;
import com.example.pruebaCrud.Services.productoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSIMPL implements productoService {
    @Autowired
    private ProductoRepo repo;
    @Override
    public List<producto> ConsultarProducto() {
        return (List<producto>)this.repo.findAll();
    }

    @Override
    public producto CrearProducto(producto producto) {
        producto.setNombreProducto(producto.getNombreProducto());
        return this.repo.save(producto);
    }

    @Override
    public producto ModificarProducto(producto producto) {
        return this.repo.save(producto);
    }

    @Override
    public producto BuscarProducto(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarProducto(int id) {
        this.repo.deleteById(id);

    }
}
