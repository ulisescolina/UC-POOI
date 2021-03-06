/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import modelo.*;
import controlador.Controlador;
import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author toba_2_6_7
 */
public class VtnTecnicosPrincipal extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;

    /**
     * Creates new form VtnProyectos
     *
     * @param c
     * @param p
     */
    public VtnTecnicosPrincipal(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        initComponents();
        reiniciarTecnicosPrincipal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEmpleados = new javax.swing.JList();
        cmbTipoTecnico = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtNombresTecnico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDU = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidosTecnico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblRemuneracion = new javax.swing.JLabel();
        txtRemuneracion = new javax.swing.JTextField();
        btnGuardarTecnico = new javax.swing.JButton();
        btnEliminarTecnico = new javax.swing.JButton();
        btnNuevoTecnico = new javax.swing.JButton();
        btnEditarDetallesTecnico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tecnicos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lstEmpleados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEmpleadosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEmpleados);

        cmbTipoTecnico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado Mensual", "Empleado Jornalero" }));
        cmbTipoTecnico.setSelectedIndex(-1);
        cmbTipoTecnico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoTecnicoItemStateChanged(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombres: ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Documento Único: ");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellidos: ");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Tipo técnico: ");

        lblRemuneracion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRemuneracion.setText("Remuneración: ");

        btnGuardarTecnico.setText("Guardar");
        btnGuardarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTecnicoActionPerformed(evt);
            }
        });

        btnEliminarTecnico.setText("Eliminar");
        btnEliminarTecnico.setEnabled(false);
        btnEliminarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTecnicoActionPerformed(evt);
            }
        });

        btnNuevoTecnico.setText("Nuevo");
        btnNuevoTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTecnicoActionPerformed(evt);
            }
        });

        btnEditarDetallesTecnico.setText("Editar detalles de Tecnico");
        btnEditarDetallesTecnico.setEnabled(false);
        btnEditarDetallesTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDetallesTecnicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidosTecnico)
                            .addComponent(txtNombresTecnico)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTipoTecnico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDU)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRemuneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarDetallesTecnico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRemuneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevoTecnico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarTecnico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarTecnico)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombresTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidosTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRemuneracion)
                    .addComponent(txtRemuneracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarDetallesTecnico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminarTecnico)
                        .addComponent(btnNuevoTecnico))
                    .addComponent(btnGuardarTecnico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoTecnicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoTecnicoItemStateChanged
        if (this.cmbTipoTecnico.getSelectedItem() != null) {
            String s = this.cmbTipoTecnico.getSelectedItem().toString();
            if (s.toUpperCase().equals("EMPLEADO MENSUAL")) {
                this.lblRemuneracion.setText("Sueldo Mensual: ");
            } else {
                this.lblRemuneracion.setText("Tarifa por Hora: ");
            }
        }
    }//GEN-LAST:event_cmbTipoTecnicoItemStateChanged

    private void btnGuardarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTecnicoActionPerformed
        if (this.txtNombresTecnico.getText().isEmpty()) {
            this.controlador.mensaje("MA", "Debe establecer el/los nombre/s del empleado obligatoriamente.", "Atención");
            return;
        }
        
        if (this.txtApellidosTecnico.getText().isEmpty()) {
            this.controlador.mensaje("MA", "Debe establecer el/los apellido/s del empleado obligatoriamente.", "Atención");
            return;
        }
        
        if (this.txtDU.getText().isEmpty()) {
            this.controlador.mensaje("MA", "Debe establecer el documento único del empleado obligatoriamente.", "Atención");
            return;
        }
        
        if (this.txtRemuneracion.getText().isEmpty()) {
            this.controlador.mensaje("MA", "Debe establecer el valor de la remuneración obligatoriamente.", "Atención");
            return;
        }
        
        if (this.cmbTipoTecnico.getSelectedItem() == null) {
                this.controlador.mensaje("MA", "Es OBLIGATORIO que defina el Tipo de Técnico que está Creando/Editando", "Advertencia");
                return;
        }
        if (!this.lstEmpleados.isSelectionEmpty()) {
            try{
                Object ej = (Object) this.lstEmpleados.getSelectedValue();
                String nNombres = this.txtNombresTecnico.getText();
                String nApellidos = this.txtApellidosTecnico.getText();
                String TT = this.cmbTipoTecnico.getSelectedItem().toString();
                String nDU = this.txtDU.getText();
                Double nRemuneracion = Double.valueOf(this.txtRemuneracion.getText());
                this.controlador.editarTecnico(ej, nNombres, nApellidos, nDU, TT, nRemuneracion);
            } catch (java.lang.NumberFormatException nfe) {
                this.controlador.mensaje("MA", "Por vavor ingrese un valor numerico en el campo de remuneracion", "Atención");
                return;
            }
        } else {
            try{
                String nNombres = this.txtNombresTecnico.getText();
                String nApellidos = this.txtApellidosTecnico.getText();
                String nDU = this.txtDU.getText();
                Double nRemuneracion = Double.valueOf(this.txtRemuneracion.getText());
                String TT = this.cmbTipoTecnico.getSelectedItem().toString();
                this.controlador.agregarTecnico(nNombres, nApellidos, nDU, TT, nRemuneracion);
            } catch (java.lang.NumberFormatException nfe) {
                this.controlador.mensaje("MA", "Por vavor ingrese un valor numerico en el campo de remuneracion", "Atención");
                return;
            }
        }
        reiniciarTecnicosPrincipal();
    }//GEN-LAST:event_btnGuardarTecnicoActionPerformed

    private void lstEmpleadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEmpleadosValueChanged
        Object t = this.lstEmpleados.getSelectedValue();
        if (t != null) {
            // Habilito los botones
            this.btnEliminarTecnico.setEnabled(true);
            this.btnEditarDetallesTecnico.setEnabled(true);
            
            if (t instanceof EmpleadoJornalero) {
                EmpleadoJornalero EJ = (EmpleadoJornalero) t;
                String apellidos = EJ.getApellidos(); String nombres = EJ.getNombre(); String DU = EJ.getDocumentoUnico(); double tarifa = EJ.getTarifaPorHora();
                this.txtApellidosTecnico.setText(apellidos);
                this.txtNombresTecnico.setText(nombres);
                this.txtDU.setText(DU);
                this.cmbTipoTecnico.setSelectedIndex(1);
                this.txtRemuneracion.setText(String.valueOf(tarifa));
            } else if (t instanceof EmpleadoMensual) {
                EmpleadoMensual EM = (EmpleadoMensual) t;
                String apellidos = EM.getApellidos(); String nombres = EM.getNombre(); String DU = EM.getDocumentoUnico(); double sueldo = EM.getSueldoMensual();
                this.txtApellidosTecnico.setText(apellidos);
                this.txtNombresTecnico.setText(nombres);
                this.txtDU.setText(DU);
                this.cmbTipoTecnico.setSelectedIndex(0);
                this.txtRemuneracion.setText(String.valueOf(sueldo));
            }
        } else {
            // Desabilito los botones
            this.btnEliminarTecnico.setEnabled(false);
            this.btnEditarDetallesTecnico.setEnabled(false);
        }
    }//GEN-LAST:event_lstEmpleadosValueChanged

    private void btnNuevoTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTecnicoActionPerformed
        reiniciarTecnicosPrincipal();
    }//GEN-LAST:event_btnNuevoTecnicoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.previo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnEliminarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTecnicoActionPerformed
        Object t = (Object) this.lstEmpleados.getSelectedValue();
        if (t != null) {
            int transaccion = this.controlador.eliminarTecnico(t);
            if (transaccion != 0) {
                this.controlador.mensajeErrorPersistencia("EPE", "el ", "tecnico", "Error de Base de Datos");
            }
            reiniciarTecnicosPrincipal();
        }
    }//GEN-LAST:event_btnEliminarTecnicoActionPerformed

    private void btnEditarDetallesTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDetallesTecnicoActionPerformed
        Object t = (Object) this.lstEmpleados.getSelectedValue();
        VtnTecnicoDetalle vtd = new VtnTecnicoDetalle(this.controlador, this, t);
        this.setVisible(false);
        vtd.setLocationRelativeTo(null);
        vtd.setResizable(false);
        vtd.setVisible(true);
    }//GEN-LAST:event_btnEditarDetallesTecnicoActionPerformed

    private void reiniciarTecnicosPrincipal(){
        this.lstEmpleados.setListData(this.controlador.listarTecnicos().toArray());
        this.txtApellidosTecnico.setText("");
        this.txtNombresTecnico.setText("");
        this.txtDU.setText("");
        this.txtRemuneracion.setText("");
        this.cmbTipoTecnico.setSelectedIndex(-1);
        this.lblRemuneracion.setText("Remuneración: ");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarDetallesTecnico;
    private javax.swing.JButton btnEliminarTecnico;
    private javax.swing.JButton btnGuardarTecnico;
    private javax.swing.JButton btnNuevoTecnico;
    private javax.swing.JComboBox<String> cmbTipoTecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRemuneracion;
    private javax.swing.JList lstEmpleados;
    private javax.swing.JTextField txtApellidosTecnico;
    private javax.swing.JTextField txtDU;
    private javax.swing.JTextField txtNombresTecnico;
    private javax.swing.JTextField txtRemuneracion;
    // End of variables declaration//GEN-END:variables
}
