
package presentacion;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class VistaPrincipal extends javax.swing.JFrame {

    private Modelo miModelo;
    private Controlador control;
    
    public VistaPrincipal(Modelo m) {
        miModelo = m;
        initComponents();
        capturarEventos();
    }

    public Modelo getMiModelo() {
        return miModelo;
    }

    
    public Controlador getControl() {
        if(control == null){
            control = new Controlador(this);
        }
        return control;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumero2 = new javax.swing.JTextField();
        txtNumero1 = new javax.swing.JTextField();
        btnSumar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        btnRestar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Numero 2:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 80, 70, 30);

        jLabel2.setText("Numero 1:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(21, 44, 70, 30);
        getContentPane().add(txtNumero2);
        txtNumero2.setBounds(90, 80, 200, 30);
        getContentPane().add(txtNumero1);
        txtNumero1.setBounds(90, 40, 200, 30);

        btnSumar.setText("Sumar");
        getContentPane().add(btnSumar);
        btnSumar.setBounds(40, 130, 200, 40);

        lblResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblResultado);
        lblResultado.setBounds(110, 240, 270, 30);

        btnRestar.setText("Restar");
        getContentPane().add(btnRestar);
        btnRestar.setBounds(260, 130, 200, 40);

        btnMultiplicar.setText("Multiplicar");
        getContentPane().add(btnMultiplicar);
        btnMultiplicar.setBounds(40, 183, 200, 40);

        btnDividir.setText("Dividir");
        getContentPane().add(btnDividir);
        btnDividir.setBounds(260, 180, 200, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
        btnSumar.addActionListener(getControl());
        btnRestar.addActionListener(getControl());
        btnDividir.addActionListener(getControl());
        btnMultiplicar.addActionListener(getControl());
    }

    public JButton getBtnDividir() {
        return btnDividir;
    }

    public JButton getBtnMultiplicar() {
        return btnMultiplicar;
    }

    public JButton getBtnSumar() {
        return btnSumar;
    }

    public JButton getBtnRestar() {
        return btnRestar;
    }

    public JLabel getLblResultado() {
        return lblResultado;
    }

    public JTextField getTxtNumero1() {
        return txtNumero1;
    }

    public JTextField getTxtNumero2() {
        return txtNumero2;
    }
    
    
}
