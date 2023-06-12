package com.trabajo.trabajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabajo.trabajo.entity.Ajustes;
import com.trabajo.trabajo.service.AjustesService;

@RestController
@RequestMapping("/Farmacia")
public class AjustesController {
	@Autowired
	AjustesService x;
	
	@GetMapping
	public List<Ajustes>ver(){
		return x.ver();
	}
	
	@PostMapping
	public Ajustes registrar(@RequestBody Ajustes a) {
		return x.registrar(a);
	}
	
	@PutMapping
	public Ajustes actualizar(@RequestBody Ajustes a) {
		return x.actualizar(a);
	}
	
	@DeleteMapping
	public  void eliminar(@RequestBody Ajustes a) {
		x.eliminar(a);
	}
}
