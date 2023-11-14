package com.spring.motorista.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring.motorista.model.Motorista;

public interface MotoristaRepository extends CrudRepository<Motorista, Long> {

    @Query("SELECT m FROM Motorista m WHERE m.nome LIKE %:nome%")
    Iterable<Motorista> findByNome(String nome);
    
    // Adicione outras consultas personalizadas, se necessário
}
