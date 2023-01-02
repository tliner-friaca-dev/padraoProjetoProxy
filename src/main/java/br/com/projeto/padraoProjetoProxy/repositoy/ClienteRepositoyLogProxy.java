package br.com.projeto.padraoProjetoProxy.repositoy;

public class ClienteRepositoyLogProxy extends ClienteRepositoy {

    @Override
    public String findById(long id) {

        String retorno = "";
        
        retorno = "Log antes - ";
        retorno += super.findById(id);
        retorno += " - Log após";

        return retorno;
    } 


}
