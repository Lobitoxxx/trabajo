package com.trabajo.trabajo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabajo.trabajo.entity.Inventario;
import com.trabajo.trabajo.repository.InventarioRepository;

@Service
public class InventarioServiceImplement implements InventarioService{
	@Autowired
	InventarioRepository x;

	@Override
	public Inventario registrar(Inventario a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Inventario actualizar(Inventario a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Inventario a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Inventario> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}
}
