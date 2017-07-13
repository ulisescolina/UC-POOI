/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import modelo.*;
import controlador.Controlador;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author toba_2_6_7
 */
public class VtnReclamosDetalle extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;
    private final Reclamo reclamo;

    /**
     * Creates new form VtnProyectos
     *
     * @param c
     * @param p
     * @param r
     */
    public VtnReclamosDetalle(Controlador c, JFrame p, Reclamo r) {
        this.controlador = c;
        this.previo = p;
        this.reclamo = r;
        initComponents();
        this.setTitle("Detalle para el Reclamo Nro. "+String.valueOf(r.getNumero()));
        reiniciarReclamosDetalle();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblArticulo = new javax.swing.JLabel();
        lblFechaEntrada = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblDescripcion = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstDetalleReclamo = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbTareaARealizar = new javax.swing.JComboBox<>();
        cmbTecnicoTareaARealizar = new javax.swing.JComboBox<>();
        btnGuardarTareaARealizar = new javax.swing.JButton();
        btnEliminarTareaARealizar = new javax.swing.JButton();
        btnNuevoTareaARealizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Articulo:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Fecha Entrada:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Descipcion");

        lblDescripcion.setEditable(false);
        lblDescripcion.setColumns(20);
        lblDescripcion.setLineWrap(true);
        lblDescripcion.setRows(5);
        jScrollPane1.setViewportView(lblDescripcion);

        lstDetalleReclamo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstDetalleReclamoValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstDetalleReclamo);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Tarea:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Técnico:");

        jLabel7.setText("Tarea(s) a realizar para solucionar el Reclamo");

        btnGuardarTareaARealizar.setText("Guardar");
        btnGuardarTareaARealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTareaARealizarActionPerformed(evt);
            }
        });

        btnEliminarTareaARealizar.setText("Eliminar");
        btnEliminarTareaARealizar.setEnabled(false);
        btnEliminarTareaARealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTareaARealizarActionPerformed(evt);
            }
        });

        btnNuevoTareaARealizar.setText("Nuevo");
        btnNuevoTareaARealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTareaARealizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblFechaEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbTareaARealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbTecnicoTareaARealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(122, 122, 122))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevoTareaARealizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarTareaARealizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarTareaARealizar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblArticulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblFechaEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTareaARealizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbTecnicoTareaARealizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoTareaARealizar)
                    .addComponent(btnEliminarTareaARealizar)
                    .addComponent(btnGuardarTareaARealizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (reclamo.isEditable()) {
            Object [] opciones ={"Si","No"};
            int confirmacion = JOptionPane.showOptionDialog(this, "Confirma que desea salir de la edicion del Reclamo, No podrá volver a agregar tareas al reclamo.", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,opciones,"No");
            // Si preciona 'Si', se procede a hacer el reclamo solo-lectura y se vuelve a hacer visible la ventana anterior 
            if (confirmacion == JOptionPane.YES_OPTION) {
                this.controlador.setReclamoSoloLectura(reclamo);
                this.previo.setVisible(true);
                this.dispose();
            } else {
            // Si presiona 'No', se cambia la operacion por defecto de la ventana para que no haga nada al precionar el boton cerrar               
                this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnGuardarTareaARealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTareaARealizarActionPerformed
        if (this.cmbTecnicoTareaARealizar.getSelectedItem() == null || this.cmbTareaARealizar.getSelectedItem() == null) {
            this.controlador.mensaje("MA", "Debe seleccionar obligatoriamente una Tarea Definida y un Empleado", "Atención");
            return;
        }
        if (!this.lstDetalleReclamo.isSelectionEmpty()) {
            TareaARealizar TAR = (TareaARealizar) this.lstDetalleReclamo.getSelectedValue();
            TareaDefinida t = (TareaDefinida) this.cmbTareaARealizar.getSelectedItem();
            Object e = (Object) this.cmbTecnicoTareaARealizar.getSelectedItem();
            this.controlador.editarTareaARealizar(reclamo, TAR, t, e);
        } else {
            TareaDefinida t = (TareaDefinida) this.cmbTareaARealizar.getSelectedItem();
            Object e = (Object) this.cmbTecnicoTareaARealizar.getSelectedItem();
            this.controlador.agregarTareaARealizar(reclamo, t, e);
        }
        reiniciarReclamosDetalle();
    }//GEN-LAST:event_btnGuardarTareaARealizarActionPerformed

    private void lstDetalleReclamoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDetalleReclamoValueChanged
        TareaARealizar TAR = (TareaARealizar) this.lstDetalleReclamo.getSelectedValue();
        if (TAR != null) {
            // Habilito el boton para eliminar
            this.btnEliminarTareaARealizar.setEnabled(true);
            // relleno los demas campos
            this.cmbTareaARealizar.setSelectedItem(TAR.getTareaDefinida());
            this.cmbTecnicoTareaARealizar.setSelectedItem(TAR.getTecnico());
            
            if (!reclamo.isEditable()) {
                this.cmbTareaARealizar.setEnabled(false);
                this.cmbTecnicoTareaARealizar.setEnabled(false);
                this.btnNuevoTareaARealizar.setEnabled(false);
                this.btnEliminarTareaARealizar.setEnabled(false);
            }
        } else {
            // desabilito el boton para eliminar
            if (reclamo.isEditable()) {
                this.btnEliminarTareaARealizar.setEnabled(false);
            }
            
        }
    }//GEN-LAST:event_lstDetalleReclamoValueChanged

    private void btnNuevoTareaARealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTareaARealizarActionPerformed
        reiniciarReclamosDetalle();
    }//GEN-LAST:event_btnNuevoTareaARealizarActionPerformed

    private void btnEliminarTareaARealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTareaARealizarActionPerformed
        TareaARealizar tar = (TareaARealizar) this.lstDetalleReclamo.getSelectedValue();
        if (tar != null) {
            int transaccion = this.controlador.eliminarTareaARealizar(tar);
            if (transaccion != 0) {
                if (transaccion == 2) {
                    this.controlador.mensaje("MA", "Una vez finalizada, la tarea ya no puede ser borrada", "Atención");
                } else if (transaccion == 1) {
                    this.controlador.mensajeErrorPersistencia("EPE", "la ", "tarea a realizar", "Error de Persistencia");
                }
            }
        }
        reiniciarReclamosDetalle();            
    }//GEN-LAST:event_btnEliminarTareaARealizarActionPerformed
    
    private void reiniciarReclamosDetalle(){
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        this.lblArticulo.setText(reclamo.getArticulo().toString());
        this.lblFechaEntrada.setText(f.format(reclamo.getFechaEntrada()));
        this.lblDescripcion.setText(reclamo.getDescProblema());
        this.lstDetalleReclamo.setListData(reclamo.getTareas().toArray());
        /*Combo tareas para el tipo de articulo*/
        DefaultComboBoxModel mCmbTipoArticulo = new DefaultComboBoxModel(this.reclamo.getArticulo().getTipoDeArticulo().getTareasDefinidasAsociadas().toArray());
        this.cmbTareaARealizar.setModel(mCmbTipoArticulo);
        this.cmbTareaARealizar.setSelectedIndex(-1);
        
        /*combo tecnicos con especialidad en ese tipo de articulo*/
        DefaultComboBoxModel mCmbTecnicosCapacitados = new DefaultComboBoxModel(this.reclamo.getArticulo().getTipoDeArticulo().getTecnicos().toArray());
        this.cmbTecnicoTareaARealizar.setModel(mCmbTecnicosCapacitados);
        this.cmbTecnicoTareaARealizar.setSelectedIndex(-1);
        
        if (!reclamo.isEditable() || reclamo.getFechaFin() != null) {
            this.btnGuardarTareaARealizar.setEnabled(false);
            this.btnNuevoTareaARealizar.setEnabled(false);
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarTareaARealizar;
    private javax.swing.JButton btnGuardarTareaARealizar;
    private javax.swing.JButton btnNuevoTareaARealizar;
    private javax.swing.JComboBox<String> cmbTareaARealizar;
    private javax.swing.JComboBox<String> cmbTecnicoTareaARealizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblArticulo;
    private javax.swing.JTextArea lblDescripcion;
    private javax.swing.JLabel lblFechaEntrada;
    private javax.swing.JList lstDetalleReclamo;
    // End of variables declaration//GEN-END:variables
}
