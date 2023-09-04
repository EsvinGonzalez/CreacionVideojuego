public class Juego {
    public static void main(String[] args){
        FabricaPersonajes fabricaGuerrero = new FabricaGuerrero();
        FabricaEnemigos fabricaEnemigoNormal = new FabricaEnemigoNormal();
        FabricaEnemigoJefe fabricaEnemigoJefe = new FabricaEnemigoJefe();

        Personaje jugador = fabricaGuerrero.crearPersonaje();
        Enemigo enemigo = fabricaEnemigoNormal.crearEnemigo();

        jugador.atacar();
        enemigo.recibirDaño();
        enemigo.atacar();
        jugador.recibirDaño();
    }
}
