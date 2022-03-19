package Facade;

public class ClienteTelefone {
    private String nome;

    public String obterNomeDoCliente(){
        return this.nome;
    }

    public ClienteTelefone(){}

    public ClienteTelefone(String nome){
        this.nome = nome;
    }
}

