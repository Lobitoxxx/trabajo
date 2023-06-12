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

import com.trabajo.trabajo.entity.Inventario;
import com.trabajo.trabajo.service.InventarioService;

@RestController
@RequestMapping
public class InventarioController {
	@Autowired
	InventarioService x;
	
	@GetMapping("/Inventario")
	public List<Inventario>ver(){
		return x.ver();
	}
	
	@PostMapping("/Inventario")
	public Inventario registrar(@RequestBody Inventario a) {
		return x.registrar(a);
	}
	
	@PutMapping("/Inventario")
	public Inventario actualizar(@RequestBody Inventario a) {
		return x.actualizar(a);
	}
	
	@DeleteMapping("/Inventario")
	public  void eliminar(@RequestBody Inventario a) {
		x.eliminar(a);
	}
}
