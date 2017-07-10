/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import controlador.Controlador;
import java.util.Date;
import javax.swing.JFrame;
import modelo.*;

/**
 *
 * @author toba_2_6_7
 */
public class VtnTiempoIvertido extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;
    private final TareaARealizar tarea;

    /**
     * Creates new form VtnTiempoIvertido
     *
     * @param c
     * @param p
     * @param tar
     */
    public VtnTiempoIvertido(Controlador c, JFrame p, TareaARealizar tar) {
        this.controlador = c;
        this.previo = p;
        this.tarea = tar;
        initComponents();
        this.setTitle("Detalle de tiempo para reclamo Nro"+tarea.getReclamo().toString()+"para tarea: "+tarea.getTareaDefinida().toString());
        reiniciarTiemposInvertidos();
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
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        lblTareaARealizar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstTiempos = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spnFecha = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCatnHoras = new javax.swing.JTextPane();
        btnAgregarTI = new javax.swing.JButton();
        btnEliminarTI = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Tarea a Realizar: ");

        lblTareaARealizar.setText(" ");

        lstTiempos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTiemposValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstTiempos);

        jLabel2.setText("Tiempos invertidos");

        jLabel3.setText("Fecha");

        jLabel4.setText("Horas Invertidas");

        spnFecha.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(), new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));

        jScrollPane3.setViewportView(txtCatnHoras);

        btnAgregarTI.setText("Agregar");
        btnAgregarTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTIActionPerformed(evt);
            }
        });

        btnEliminarTI.setText("Eliminar");
        btnEliminarTI.setEnabled(false);
        btnEliminarTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTIActionPerformed(evt);
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
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTareaARealizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spnFecha)
                                    .addComponent(jScrollPane3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(213, 213, 213))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnEliminarTI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregarTI)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTareaARealizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarTI)
                    .addComponent(btnEliminarTI))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.previo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnAgregarTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTIActionPerformed
        try {
            Double cantHoras = Double.valueOf(this.txtCatnHoras.getText());
            Date fecha = (Date) this.spnFecha.getValue();
            if (fecha != null && cantHoras != null) {
                this.controlador.agregarTiempoInvertido(tarea, cantHoras, fecha);    
            } else {
                this.controlador.mensaje("MA", "Debe completar todos los campos para agregar el registro de un Tiempo Invertido a la tarea a realizar", "Atención");
                return;
            }
        } catch (NumberFormatException nfe) {
            this.controlador.mensaje("MA", "Ingrese datos válidos en la caja de texto. Para separador decimal utilice Punto (.)", "Error");
            return;
        }
        reiniciarTiemposInvertidos();
    }//GEN-LAST:event_btnAgregarTIActionPerformed

    private void lstTiemposValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTiemposValueChanged
        if (!this.lstTiempos.isSelectionEmpty()) {
            this.btnEliminarTI.setEnabled(true);
        } else {
            this.btnEliminarTI.setEnabled(false);
        }
    }//GEN-LAST:event_lstTiemposValueChanged

    private void btnEliminarTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTIActionPerformed
        TiempoInvertido ti = (TiempoInvertido) this.lstTiempos.getSelectedValue();
        if (ti != null) {
            int transaccion = this.controlador.eliminarTiempoInvertido(ti);
            if (transaccion != 0) {
                this.controlador.mensajeErrorPersistencia("EPE", "el ", "tiempo invertido", "Error de persistencia");
            }
            reiniciarTiemposInvertidos();
        }
    }//GEN-LAST:event_btnEliminarTIActionPerformed
    
    private void reiniciarTiemposInvertidos() {
        this.lblTareaARealizar.setText(this.tarea.getTareaDefinida().toString());
        this.lstTiempos.setListData(this.controlador.listarTiemposInvertidos(tarea).toArray());
        this.txtCatnHoras.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTI;
    private javax.swing.JButton btnEliminarTI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblTareaARealizar;
    private javax.swing.JList lstTiempos;
    private javax.swing.JSpinner spnFecha;
    private javax.swing.JTextPane txtCatnHoras;
    // End of variables declaration//GEN-END:variables
}
