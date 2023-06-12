package com.trabajo.trabajo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Lotes")
@Table(name="lotes")
public class Lotes {
	@Id
	String idLote;
	int Fecha_vencimiento;
	public Lotes() {
		super();
	}
	public Lotes(String idLote,int Fecha_vencimiento) {
		super();
		this.idLote=idLote;
		this.Fecha_vencimiento=Fecha_vencimiento;
	}
	public String getIdLote() {
		return idLote;
	}
	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}
	public int getFecha_vencimiento() {
		return Fecha_vencimiento;
	}
	public void setFecha_vencimiento(int fecha_vencimiento) {
		Fecha_vencimiento = fecha_vencimiento;
	}

}
