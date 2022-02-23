package patterms;

public class npc {
    private Ataque atacar;

    public void setAtaque(Ataque atacar) {
        this.atacar = atacar;
    }

    public void atacarAtaque() {
        this.atacar.atacar();
    }


}
