package de.java10x.CadastroDeNinjas.Missoes;

//LOCALHOST:8080

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes") // Mapear a API
public class MissoesController {

    // POST -- Mandar uma requisição para criar as missoes
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada com sucesso";
    }
    // PUT -- Mandar uma requisição para alterar as missoes
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada com sucesso";
    }
    // DELETE -- Mandar uma requisicao para deletar a(s) missoes
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada com sucesso";
    }

    // GET -- Mandar uma requisição para mostrar as missoes
    @GetMapping("/listar")
    public String listarMissoes(){
        return "Missoes listadas com sucesso";
    }

}
