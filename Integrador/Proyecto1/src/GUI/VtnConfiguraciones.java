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
public class VtnConfiguraciones extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;

    /**
     * Creates new form VtnProyectos
     *
     * @param c
     * @param p
     */
    public VtnConfiguraciones(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        initComponents();
        reiniciarTipoDeArticulo();
        reiniciarTareasDefinidas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        configuraciones = new javax.swing.JTabbedPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        txtNombreTipoArticulo = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        btnGuardarTipoArticulo = new javax.swing.JButton();
        lbl_apellido = new javax.swing.JLabel();
        txtCodigoTipoArticulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTiposArticulos = new javax.swing.JList();
        btnEliminarTipoArticulo = new javax.swing.JButton();
        btnNuevoTipoArticulo = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstTareasDefinidas = new javax.swing.JList();
        txtCodigoTareaDefinida = new javax.swing.JTextField();
        lbl_apellido1 = new javax.swing.JLabel();
        lbl_nombre1 = new javax.swing.JLabel();
        txtNombreTareaDefinida = new javax.swing.JTextField();
        btnGuardarTareaDefinida = new javax.swing.JButton();
        btnNuevaTareaDefinida = new javax.swing.JButton();
        btnEliminarTareaDefinida = new javax.swing.JButton();
        lbl_descripcion = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcionTareaDefinida = new javax.swing.JTextArea();
        cmbTipoArticuloAsociado = new javax.swing.JComboBox();
        lblTipoDeArticulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Parametros");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        configuraciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                configuracionesMouseClicked(evt);
            }
        });

        jInternalFrame1.setBorder(null);
        jInternalFrame1.setVisible(true);

        lbl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_nombre.setText("Nombre");

        btnGuardarTipoArticulo.setText("Guardar");
        btnGuardarTipoArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTipoArticuloActionPerformed(evt);
            }
        });

        lbl_apellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_apellido.setText("Codigo");

        lstTiposArticulos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTiposArticulosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstTiposArticulos);

        btnEliminarTipoArticulo.setText("Eliminar");
        btnEliminarTipoArticulo.setEnabled(false);
        btnEliminarTipoArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTipoArticuloActionPerformed(evt);
            }
        });

        btnNuevoTipoArticulo.setText("Nuevo");
        btnNuevoTipoArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTipoArticuloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lbl_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoTipoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lbl_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreTipoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevoTipoArticulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarTipoArticulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarTipoArticulo)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellido)
                    .addComponent(txtCodigoTipoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txtNombreTipoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarTipoArticulo)
                    .addComponent(btnEliminarTipoArticulo)
                    .addComponent(btnNuevoTipoArticulo))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        configuraciones.addTab("Tipo de Articulo", jInternalFrame1);

        jInternalFrame2.setBorder(null);
        jInternalFrame2.setVisible(true);

        lstTareasDefinidas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTareasDefinidasValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstTareasDefinidas);

        txtCodigoTareaDefinida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoTareaDefinidaActionPerformed(evt);
            }
        });

        lbl_apellido1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_apellido1.setText("Codigo");

        lbl_nombre1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_nombre1.setText("Nombre");

        txtNombreTareaDefinida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTareaDefinidaActionPerformed(evt);
            }
        });

        btnGuardarTareaDefinida.setText("Guardar");
        btnGuardarTareaDefinida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTareaDefinidaActionPerformed(evt);
            }
        });

        btnNuevaTareaDefinida.setText("Nuevo");
        btnNuevaTareaDefinida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaTareaDefinidaActionPerformed(evt);
            }
        });

        btnEliminarTareaDefinida.setText("Eliminar");
        btnEliminarTareaDefinida.setEnabled(false);
        btnEliminarTareaDefinida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTareaDefinidaActionPerformed(evt);
            }
        });

        lbl_descripcion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_descripcion.setText("Descripción");

        txtDescripcionTareaDefinida.setColumns(20);
        txtDescripcionTareaDefinida.setRows(5);
        jScrollPane3.setViewportView(txtDescripcionTareaDefinida);

        lblTipoDeArticulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTipoDeArticulo.setText("Tipo de Articulo");

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(lbl_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoTareaDefinida, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(lbl_nombre1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreTareaDefinida, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(btnNuevaTareaDefinida)
                                .addGap(23, 23, 23)
                                .addComponent(btnEliminarTareaDefinida)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardarTareaDefinida))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_descripcion)
                                    .addComponent(lblTipoDeArticulo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbTipoArticuloAsociado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellido1)
                    .addComponent(txtCodigoTareaDefinida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre1)
                    .addComponent(txtNombreTareaDefinida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_descripcion)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoArticuloAsociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoDeArticulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarTareaDefinida)
                    .addComponent(btnNuevaTareaDefinida)
                    .addComponent(btnEliminarTareaDefinida))
                .addGap(26, 26, 26))
        );

        configuraciones.addTab("Tareas Definidas", jInternalFrame2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(configuraciones)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(configuraciones)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoTareaDefinidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoTareaDefinidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoTareaDefinidaActionPerformed

    private void txtNombreTareaDefinidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTareaDefinidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTareaDefinidaActionPerformed

    private void btnNuevaTareaDefinidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaTareaDefinidaActionPerformed
        reiniciarTareasDefinidas();
    }//GEN-LAST:event_btnNuevaTareaDefinidaActionPerformed

    private void btnEliminarTareaDefinidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTareaDefinidaActionPerformed
        TareaDefinida TD = (TareaDefinida) this.lstTareasDefinidas.getSelectedValue();
        if (TD != null) {
            int transaccion = this.controlador.eliminarTareaDefinida(TD);
            if (transaccion != 0) {
                this.controlador.mensajeErrorPersistencia("EPE", "la", " tarea definida", "Error de Persistencia");
            }
            reiniciarTareasDefinidas();
        }
    }//GEN-LAST:event_btnEliminarTareaDefinidaActionPerformed

    private void btnGuardarTipoArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTipoArticuloActionPerformed
        if (this.txtCodigoTipoArticulo.getText() == null) {
            this.controlador.mensaje("MA", "Debe establecer un código al tipo de articulo obligatoriamente.", "Atención");
            return;
        }
        if (this.txtNombreTipoArticulo.getText() == null) {
            this.controlador.mensaje("MA", "Debe establecer un nombre al tipo de articulo obligatoriamente.", "Atención");
            return;
        }
        if (!this.lstTiposArticulos.isSelectionEmpty()) {
            TipoDeArticulo TDA = (TipoDeArticulo) this.lstTiposArticulos.getSelectedValue();
            this.controlador.editarTipoDeArticulo(TDA,this.txtCodigoTipoArticulo.getText().trim(), this.txtNombreTipoArticulo.getText().trim());
        } else {
            String CodigoTipoArticulo = this.txtCodigoTipoArticulo.getText().trim();
            String NombreTipoArticulo = this.txtNombreTipoArticulo.getText().trim();
            this.controlador.agregarTipoDeArticulo(CodigoTipoArticulo, NombreTipoArticulo);
        }
        reiniciarTipoDeArticulo();
    }//GEN-LAST:event_btnGuardarTipoArticuloActionPerformed

    private void lstTiposArticulosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTiposArticulosValueChanged
        // verificamos que la lista tenga un item seleccionado
        if (!this.lstTiposArticulos.isSelectionEmpty()) {
            // Activo los el boton para permitir la eliminacion
            this.btnEliminarTipoArticulo.setEnabled(true);
            // obtengo el item seleccionado
            TipoDeArticulo TDA = (TipoDeArticulo) this.lstTiposArticulos.getSelectedValue();
            // asigno los valores de los atributos a las caja de texto
            this.txtCodigoTipoArticulo.setText(TDA.getCodigo());
            this.txtNombreTipoArticulo.setText(TDA.getNombre());
        } else {
            // Desactivo el boton para permitir la eliminacion
            this.btnEliminarTipoArticulo.setEnabled(false);
            
        }
    }//GEN-LAST:event_lstTiposArticulosValueChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.previo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnEliminarTipoArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTipoArticuloActionPerformed
        TipoDeArticulo TDA = (TipoDeArticulo) this.lstTiposArticulos.getSelectedValue();
        if (TDA != null) {
            int transaccion = this.controlador.eliminarTipoDeArticulo(TDA);
            if (transaccion != 0) {
                this.controlador.mensajeErrorPersistencia("EPE", "El", "Tipo de Articulo", "Error de Persistencia");
            }
            reiniciarTipoDeArticulo();
        }       
    }//GEN-LAST:event_btnEliminarTipoArticuloActionPerformed

    private void btnGuardarTareaDefinidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTareaDefinidaActionPerformed
        if (this.txtCodigoTareaDefinida.getText() == null) {
            this.controlador.mensaje("MA", "Debe establecer un código a la tarea definida obligatoriamente.", "Atención");
            return;
        }
        
        if (this.txtDescripcionTareaDefinida.getText() == null) {
            this.controlador.mensaje("MA", "Debe establecer una descripción a la tarea definida obligatoriamente.", "Atención");
            return;
        }
        
        if (this.txtNombreTareaDefinida.getText() == null) {
            this.controlador.mensaje("MA", "Debe establecer un nombre a la tarea definidaobligatoriamente.", "Atención");
            return;
        }
        
        if (this.cmbTipoArticuloAsociado.getSelectedItem() == null) {
            this.controlador.mensaje("MA", "Debe seleccionar un tipo de articulo\npara ser asociado a la tarea definida que esta creando", "Advertencia");
            return;
        }
        
        if (!this.lstTareasDefinidas.isSelectionEmpty()) {
            TareaDefinida TD = (TareaDefinida) this.lstTareasDefinidas.getSelectedValue();
            String CodigoTareaDefinida = this.txtCodigoTareaDefinida.getText().trim();
            String NombreTareaDefinida = this.txtNombreTareaDefinida.getText().trim();
            String DescripcionTareaDefinida = this.txtDescripcionTareaDefinida.getText().trim();
            TipoDeArticulo TDA = (TipoDeArticulo) this.cmbTipoArticuloAsociado.getSelectedItem();
            this.controlador.editarTareaDefinida(TD, CodigoTareaDefinida, NombreTareaDefinida, DescripcionTareaDefinida, TDA);
        } else {
            String CodigoTareaDefinida = this.txtCodigoTareaDefinida.getText().trim();
            String NombreTareaDefinida = this.txtNombreTareaDefinida.getText().trim();
            String DescripcionTareaDefinida = this.txtDescripcionTareaDefinida.getText().trim();
            TipoDeArticulo TDA = (TipoDeArticulo) this.cmbTipoArticuloAsociado.getSelectedItem();
            this.controlador.agregarTareaDefinida(CodigoTareaDefinida, NombreTareaDefinida, DescripcionTareaDefinida, TDA);
        }
        reiniciarTareasDefinidas();
    }//GEN-LAST:event_btnGuardarTareaDefinidaActionPerformed

    private void configuracionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configuracionesMouseClicked
        reiniciarTipoDeArticulo();
        reiniciarTareasDefinidas();
    }//GEN-LAST:event_configuracionesMouseClicked

    private void lstTareasDefinidasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTareasDefinidasValueChanged
        // verificamos que la lista tenga un item seleccionado
        if (!this.lstTareasDefinidas.isSelectionEmpty()) {
            // Activo los el boton para permitir la eliminacion
            this.btnEliminarTareaDefinida.setEnabled(true);
            // obtengo el item seleccionado
            TareaDefinida TD = (TareaDefinida) this.lstTareasDefinidas.getSelectedValue();
            // asigno los valores de los atributos a las caja de texto
            this.txtCodigoTareaDefinida.setText(TD.getCodigoUnico());
            this.txtNombreTareaDefinida.setText(TD.getNombre());
            this.txtDescripcionTareaDefinida.setText(TD.getDescripcion());
            
            /*
            * Issue asociado: https://github.com/ulisescolina/UC-POOI/issues/9 
            * 
            * Pregunto si la tarea definida tiene alguna tarea a realizar asociada
            * de este modo podre editar las tareas definidas que no esten siendo utilizadas
            * sin perder la capacidad de editar las tareas definidas que no esten siendo
            * referenciadas
            */
            if (!TD.getTareas().isEmpty()) {
                this.cmbTipoArticuloAsociado.setSelectedItem(TD.getTipoArticuloAsociado());
                this.cmbTipoArticuloAsociado.setEnabled(false);
            } else {
                this.cmbTipoArticuloAsociado.setSelectedItem(TD.getTipoArticuloAsociado());
                this.cmbTipoArticuloAsociado.setEnabled(true);
            }
        } else {
            // Desactivo el boton para permitir la eliminacion
            this.btnEliminarTipoArticulo.setEnabled(false);
            // Activo el combo
            this.cmbTipoArticuloAsociado.setEnabled(true);
            
        }
    }//GEN-LAST:event_lstTareasDefinidasValueChanged

    private void btnNuevoTipoArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTipoArticuloActionPerformed
        reiniciarTipoDeArticulo();
    }//GEN-LAST:event_btnNuevoTipoArticuloActionPerformed
    
    private void reiniciarTipoDeArticulo() {
        // Reiniciamos las cajas de textos
        this.txtCodigoTipoArticulo.setText("");
        this.txtNombreTipoArticulo.setText("");
        // Cargamos la lista
        this.lstTiposArticulos.setListData(this.controlador.listarTiposDeArticulo().toArray());
        // deselecciono la lista
        this.lstTiposArticulos.clearSelection();
    }
    
    private void reiniciarTareasDefinidas() {
        // Reiniciamos las cajas de textos
        this.txtCodigoTareaDefinida.setText("");
        this.txtNombreTareaDefinida.setText("");
        this.txtDescripcionTareaDefinida.setText("");
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(this.controlador.listarTiposDeArticulo().toArray());
        this.cmbTipoArticuloAsociado.setModel(modeloCombo);
        this.cmbTipoArticuloAsociado.setSelectedIndex(-1);
        // Cargamos la lista
        this.lstTareasDefinidas.setListData(this.controlador.listarTareasDefinidas().toArray());
        // deselecciono la lista
        this.lstTareasDefinidas.clearSelection();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarTareaDefinida;
    private javax.swing.JButton btnEliminarTipoArticulo;
    private javax.swing.JButton btnGuardarTareaDefinida;
    private javax.swing.JButton btnGuardarTipoArticulo;
    private javax.swing.JButton btnNuevaTareaDefinida;
    private javax.swing.JButton btnNuevoTipoArticulo;
    private javax.swing.JComboBox cmbTipoArticuloAsociado;
    private javax.swing.JTabbedPane configuraciones;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTipoDeArticulo;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_apellido1;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JList lstTareasDefinidas;
    private javax.swing.JList lstTiposArticulos;
    private javax.swing.JTextField txtCodigoTareaDefinida;
    private javax.swing.JTextField txtCodigoTipoArticulo;
    private javax.swing.JTextArea txtDescripcionTareaDefinida;
    private javax.swing.JTextField txtNombreTareaDefinida;
    private javax.swing.JTextField txtNombreTipoArticulo;
    // End of variables declaration//GEN-END:variables
}
