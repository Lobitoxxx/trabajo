package com.trabajo.trabajo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabajo.trabajo.entity.Ajustes;
import com.trabajo.trabajo.repository.AjustesRepository;

@Service
public class AjustesServiceImplement implements  AjustesService{
	@Autowired
	 AjustesRepository x;
	@Override
	public Ajustes registrar(Ajustes a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Ajustes actualizar(Ajustes a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Ajustes a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Ajustes> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
