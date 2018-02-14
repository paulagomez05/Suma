package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    private final VistaPrincipal ventana;

    public Controlador(VistaPrincipal aThis) {
        ventana = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object componente = e.getSource();

        if (componente == ventana.getBtnRestar()) {
            ventana.getMiModelo().restar();
        }

        if (componente == ventana.getBtnSumar()) {
            ventana.getMiModelo().sumar();
        }

        if (componente == ventana.getBtnMultiplicar()) {
            ventana.getMiModelo().multiplicar();
        }

        if (componente == ventana.getBtnDividir()) {
            ventana.getMiModelo().dividir();
        }

    }

}
