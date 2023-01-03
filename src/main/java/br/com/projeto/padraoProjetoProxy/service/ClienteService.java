package br.com.projeto.padraoProjetoProxy.service;

import br.com.projeto.padraoProjetoProxy.repositoy.IClienteRepository;

public class ClienteService {

    private IClienteRepository iClienteRepositoy;

    public ClienteService(IClienteRepository iClienteRepositoy) {
        this.iClienteRepositoy = iClienteRepositoy;
    }

    public String findById(long id)  {

        return iClienteRepositoy.findById(id);

    }
    
}
