package patterms;

public class teste {


      public static void main(String[] args) {
        npc Garen = new npc();
        Garen.setAtaque (new Ataque() {
            @Override
            public void atacar() {
                
            }
        });
        Garen.atacarAtaque();

        System.out.println("o cavaleiro ataca com espada");

    }

}
