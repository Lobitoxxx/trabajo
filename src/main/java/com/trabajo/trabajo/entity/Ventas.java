package com.trabajo.trabajo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Ventas")
@Table(name="ventas")
public class Ventas {
	@Id
	String idVenta;
	String Id_Producto;
	int Cantidad;
	double Precio;
	double Descuento;
	double Total_importe;
	int Fecha;
	int Hora;
	String IdEmpleado;
	String idEstado;
	String idLote;
	public Ventas() {
		super();
	}
	public Ventas(String idVenta,String Id_Producto,int Cantidad,double Precio,double Descuento,double Total_importe,int Fecha,int Hora,String IdEmpleado,String idEstado,String idLote) {
		super();
		this.idVenta=idVenta;
		this.Id_Producto=Id_Producto;
		this.Cantidad=Cantidad;
		this.Precio=Precio;
		this.Total_importe=Total_importe;
		this.Fecha=Fecha;
		this.Hora=Hora;
		this.IdEmpleado=IdEmpleado;
		this.idEstado=idEstado;
		this.idLote=idLote;
	}
	public String getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}
	public String getId_Producto() {
		return Id_Producto;
	}
	public void setId_Producto(String id_Producto) {
		Id_Producto = id_Producto;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public double getDescuento() {
		return Descuento;
	}
	public void setDescuento(double descuento) {
		Descuento = descuento;
	}
	public double getTotal_importe() {
		return Total_importe;
	}
	public void setTotal_importe(double total_importe) {
		Total_importe = total_importe;
	}
	public int getFecha() {
		return Fecha;
	}
	public void setFecha(int fecha) {
		Fecha = fecha;
	}
	public int getHora() {
		return Hora;
	}
	public void setHora(int hora) {
		Hora = hora;
	}
	public String getIdEmpleado() {
		return IdEmpleado;
	}
	public void setIdEmpleado(String idEmpleado) {
		IdEmpleado = idEmpleado;
	}
	public String getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(String idEstado) {
		this.idEstado = idEstado;
	}
	public String getIdLote() {
		return idLote;
	}
	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}	
}