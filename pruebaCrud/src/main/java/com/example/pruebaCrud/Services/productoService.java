package com.example.pruebaCrud.Services;

import com.example.pruebaCrud.Entity.producto;
import java.util.List;

public interface productoService {

    public List<producto> ConsultarProducto();

    public producto CrearProducto(producto producto);
    public producto ModificarProducto(producto producto);
    public producto BuscarProducto(int id);
    public void EliminarProducto(int id);
}
