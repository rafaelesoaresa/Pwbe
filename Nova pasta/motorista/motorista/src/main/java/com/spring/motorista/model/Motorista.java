package com.spring.motorista.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Motorista implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipoHabilitacao;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataHabilitacao;

    public Motorista() {
        super();
    }

    public Motorista(Long id, String nome, String tipoHabilitacao, Date dataHabilitacao) {
        super();
        this.id = id;
        this.nome = nome;
        this.tipoHabilitacao = tipoHabilitacao;
        this.dataHabilitacao = dataHabilitacao;
    }

    // Getters e Setters para todos os campos

    @Override
    public int hashCode() {
        return Objects.hash(dataHabilitacao, id, nome, tipoHabilitacao);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Motorista other = (Motorista) obj;
        return Objects.equals(dataHabilitacao, other.dataHabilitacao) && Objects.equals(id, other.id)
                && Objects.equals(nome, other.nome) && Objects.equals(tipoHabilitacao, other.tipoHabilitacao);
    }

    @Override
    public String toString() {
        return "Motorista [id=" + id + ", nome=" + nome + ", tipoHabilitacao=" + tipoHabilitacao
                + ", dataHabilitacao=" + dataHabilitacao + "]";
    }

	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}
}
