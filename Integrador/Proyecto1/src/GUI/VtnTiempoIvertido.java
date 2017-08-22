/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import controlador.Controlador;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
        chkMarcarTareaFinalizada = new javax.swing.JCheckBox();
        lblTareaARealizar = new javax.swing.JTextField();

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

        chkMarcarTareaFinalizada.setText("Marcar tarea como Finalizada");
        chkMarcarTareaFinalizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMarcarTareaFinalizadaActionPerformed(evt);
            }
        });

        lblTareaARealizar.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(chkMarcarTareaFinalizada))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnEliminarTI)
                                .addGap(10, 10, 10)
                                .addComponent(btnAgregarTI))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spnFecha)
                                    .addComponent(jScrollPane3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTareaARealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(lblTareaARealizar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkMarcarTareaFinalizada)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarTI)
                    .addComponent(btnAgregarTI))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        boolean cerrar = true;
        this.setDefaultCloseOperation(VtnTiempoIvertido.DISPOSE_ON_CLOSE);
        if (!tarea.isFinalizado()) {
            if (this.chkMarcarTareaFinalizada.isSelected()) {
                Object [] opciones ={"Si","No"};
                int confirmacion = JOptionPane.showOptionDialog(this, "El sistema detecto que marcó la tarea como finalizada. Por favor, confirme que la accion es correcta.\n\n¿Es correcta esta acción?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,opciones,"No");
                // Si preciona 'Si', se procede a hacer el reclamo solo-lectura y se vuelve a hacer visible la ventana anterior 
                if (confirmacion == JOptionPane.YES_OPTION) {            
                    this.controlador.marcarTareaComoFinalizada(tarea);
                    cerrar = true;
                } else {
                // Si presiona 'No', se cambia la operacion por defecto de la ventana para que no haga nada al precionar el boton cerrar               
                    this.setDefaultCloseOperation(VtnTiempoIvertido.DO_NOTHING_ON_CLOSE);
                    cerrar = false;
                }
            }
        }
        
        if (tarea.getReclamo().getFechaFin() == null) {
            comprobarFinalizacionDeReclamo(tarea.getReclamo());
        }
        
        
        if (cerrar) {
            this.previo.setVisible(true);
            this.dispose();
        }
        
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
            this.controlador.mensaje("MA", "Ingrese valor numerico en el valor de horas invertidas. Para separador decimal utilice Punto (.)", "Error");
            return;
        }
        reiniciarTiemposInvertidos();
    }//GEN-LAST:event_btnAgregarTIActionPerformed

    private void lstTiemposValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTiemposValueChanged
        if (!this.lstTiempos.isSelectionEmpty()) {
            if (tarea.getReclamo().getFechaFin() == null) {
                this.btnEliminarTI.setEnabled(true);    
            }
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

    private void chkMarcarTareaFinalizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMarcarTareaFinalizadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMarcarTareaFinalizadaActionPerformed
    
    private void reiniciarTiemposInvertidos() {
        this.lblTareaARealizar.setText(this.tarea.getTareaDefinida().toString());
        this.lstTiempos.setListData(this.controlador.listarTiemposInvertidos(tarea).toArray());
        this.txtCatnHoras.setText("");
        if (tarea.isFinalizado()) {
            this.chkMarcarTareaFinalizada.setSelected(true);
            this.chkMarcarTareaFinalizada.setEnabled(false);
            this.btnAgregarTI.setEnabled(false);
            this.btnEliminarTI.setEnabled(false);
        }
        
        if (tarea.getReclamo().getFechaFin() != null) {
            this.btnAgregarTI.setEnabled(false);
            this.btnEliminarTI.setEnabled(false);
            this.chkMarcarTareaFinalizada.setEnabled(false);
        }
    }
    
    private void comprobarFinalizacionDeReclamo(Reclamo r) {
        Set<TareaARealizar> lTareas= r.getTareas();
        Iterator<TareaARealizar> li = lTareas.iterator();
        int cantTareasPendientes = 0;
        if (lTareas.isEmpty()) {
            cantTareasPendientes = 0;
        } else {
            while (li.hasNext()) {
                if (!li.next().isFinalizado()) {
                    cantTareasPendientes += 1;
                }
            }
        }
        
        if (cantTareasPendientes == 0) {
            this.controlador.setReclamoFinalizado(r);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTI;
    private javax.swing.JButton btnEliminarTI;
    private javax.swing.JCheckBox chkMarcarTareaFinalizada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField lblTareaARealizar;
    private javax.swing.JList lstTiempos;
    private javax.swing.JSpinner spnFecha;
    private javax.swing.JTextPane txtCatnHoras;
    // End of variables declaration//GEN-END:variables
}
