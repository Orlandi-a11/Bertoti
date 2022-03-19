package Observer;

import java.util.ArrayList;

public class Mercado implements subject {
    private ArrayList observers;
    private Cliente c;

    public Mercado(){
        observers = new ArrayList();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObserver(double novoPedido){
        for (int i= 0; i < observers.size(); i++ ){
            Observer observer =(Observer) observers.get(i);
        }

    }

    public double pedido (Cliente c, double valor){
        c.credito = c.credito - valor;

        notifyObserver(c.credito);
        return c.credito;
    }

}
