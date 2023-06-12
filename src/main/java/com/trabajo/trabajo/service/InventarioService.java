package com.trabajo.trabajo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabajo.trabajo.entity.Inventario;
@Service
public interface InventarioService {
	public Inventario registrar(Inventario a);
	public Inventario actualizar(Inventario a);
	public void eliminar(Inventario a);
	public List <Inventario>ver();
}
