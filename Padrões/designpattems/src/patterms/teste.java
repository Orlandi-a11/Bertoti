package patterms;

public class teste {


    public static void main(String[] args) {
        npc garen = new npc();
        garen.setAtaque (new AtaqueEspada ());
        garen.atacarAtaque();

        System.out.println ("o cavaleiro ataca com espada");

        garen.setAtaque (new AtaqueForteEspada());
        garen.atacarAtaque();

        System.out.println ("o cavaleiro apenas ataca de espada");
        }
