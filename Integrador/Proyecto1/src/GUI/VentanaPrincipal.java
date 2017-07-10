/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import controlador.Controlador;

/**
 *
 * @author toba_2_6_7
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private final Controlador controlador;
    /**
     * Creates new form VentanaPrincipal
     * @param c
     */
    public VentanaPrincipal(Controlador c) {
        this.controlador = c;
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

        tlb_principal = new javax.swing.JToolBar();
        btnReclamos = new javax.swing.JButton();
        btnArticulos = new javax.swing.JButton();
        btnTecnicos = new javax.swing.JButton();
        btnConfiguraciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de Reclamos");

        tlb_principal.setRollover(true);

        btnReclamos.setText("Reclamos");
        btnReclamos.setFocusable(false);
        btnReclamos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReclamos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReclamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReclamosActionPerformed(evt);
            }
        });
        tlb_principal.add(btnReclamos);

        btnArticulos.setText("Articulos");
        btnArticulos.setFocusable(false);
        btnArticulos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnArticulos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticulosActionPerformed(evt);
            }
        });
        tlb_principal.add(btnArticulos);

        btnTecnicos.setText("Tecnicos");
        btnTecnicos.setFocusable(false);
        btnTecnicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTecnicos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTecnicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecnicosActionPerformed(evt);
            }
        });
        tlb_principal.add(btnTecnicos);

        btnConfiguraciones.setText("Parámetros");
        btnConfiguraciones.setFocusable(false);
        btnConfiguraciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfiguraciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConfiguraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionesActionPerformed(evt);
            }
        });
        tlb_principal.add(btnConfiguraciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tlb_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tlb_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("Proyecto integrador para la catedra de Programacion Orientada a Objetos 1 referente a la Gestion de Reclamos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfiguracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionesActionPerformed
        VtnConfiguraciones vc = new VtnConfiguraciones(this.controlador, this);
        this.setVisible(false);
        vc.setLocationRelativeTo(null);
        vc.setResizable(false);
        vc.setVisible(true);
    }//GEN-LAST:event_btnConfiguracionesActionPerformed

    private void btnArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticulosActionPerformed
        VtnArticulos va = new VtnArticulos(this.controlador, this);
        this.setVisible(false);
        va.setLocationRelativeTo(null);
        va.setResizable(false);
        va.setVisible(true);
    }//GEN-LAST:event_btnArticulosActionPerformed

    private void btnReclamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReclamosActionPerformed
        VtnReclamosPrincipal vrp = new VtnReclamosPrincipal(this.controlador, this);
        this.setVisible(false);
        vrp.setLocationRelativeTo(null);
        vrp.setResizable(false);
        vrp.setVisible(true);
    }//GEN-LAST:event_btnReclamosActionPerformed

    private void btnTecnicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecnicosActionPerformed
        VtnTecnicosPrincipal vtp = new VtnTecnicosPrincipal(this.controlador, this);
        this.setVisible(false);
        vtp.setLocationRelativeTo(null);
        vtp.setResizable(false);
        vtp.setVisible(true);
    }//GEN-LAST:event_btnTecnicosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArticulos;
    private javax.swing.JButton btnConfiguraciones;
    private javax.swing.JButton btnReclamos;
    private javax.swing.JButton btnTecnicos;
    private javax.swing.JToolBar tlb_principal;
    // End of variables declaration//GEN-END:variables
}
