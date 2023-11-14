package com.spring.motorista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.motorista.model.Motorista;
import com.spring.motorista.repository.MotoristaRepository;

@RestController
@RequestMapping("/motoristas")
public class MotoristaController {

    @Autowired
    private MotoristaRepository motoristaRepository;

    @GetMapping
    public Iterable<Motorista> buscaMotoristas() {
        return motoristaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Motorista buscaMotoristaPorId(@PathVariable Long id) {
        return motoristaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Motorista adicionaMotorista(@RequestBody Motorista motorista) {
        return motoristaRepository.save(motorista);
    }

    @PutMapping("/{id}")
    public Motorista atualizaMotorista(@PathVariable Long id, @RequestBody Motorista motorista) {
        motorista.setId(id);
        return motoristaRepository.save(motorista);
    }

    @DeleteMapping("/{id}")
    public void deletaMotorista(@PathVariable Long id) {
        motoristaRepository.deleteById(id);
    }
}
