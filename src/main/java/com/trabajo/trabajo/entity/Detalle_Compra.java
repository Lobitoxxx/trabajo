package com.trabajo.trabajo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Detalle_Compra")
@Table(name="detalle_compra")
public class Detalle_Compra {
	@Id
	String Id_compra;
	String Id_producto;
	int Cantidad;
	int Precio_compra;
	String idLote;
	public Detalle_Compra() {
		super();
	}
	public Detalle_Compra(String Id_compra,String Id_producto,int Cantidad,int Precio_compra,String idLote) {
		super();
		this.Id_compra=Id_compra;
		this.Id_producto=Id_producto;
		this.Cantidad=Cantidad;
		this.Precio_compra=Precio_compra;
		this.idLote=idLote;
	}
	public String getId_compra() {
		return Id_compra;
	}
	public void setId_compra(String id_compra) {
		Id_compra = id_compra;
	}
	public String getId_producto() {
		return Id_producto;
	}
	public void setId_producto(String id_producto) {
		Id_producto = id_producto;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public int getPrecio_compra() {
		return Precio_compra;
	}
	public void setPrecio_compra(int precio_compra) {
		Precio_compra = precio_compra;
	}
	public String getIdLote() {
		return idLote;
	}
	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}

}