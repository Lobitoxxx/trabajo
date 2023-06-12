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

import com.trabajo.trabajo.entity.Detalle_lote;
import com.trabajo.trabajo.service.Detalle_loteService;

@RestController
@RequestMapping
public class Detalle_loteController {
	@Autowired
	Detalle_loteService x;
	
	@GetMapping("/Detalle_lote")
	public List<Detalle_lote> ver(){
		return x.ver();
	}
	
	@PostMapping("/Detalle_lote")
	public Detalle_lote registrar(@RequestBody Detalle_lote a) {
		return x.registrar(a);
	}
	
	@PutMapping("/Detalle_lote")
	public Detalle_lote actualizar(@RequestBody Detalle_lote a) {
		return x.actualizar(a);
	}
	
	@DeleteMapping("/Detalle_lote")
	public  void eliminar(@RequestBody Detalle_lote a) {
		x.eliminar(a);
	}
}

