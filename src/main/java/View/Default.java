/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Julian
 */
public class Default extends javax.swing.JFrame {

    /**
     * Creates new form Default
     */
    public Default() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        rbtnHombre = new javax.swing.JRadioButton();
        rbtnMujer = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEstatura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblKilogramos = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblConcepto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFondo.setBackground(new java.awt.Color(102, 102, 102));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Calculo de IMC");
        pnlFondo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        rbtnHombre.setText("Hombre");
        pnlFondo.add(rbtnHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        rbtnMujer.setText("Mujer");
        pnlFondo.add(rbtnMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jLabel1.setText("Estatura:");
        pnlFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel2.setText("Peso:");
        pnlFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        pnlFondo.add(txtEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 110, -1));
        pnlFondo.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 110, -1));

        btnCalcular.setText("Calcular");
        pnlFondo.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel3.setText("Cm");
        pnlFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        lblKilogramos.setText("Kg");
        pnlFondo.add(lblKilogramos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));
        pnlFondo.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 140, 20));

        jLabel4.setText("Resultado:");
        pnlFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel5.setText("Concepto:");
        pnlFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));
        pnlFondo.add(lblConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 140, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel lblConcepto;
    private javax.swing.JLabel lblKilogramos;
    public javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlFondo;
    public javax.swing.JRadioButton rbtnHombre;
    public javax.swing.JRadioButton rbtnMujer;
    public javax.swing.JTextField txtEstatura;
    public javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
