public class EnemigoNormal implements Enemigo {
    @Override
    public void atacar() {
        System.out.println("enemigo normal esta atacando al jugador");
    }

    @Override
    public void recibirDaño() {
        System.out.println("enemigo normal esta recibiendo daño");
    }
}
