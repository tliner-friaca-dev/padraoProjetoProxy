package br.com.projeto.padraoProjetoProxy.repositoy;

public class ClienteRepository implements IClienteRepository {

    @Override
    public String findById(long id) {

        return "Busca realizada pelo id";

    }
    
}
