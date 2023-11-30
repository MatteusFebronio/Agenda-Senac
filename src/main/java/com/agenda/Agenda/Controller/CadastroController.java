package com.agenda.Agenda.Controller;


import com.agenda.Agenda.model.Cliente;
import com.agenda.Agenda.dao.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class CadastroController {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/cadastro")
    public String abrir(Cliente cliente){
        return "cadastro";
    }


    @PostMapping("/cadastrar_cliente")
    public String cadastro(Cliente cliente) {
        clienteRepository.save(cliente);

        //realiza cadastro
        return "index";
    }
}
