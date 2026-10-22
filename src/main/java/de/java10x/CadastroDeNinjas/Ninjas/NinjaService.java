package de.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }
    //Listar todos os ninjas
    public List<NinjaModel> listarNinjas(){

        return ninjaRepository.findAll();
    }

    public List<NinjaModel> ordenarNinjasId(){
        return ninjaRepository.findAllByOrderById();
    }

    public NinjaModel listarNinjasID(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
            return ninjaPorId.orElse(null);
    }
}
