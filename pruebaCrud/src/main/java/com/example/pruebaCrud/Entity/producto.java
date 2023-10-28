package com.example.pruebaCrud.Entity;

import jakarta.persistence.*;
//import org.springframework.boot.autoconfigure.web.WebProperties;
import jakarta.persistence.Column;
@Entity
@Table(name="producto")
public class producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "nombreProducto")
    private String nombreProducto;
    
    @Column(name = "precioProducto")
    private double precioProducto;
    
    @Column(name = "cantidadProducto")
    private int cantidadProducto;
    
    @Column(name = "fechaVencimiento")
    private String fechaVencimiento;

	public producto(){

	}

	public producto(int id, String nombreProducto, double precioProducto, int cantidadProducto, String fechaVencimiento) {
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.cantidadProducto = cantidadProducto;
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}


    
}
