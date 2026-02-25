package de.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

// Entity = Transforma uma classe em uma entidade do Banco de Dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String nome;
    private String email;
    private int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
}
