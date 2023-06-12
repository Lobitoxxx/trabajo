package com.trabajo.trabajo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Compras")
@Table(name="compras")
public class Compras {
	@Id
	String idCompra;
	String Id_Proveedor;
	int Nro_factura;
	int fecha;
	public Compras() {
		super();
	}
	public Compras(String idCompras,String Id_Proveedor,int Nro_factura,int fecha) {
		super();
		this.idCompra=idCompras;
		this.Id_Proveedor=Id_Proveedor;
		this.Nro_factura=Nro_factura;
		this.fecha=fecha;
	}
	public String getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(String idCompra) {
		this.idCompra = idCompra;
	}
	public String getId_Proveedor() {
		return Id_Proveedor;
	}
	public void setId_Proveedor(String id_Proveedor) {
		Id_Proveedor = id_Proveedor;
	}
	public int getNro_factura() {
		return Nro_factura;
	}
	public void setNro_factura(int nro_factura) {
		Nro_factura = nro_factura;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

}