package de.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninja")
public class NinjaController {
    @GetMapping("/boasVindas")
    public String boasVindas(){
        return " Essa é minha primeira mensagem";


        }
        //Adicionar ninja(CREATE)
         @PostMapping("/criar")
         public String criarNinja(@RequestBody NinjaModel ninja) {
             return "Ninja criado";
         }

        //Mostrar todos os Ninjas(READ)
         @GetMapping("/listar")
         public String mostrarTodosOsNinjas(){
            return "Mostrar todos os Ninjas";}

        //Mostrar ninjas por ID(READ)

         @GetMapping("/listarID")
         public String mostrarNinjasPorID(){
            return "Mostrar Ninja por ID";}

        //Alterar dados do Ninja(UPDATE)
        @PutMapping("/alterar")
        public String alterarNinjaPorID(){
             return "Alterar Ninja por ID";}

        //Deletar Ninja(DELETE)
        @DeleteMapping("/deletarId")
        public String deletarNinjaPorID(){
            return "Ninja deletado por ID";
}
    }

