package Observer;

public class TelaCliente extends Observer {
    public void update(double credito){
        display(credito);
    }

    public void display (double cr){

        System.out.println("Tela de credito");
        System.out.println("Voce acaba de fazer um pedido");

    }


}


