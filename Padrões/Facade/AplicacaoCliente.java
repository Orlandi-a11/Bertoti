package Facade;

public class AplicacaoCliente {
    public static void main(String[] args) {
        ClienteTelefone cliente = new ClienteTelefone("Orlando Seixas ,Moraes");
        ContaTelefone conta = new ContaTelefone("988078");

        fachada facade = new fachada();
        facade.fazerRecarga(150, cliente, conta);
    }
}


