package com.trabajo.trabajo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabajo.trabajo.entity.Detalle_Compra;
@Service
public interface Detalle_CompraService {
	public Detalle_Compra registrar(Detalle_Compra a);
	public Detalle_Compra actualizar(Detalle_Compra a);
	public void eliminar(Detalle_Compra a);
	public List<Detalle_Compra> ver();
}
