package com.trabajo.trabajo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabajo.trabajo.entity.Detalle_Compra;
import com.trabajo.trabajo.repository.Detalle_CompraRepository;

@Service
public class Detalle_CompraServiceImplement implements Detalle_CompraService{
	@Autowired
	Detalle_CompraRepository x;

	@Override
	public Detalle_Compra registrar(Detalle_Compra a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Detalle_Compra actualizar(Detalle_Compra a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Detalle_Compra a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Detalle_Compra> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}
}
