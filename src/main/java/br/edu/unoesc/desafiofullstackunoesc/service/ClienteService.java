package br.edu.unoesc.desafiofullstackunoesc.service;

import org.springframework.stereotype.Service;

import br.edu.unoesc.desafiofullstackunoesc.model.Cliente;
import br.edu.unoesc.desafiofullstackunoesc.repository.ClienteRepository;

@Service
public class ClienteService {
    
    //@Autowired
    ClienteRepository clienteRepository;

    public void SalvarCliente(Cliente cli){
        clienteRepository.save(cli);
    }
    
}
