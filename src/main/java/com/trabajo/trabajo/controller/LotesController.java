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

import com.trabajo.trabajo.entity.Lotes;
import com.trabajo.trabajo.service.LotesService;

@RestController
@RequestMapping
public class LotesController {
	@Autowired
	LotesService x;
	
	@GetMapping("/Lotes")
	public List<Lotes>ver(){
		return x.ver();
	}
	
	@PostMapping("/Lotes")
	public Lotes registrar(@RequestBody Lotes a) {
		return x.registrar(a);
	}
	
	@PutMapping("/Lotes")
	public Lotes actualizar(@RequestBody Lotes a) {
		return x.actualizar(a);
	}
	
	@DeleteMapping("/Lotes")
	public  void eliminar(@RequestBody Lotes a) {
		x.eliminar(a);
	}
}
