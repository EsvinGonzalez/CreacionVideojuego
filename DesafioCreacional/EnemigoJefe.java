public class EnemigoJefe implements Enemigo {
    @Override
    public void atacar() {
        System.out.println("enemigo jefe atacando al jugador");
    }

    @Override
    public void recibirDaño() {
        System.out.println("enemigo jefe recibiendo daño");

    }
}
