package br.com.projeto.padraoProjetoProxy.repositoy;

public class ClienteRepositoryLogProxy implements IClienteRepository {

    @Override
    public String findById(long id) {

        String retorno = "";
        
        retorno = "Log antes - ";
        retorno += new ClienteRepository().findById(id);
        retorno += " - Log após";

        return retorno;

    }

}
