package com.trabajo.trabajo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabajo.trabajo.entity.Ventas;
import com.trabajo.trabajo.repository.VentasRepository;

@Service
public class VentasServiceImplement implements VentasService{
	@Autowired
	VentasRepository x;

	@Override
	public Ventas registrar(Ventas a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Ventas actualizar(Ventas a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Ventas a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Ventas> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}
}
