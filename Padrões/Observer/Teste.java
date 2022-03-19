package Observer;

public class Teste {




    public static void main(String[] args){

        Cliente c = new Cliente();
        TelaMercado tela = new TelaMercado();
        TelaCliente telac = new TelaCliente();

        cr.registerObserver(tela);
        cr.registerObserver(telac);

        Cliente joao = new Cliente(500.0);

        joao.credito = cr.credito( joao, 800.0);
    }
}

