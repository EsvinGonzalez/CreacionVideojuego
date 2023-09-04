public class Jugador implements Personaje {
    @Override
    public void atacar() {
        System.out.println("jugador atacando al enemigo");

    }

    @Override
    public void recibirDaño() {
        System.out.println("jugador recibe daño");
    }
}
