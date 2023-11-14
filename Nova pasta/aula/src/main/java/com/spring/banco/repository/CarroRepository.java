package com.spring.banco.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.spring.banco.model.Carro;


 
public interface CarroRepository extends CrudRepository<Carro, Long> {
    @Query("SELECT c FROM Carro c WHERE c.nome LIKE %:nome%")
	Iterable<Carro> findByNome(String nome);
}
