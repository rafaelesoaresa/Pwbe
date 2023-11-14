package com.spring.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.spring.banco.model.Carro;
import com.spring.banco.repository.CarroRepository;

@RestController

@RequestMapping("/carros")
public class CarroController {

	
	@Autowired
	private CarroRepository carroRepository;

	
	@GetMapping
	public Iterable<Carro> buscaCarros() {
		return carroRepository.findAll();
	}

	
	@GetMapping("/{id}")
	public Carro buscaCarroPorId(@PathVariable Long id) {
		return carroRepository.findById(id).orElse(null);
	}

	
	@GetMapping("/nome/{nome}")
	public Iterable<Carro> buscaCarroPorNome(@PathVariable String nome) {
		return carroRepository.findByNome(nome);
	}

	
	@PostMapping
	public Carro adicionaCarro(@RequestBody Carro carro) {
		return carroRepository.save(carro);
	}

	
	@PutMapping("/{id}")
	public Carro atualizaCarro(@PathVariable Long id, @RequestBody Carro carro) {
		carro.setId(id);
		return carroRepository.save(carro);
	}

	
	@DeleteMapping("/{id}")
	public void deletaCarro(@PathVariable Long id) {
		carroRepository.deleteById(id);
	}
}
