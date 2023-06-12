package com.trabajo.trabajo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Inventario")
@Table(name="inventario")
public class Inventario {
	@Id
	String idProducto;
	String Nombre;
	String Id_presentacion;
	String Id_laboratorio;
	double Concentracion;
	double Existencia_minima;
	String idPrescripcion;
	public Inventario() {
		super();
	}
	public Inventario(String idProducto,String Nombre,String Id_presentacion,String Id_laboratorio,double Concentracion,double Existencia_minima,String idPrescripcion) {
		super();
		this.idProducto=idProducto;
		this.Nombre=Nombre;
		this.Id_presentacion=Id_presentacion;
		this.Id_laboratorio=Id_laboratorio;
		this.Concentracion=Concentracion;
		this.Existencia_minima=Existencia_minima;
		this.idPrescripcion=idPrescripcion;	
	}
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getId_presentacion() {
		return Id_presentacion;
	}
	public void setId_presentacion(String id_presentacion) {
		Id_presentacion = id_presentacion;
	}
	public String getId_laboratorio() {
		return Id_laboratorio;
	}
	public void setId_laboratorio(String id_laboratorio) {
		Id_laboratorio = id_laboratorio;
	}
	public double getConcentracion() {
		return Concentracion;
	}
	public void setConcentracion(double concentracion) {
		Concentracion = concentracion;
	}
	public double getExistencia_minima() {
		return Existencia_minima;
	}
	public void setExistencia_minima(double existencia_minima) {
		Existencia_minima = existencia_minima;
	}
	public String getIdPrescripcion() {
		return idPrescripcion;
	}
	public void setIdPrescripcion(String idPrescripcion) {
		this.idPrescripcion = idPrescripcion;
	}
}
