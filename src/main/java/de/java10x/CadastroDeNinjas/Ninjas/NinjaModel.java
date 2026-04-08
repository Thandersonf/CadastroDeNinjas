package de.java10x.CadastroDeNinjas.Ninjas;

import de.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity = Transforma uma classe em uma entidade do Banco de Dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor // Cria um Construtor sem argumento
@AllArgsConstructor // Cria um Construtor com todos os argumentos
@Data // Cria todos os getters e setters
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "nome")
    private String nome;

    @Column(unique = true)

    private String email;

    @Column(name = "idade")
    private int idade;

    //Um ninja tem uma unica missão
    @ManyToOne()
    @JoinColumn(name = "missoes_id") //Foreinq key ou chave estrangeira
    private MissoesModel missoes;

}
