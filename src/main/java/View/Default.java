/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.ButtonGroup;

/**
 *
 * @author Julian
 * @version 1.0.0
 * @since 16/10/2020
 */
public class Default extends javax.swing.JFrame {

    /**
     * Creates new form Default
     */
    public Default() {
        initComponents();
        grupoRadioBotones();
        ocultarPaneles();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        pnlFondo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        rbtnHombre = new javax.swing.JRadioButton();
        rbtnMujer = new javax.swing.JRadioButton();
        pnlCalcular = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEstatura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lblKilogramos = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        pnlResultado = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblConcepto = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFondo.setBackground(new java.awt.Color(102, 102, 102));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Calculo de IMC");
        pnlFondo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        rbtnHombre.setBackground(new java.awt.Color(102, 102, 102));
        rbtnHombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnHombre.setForeground(new java.awt.Color(255, 255, 255));
        rbtnHombre.setText("Hombre");
        pnlFondo.add(rbtnHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        rbtnMujer.setBackground(new java.awt.Color(102, 102, 102));
        rbtnMujer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnMujer.setForeground(new java.awt.Color(255, 255, 255));
        rbtnMujer.setText("Mujer");
        pnlFondo.add(rbtnMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        pnlCalcular.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estatura:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cm");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Peso:");

        lblKilogramos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblKilogramos.setForeground(new java.awt.Color(255, 255, 255));
        lblKilogramos.setText("Kg");

        btnCalcular.setBackground(new java.awt.Color(0, 0, 0));
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");

        javax.swing.GroupLayout pnlCalcularLayout = new javax.swing.GroupLayout(pnlCalcular);
        pnlCalcular.setLayout(pnlCalcularLayout);
        pnlCalcularLayout.setHorizontalGroup(
            pnlCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCalcularLayout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(216, 216, 216))
            .addGroup(pnlCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCalcularLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(pnlCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCalcularLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(15, 15, 15)
                            .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel3))
                        .addGroup(pnlCalcularLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(33, 33, 33)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblKilogramos)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlCalcularLayout.setVerticalGroup(
            pnlCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCalcularLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(33, 33, 33))
            .addGroup(pnlCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCalcularLayout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addGroup(pnlCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(20, 20, 20)
                    .addGroup(pnlCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblKilogramos))
                    .addGap(0, 93, Short.MAX_VALUE)))
        );

        pnlFondo.add(pnlCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 530, 160));

        pnlResultado.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Resultado:");

        lblResultado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Concepto:");

        lblConcepto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout pnlResultadoLayout = new javax.swing.GroupLayout(pnlResultado);
        pnlResultado.setLayout(pnlResultadoLayout);
        pnlResultadoLayout.setHorizontalGroup(
            pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResultadoLayout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
            .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlResultadoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(pnlResultadoLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(30, 30, 30)
                            .addComponent(lblConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlResultadoLayout.setVerticalGroup(
            pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlResultadoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(55, 55, 55)
                    .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(lblConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnlFondo.add(pnlResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 570, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblConcepto;
    private javax.swing.JLabel lblKilogramos;
    public javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JPanel pnlCalcular;
    private javax.swing.JPanel pnlFondo;
    public javax.swing.JPanel pnlResultado;
    public javax.swing.JRadioButton rbtnHombre;
    public javax.swing.JRadioButton rbtnMujer;
    public javax.swing.JTextField txtEstatura;
    public javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
    
    //Metodo que asocia los radiobotones en un grupo
    public void grupoRadioBotones(){
        
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        
        grupoRadioBotones.add(rbtnMujer);
        grupoRadioBotones.add(rbtnHombre);
    }

    //Método para ocultar los panesles de calcular y resultado
    private void ocultarPaneles() {
    
        pnlCalcular.setVisible(false);
        pnlResultado.setVisible(false);
    }
}
