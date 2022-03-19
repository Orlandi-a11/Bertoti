package Observer;

public class TelaMercado extends Observer {

        public void update(double credito){

            display(credito);
        }
        public void display (double cr){
            System.out.println("suas compras");
            System.out.println("Seu credito é: "+cr);

        }

}
