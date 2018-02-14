
import presentacion.Modelo;


public class Launcher {

    private Modelo miModelo;

    public Launcher() {
        miModelo = new Modelo();
        miModelo.iniciar();
    }
    
    public static void main(String[] args) {
        new Launcher();
    }
    
}
