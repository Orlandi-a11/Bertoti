package Estrategia;

public class Teste {
    public static void main(String[] args) {

        Cliente Orlando = new Cliente();
        Orlando.setCompra(new CompraComum());
        Orlando.realizarCompra();
        System.out.println("--------------------------------");
    }
}