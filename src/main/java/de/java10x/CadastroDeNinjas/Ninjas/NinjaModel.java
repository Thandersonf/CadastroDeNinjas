package de.java10x.CadastroDeNinjas.Ninjas;

import de.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

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

    //Um ninja tem uma unica missão
    @ManyToOne()
    @JoinColumn(name = "missoes_id") //Foreinq key ou chave estrangeira
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
}
