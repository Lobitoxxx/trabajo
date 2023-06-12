package com.trabajo.trabajo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Detalle_lote")
@Table(name="detalle_lote")
public class Detalle_lote {
	@Id
	String IdProducto;
	String IdLote;
	int FechaIngreso;
	int Cantidad;
	double Precio_Compra;
	double Porcentaje_Ganancia;
	double Porcentaje_Descuento;
	double Precio_Venta;
	public Detalle_lote() {
		super();
	}
	public Detalle_lote(String IdProducto,String IdLote,int FechaIngreso,int Cantidad,double Precio_Compra,double Porcentaje_Ganancia,double Porcentaje_Descuento,double Precio_Venta) {
		super();
		this.IdProducto=IdProducto;
		this.IdLote=IdLote;
		this.FechaIngreso=FechaIngreso;
		this.Cantidad=Cantidad;
		this.Precio_Compra=Precio_Compra;
		this.Porcentaje_Ganancia=Porcentaje_Ganancia;
		this.Porcentaje_Descuento=Porcentaje_Ganancia;
		this.Precio_Venta=Precio_Venta;
	}
	public String getIdProducto() {
		return IdProducto;
	}
	public void setIdProducto(String idProducto) {
		IdProducto = idProducto;
	}
	public String getIdLote() {
		return IdLote;
	}
	public void setIdLote(String idLote) {
		IdLote = idLote;
	}
	public int getFechaIngreso() {
		return FechaIngreso;
	}
	public void setFechaIngreso(int fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public double getPrecio_Compra() {
		return Precio_Compra;
	}
	public void setPrecio_Compra(double precio_Compra) {
		Precio_Compra = precio_Compra;
	}
	public double getPorcentaje_Ganancia() {
		return Porcentaje_Ganancia;
	}
	public void setPorcentaje_Ganancia(double porcentaje_Ganancia) {
		Porcentaje_Ganancia = porcentaje_Ganancia;
	}
	public double getPorcentaje_Descuento() {
		return Porcentaje_Descuento;
	}
	public void setPorcentaje_Descuento(double porcentaje_Descuento) {
		Porcentaje_Descuento = porcentaje_Descuento;
	}
	public double getPrecio_Venta() {
		return Precio_Venta;
	}
	public void setPrecio_Venta(double precio_Venta) {
		Precio_Venta = precio_Venta;
	}

}