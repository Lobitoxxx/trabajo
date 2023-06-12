package com.trabajo.trabajo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Estado_Ventas")
@Table(name="estado_ventas")
public class Estado_Ventas {
	@Id
	String idEstadoVenta;
	int Descripcion;
	public Estado_Ventas() {
		super();
	}
	public Estado_Ventas(String idEstadoVenta,int Descripcion) {
		super();
		this.idEstadoVenta=idEstadoVenta;
		this.Descripcion=Descripcion;
	}
	public String getIdEstadoVenta() {
		return idEstadoVenta;
	}
	public void setIdEstadoVenta(String idEstadoVenta) {
		this.idEstadoVenta = idEstadoVenta;
	}
	public int getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(int descripcion) {
		Descripcion = descripcion;
	}

}
