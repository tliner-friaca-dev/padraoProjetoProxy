package br.com.projeto.padraoProjetoProxy.service;

import br.com.projeto.padraoProjetoProxy.repositoy.ClienteRepositoy;

public class ClienteService {

    private ClienteRepositoy clienteRepositoy;

    public ClienteService(ClienteRepositoy clienteRepositoy) {
        this.clienteRepositoy = clienteRepositoy;
    }

    public String findById(long id)  {

        return clienteRepositoy.findById(id);

    }


    
}
