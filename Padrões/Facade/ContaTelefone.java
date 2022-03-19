package Facade;

public class ContaTelefone {
    private String conta;
    private int Credito;

    public int depositar(int valor) {
        System.out.println("Depositando...");
        return this.setCredito(this.getCredito() + valor);
    }

    public String obterNumConta() {
        System.out.println("Obtendo número de conta...");
        return this.conta;
    }

    public int obterCredito() {
        System.out.println("Obtendo Credito...");
        return this.getCredito();
    }

    public ContaTelefone() {
    }

    public ContaTelefone(String conta) {
        this.conta = conta;
    }


    public int getCredito() {
        return Credito;
    }

    public int setCredito(int Credito) {
        this.Credito = Credito;
        return Credito;
    }
}
