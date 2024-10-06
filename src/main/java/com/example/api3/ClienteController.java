// Crie um endpoint para retornar uma lista de clientes

package com.example.api3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController  // esta linha é para decalara que  essa classe é um controle
@RequestMapping("/user") // para definir a uri que acessa a este controller

public class ClienteController {

    //atributo

    ArrayList<Cliente> listaCliente = new ArrayList<>();


    //construtor do controller
    public ClienteController() {


        instanciandoClientes();
    }

    //Metodo que a gente ta chamando no construtor

    public void instanciandoClientes() {

        Cliente cliente1 = new Cliente("Jefferson", 39, "Sorocaba");
        Cliente cliente2 = new Cliente("Isabella", 7, "Sorocaba");
        Cliente cliente3 = new Cliente("Caio", 39, "Sao paulo");
        Cliente cliente4 = new Cliente("Wilson", 40, "Santos");

        listaCliente.add(cliente1);
        listaCliente.add(cliente2);
        listaCliente.add(cliente3);
        listaCliente.add(cliente4);

        //GET ALL PARA LISTA DE CLIENTES RE|TORNA A LISTA


    }

 // Exibir retorno
    @GetMapping("/getAll")
    public ArrayList<Cliente>exibir(){
        return listaCliente;
    }


}
