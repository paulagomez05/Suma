package presentacion;

import logica.Operaciones;

public class Modelo {

    private VistaPrincipal ventana;
    private Operaciones sistema;
    private float resultado;

    public VistaPrincipal getVentana() {
        if (ventana == null) {
            ventana = new VistaPrincipal(this);
        }
        return ventana;
    }

    public Operaciones getSistema() {
        if (sistema == null) {
            sistema = new Operaciones();
        }
        return sistema;
    }

    public void iniciar() {
        getVentana().setSize(500, 350);
        getVentana().setVisible(true);
    }

    public void enviarDatos() {

        float n1, n2;
        n1 = Float.parseFloat(getVentana().getTxtNumero1().getText());
        n2 = Float.parseFloat(getVentana().getTxtNumero2().getText());

        getSistema().setN1(n1);
        getSistema().setN2(n2);
    }

    public void sumar() {

        enviarDatos();
        resultado = getSistema().sumar();
        getVentana().getLblResultado().setText("El resultado es: " + resultado);

    }

    public void restar() {

        enviarDatos();
        resultado = getSistema().restar();
        getVentana().getLblResultado().setText("El resultado es: " + resultado);

    }

    public void multiplicar() {

        enviarDatos();
        resultado = getSistema().multiplicar();
        getVentana().getLblResultado().setText("El resultado es: " + resultado);

    }

    public void dividir() {

        enviarDatos();
        resultado = getSistema().dividir();
        getVentana().getLblResultado().setText("El resultado es: " + resultado);

    }

}
