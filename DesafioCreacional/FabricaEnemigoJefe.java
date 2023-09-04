public class FabricaEnemigoJefe extends FabricaEnemigoNormal {
    @Override
    public Enemigo crearEnemigo() {
        return new EnemigoJefe();
    }
}


