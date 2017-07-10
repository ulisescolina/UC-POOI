/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import modelo.*;
import controlador.Controlador;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

/**
 *
 * @author toba_2_6_7
 */
public class VtnTecnicoDetalle extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;
    private final Object tecnico;

    /**
     * Creates new form VtnProyectos
     *
     * @param c
     * @param p
     */
    public VtnTecnicoDetalle(Controlador c, JFrame p, Object t) {
        this.controlador = c;
        this.previo = p;
        this.tecnico = t;
        initComponents();
        this.setTitle(titulo(this.tecnico));
        reiniciarTecnicoDetalle();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblInfoRemuneracion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNombresEmpleado = new javax.swing.JLabel();
        lblApellidosEmpleado = new javax.swing.JLabel();
        lblDocumentoUnicoEmpleado = new javax.swing.JLabel();
        lblRemuneracionEmpleado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstArticulos = new javax.swing.JList();
        cmbArticulos = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAgregarTA = new javax.swing.JButton();
        btnEliminarTA = new javax.swing.JButton();
        btnNuevoTA = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstTareasAsignadas = new javax.swing.JList();
        btnEditarEstadoTarea = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jInternalFrame1.setBorder(null);
        jInternalFrame1.setVisible(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre(s): ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Apellido(s): ");

        lblInfoRemuneracion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInfoRemuneracion.setText("Remuneración: ");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Documento Unico: ");

        lblNombresEmpleado.setText(" ");

        lblApellidosEmpleado.setText(" ");

        lblDocumentoUnicoEmpleado.setText(" ");

        lblRemuneracionEmpleado.setText(" ");

        lstArticulos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstArticulosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstArticulos);

        jLabel5.setText("Especializado en los siguientes Tipos de Articulos ");

        jLabel6.setText("Tipo de Articulo");

        btnAgregarTA.setText("Agregar Tipo de articulo");
        btnAgregarTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTAActionPerformed(evt);
            }
        });

        btnEliminarTA.setText("Eliminar");
        btnEliminarTA.setEnabled(false);
        btnEliminarTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTAActionPerformed(evt);
            }
        });

        btnNuevoTA.setText("Nuevo");
        btnNuevoTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblInfoRemuneracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombresEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblApellidosEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDocumentoUnicoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRemuneracionEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(0, 153, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(137, 137, 137))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbArticulos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevoTA, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarTA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarTA)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(lblNombresEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblApellidosEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDocumentoUnicoEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRemuneracionEmpleado))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblInfoRemuneracion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarTA)
                    .addComponent(btnEliminarTA)
                    .addComponent(btnNuevoTA))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Información basica del Empleado", jInternalFrame1);

        jInternalFrame2.setBorder(null);
        jInternalFrame2.setVisible(true);

        lstTareasAsignadas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTareasAsignadasValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstTareasAsignadas);

        btnEditarEstadoTarea.setText("Editar Estado Tarea");
        btnEditarEstadoTarea.setEnabled(false);
        btnEditarEstadoTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEstadoTareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditarEstadoTarea)))
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarEstadoTarea)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tareas Asignadas", jInternalFrame2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.previo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnAgregarTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTAActionPerformed
        if (this.cmbArticulos.getSelectedItem() == null) {
            this.controlador.mensaje("MA", "Debe seleccionar el Tipo de Articulo por Agregar", "Atención");
            return;
        }
        Object item = (Object) this.cmbArticulos.getSelectedItem();
            if (item instanceof TipoDeArticulo) {
                TipoDeArticulo TA = (TipoDeArticulo) item;
                this.controlador.agregarArticuloEspecializado(this.tecnico, TA);
            }
        reiniciarTecnicoDetalle();
    }//GEN-LAST:event_btnAgregarTAActionPerformed

    private void btnEliminarTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTAActionPerformed
        TipoDeArticulo TA = (TipoDeArticulo) this.lstArticulos.getSelectedValue();
        int transaccion = this.controlador.quitarArticuloEspecializado(this.tecnico,TA);
        if (transaccion != 0) {
            this.controlador.mensajeErrorPersistencia("EPE", "la ", "especialidad", "Error de Persistencia");
        }
        reiniciarTecnicoDetalle();
    }//GEN-LAST:event_btnEliminarTAActionPerformed

    private void btnNuevoTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTAActionPerformed
        reiniciarTecnicoDetalle();
    }//GEN-LAST:event_btnNuevoTAActionPerformed

    private void lstArticulosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstArticulosValueChanged
        if (!this.lstArticulos.isSelectionEmpty()) {
            this.btnEliminarTA.setEnabled(true);
        } else {
            this.btnEliminarTA.setEnabled(false);
        }
    }//GEN-LAST:event_lstArticulosValueChanged

    private void btnEditarEstadoTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEstadoTareaActionPerformed
        TareaARealizar tar = (TareaARealizar) this.lstTareasAsignadas.getSelectedValue();
        VtnTiempoIvertido vti = new VtnTiempoIvertido(this.controlador, this, tar);
        this.setVisible(false);
        vti.setLocationRelativeTo(null);
        vti.setResizable(false);
        vti.setVisible(true);
    }//GEN-LAST:event_btnEditarEstadoTareaActionPerformed

    private void lstTareasAsignadasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTareasAsignadasValueChanged
        if (this.lstTareasAsignadas.getSelectedValue() != null) {
            this.btnEditarEstadoTarea.setEnabled(true);
        } else {
            this.btnEditarEstadoTarea.setEnabled(false);
        }
    }//GEN-LAST:event_lstTareasAsignadasValueChanged
   
    private void reiniciarTecnicoDetalle() {
        if (this.tecnico instanceof EmpleadoMensual) {
            EmpleadoMensual e = (EmpleadoMensual) this.tecnico;
            /*==Pantalla de info Basica==*/
            /*Cargar cajas de texto cabecera*/
            this.lblApellidosEmpleado.setText(e.getApellidos());
            this.lblDocumentoUnicoEmpleado.setText(e.getDocumentoUnico());
            this.lblNombresEmpleado.setText(e.getNombre());
            this.lblInfoRemuneracion.setText("Sueldo Mensual: ");
            this.lblRemuneracionEmpleado.setText(String.valueOf(e.getSueldoMensual()));
            /*Cargo la lista de Articulos en los que se especializa*/
            this.lstArticulos.setListData(e.getArticulosEspecializados().toArray());
            /*Configuro el combo*/
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(this.controlador.listarTiposDeArticulo().toArray());
            this.cmbArticulos.setModel(modeloCombo);
            this.cmbArticulos.setSelectedIndex(-1);
            
            /*==Pantalla de Tareas Asignadas==*/
            this.lstTareasAsignadas.setListData(e.getTareas().toArray());
        } else if (this.tecnico instanceof EmpleadoJornalero) {
            EmpleadoJornalero e = (EmpleadoJornalero) this.tecnico;
            /*==Pantalla de info Basica==*/
            /*Cargar cajas de texto cabecera*/
            this.lblApellidosEmpleado.setText(e.getApellidos());
            this.lblDocumentoUnicoEmpleado.setText(e.getDocumentoUnico());
            this.lblNombresEmpleado.setText(e.getNombre());
            this.lblInfoRemuneracion.setText("Tarifa por Hora: ");
            this.lblRemuneracionEmpleado.setText(String.valueOf(e.getTarifaPorHora()));
            /*Cargo la lista de Articulos en los que se especializa*/
            this.lstArticulos.setListData(e.getArticulosEspecializados().toArray());
            /*Configuro el combo*/
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(this.controlador.listarTiposDeArticulo().toArray());
            this.cmbArticulos.setModel(modeloCombo);
            this.cmbArticulos.setSelectedIndex(-1);
            
            /*==Pantalla de Tareas asignadas==*/
            this.lstTareasAsignadas.setListData(e.getTareas().toArray());
        }
    }
    
    private String titulo(Object t) {
        if (t instanceof EmpleadoMensual) {
            return t.toString();
        }
        
        if (t instanceof EmpleadoJornalero) {
            return t.toString();
        }
        
        return "Detalle del Empleado";
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTA;
    private javax.swing.JButton btnEditarEstadoTarea;
    private javax.swing.JButton btnEliminarTA;
    private javax.swing.JButton btnNuevoTA;
    private javax.swing.JComboBox cmbArticulos;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApellidosEmpleado;
    private javax.swing.JLabel lblDocumentoUnicoEmpleado;
    private javax.swing.JLabel lblInfoRemuneracion;
    private javax.swing.JLabel lblNombresEmpleado;
    private javax.swing.JLabel lblRemuneracionEmpleado;
    private javax.swing.JList lstArticulos;
    private javax.swing.JList lstTareasAsignadas;
    // End of variables declaration//GEN-END:variables
}
