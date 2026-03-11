package de.java10x.CadastroDeNinjas.Missoes;

import de.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nomeDaMissao;

    private String dificuldade;

    //Uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;
}
