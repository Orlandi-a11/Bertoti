package Facade;

public class fachada {
    private ClienteTelefone cliente;
    private ContaTelefone conta;

    public fachada() {
        this.cliente = new ClienteTelefone();
        this.conta = new ContaTelefone();
    }

    public void fazerRecarga(int quantidade, ClienteTelefone cliente, ContaTelefone conta){
        System.out.printf("Olá, o beneficiário de seu depósito é o(a) cliente %s\n",cliente.obterNomeDoCliente());
        System.out.printf("Você escolheu a conta %s\n", conta.obterNumConta());
        System.out.printf("O Credito desta conta é: %d\n", conta.obterCredito());
        System.out.printf("Você está recarregando R$ %s\n", quantidade);
        conta.setCredito(conta.getCredito() + quantidade);
        System.out.printf("Depositado R$ %d na conta de %s\n",quantidade, cliente.obterNomeDoCliente());
        System.out.printf("A quantia de Credito desta conta é: R$ %s\n", conta.obterCredito());
    }

    public ClienteTelefone getCliente() {
        return cliente;
    }

    public void setCliente(ClienteTelefone cliente) {
        this.cliente = cliente;
    }

    public ContaTelefone getConta() {
        return conta;
    }

    public void setConta(ContaTelefone conta) {
        this.conta = conta;
    }
}

