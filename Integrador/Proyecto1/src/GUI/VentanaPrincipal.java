/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import controlador.Controlador;
import java.text.SimpleDateFormat;
import java.util.*;
import modelo.*;

/**
 *
 * @author toba_2_6_7
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private final Controlador controlador;
    private static final Object[] SIN_TECNICOS = {};
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstReclamosActivos = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstReclamosFinalizados = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de Reclamos");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Reclamos"), "Reclamos"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Activo(s)"));

        lstReclamosActivos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstReclamosActivosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstReclamosActivos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Finalizado(s)"));

        jScrollPane2.setViewportView(lstReclamosFinalizados);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tlb_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tlb_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        reiniciarVentanaPrincipal();
    }//GEN-LAST:event_formWindowGainedFocus

    private void lstReclamosActivosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstReclamosActivosValueChanged
//        this.lstReclamosFinalizados.setListData(this.controlador.listarReclamosFinalizados().toArray());
//        Reclamo r = (Reclamo) this.lstReclamosActivos.getSelectedValue();
//        List<Double> cHorasGlobal = new ArrayList<>();
//        if (r != null) {
//            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy hh:mm");
//            int numeroReclamo = r.getNumero();
//            String fechaEntrada = f.format(r.getFechaEntrada());
//            String articulo = r.getArticulo().toString();
//            String descripcionProblema = r.getDescProblema();
//            /*Asignamos los valores a la cabecera de la columna de detalle*/
//            this.lblArticuloVentanaPrincipal.setText(articulo);
//            this.lblNumeroReclamoVentanaPrincipal.setText(String.valueOf(numeroReclamo));
//            this.lblFechaEntradaVentanaPrincipal.setText(fechaEntrada);
//            this.txtDescripcion.setText(descripcionProblema);
//            
//            /*obtenemos los tecnicos que trabajan en las tareas del reclamo*/
//            Set<TareaARealizar> lTareas = r.getTareas();
//            Iterator<TareaARealizar> it = lTareas.iterator();
//            Set<Tecnico> lTecnicos = new HashSet<>();
//            while (it.hasNext()) {
//                double cantHoras = 0;
//                lTecnicos.add(it.next().getTecnico()); // obtenemos al técnico y lo ponemos dentro de una coleccion
//                /*Sumamos las horas invertidas en cada tarea*/
//                List<TiempoInvertido> lTiempos = it.next().getTiempos();
//                Iterator<TiempoInvertido> iTiempos = lTiempos.iterator();
//                while (iTiempos.hasNext()) {
//                    System.out.println(iTiempos.next().getHorasInvertidas());
//                    cHorasGlobal.add(iTiempos.next().getHorasInvertidas());
//                }
//            }
//            
//            this.lstTecnicosVentanaPrincipal.setListData(lTecnicos.toArray());
//            this.lblHorasInvertidasVentanaPrincipal.setText(String.valueOf(sumarHorasInvertidas(cHorasGlobal)));
//            /**/
//        }
    }//GEN-LAST:event_lstReclamosActivosValueChanged

    private Double sumarHorasInvertidas(List<Double> ti) {
        double cantHoras =0;
        Iterator<Double> iCH = ti.iterator();
        while(iCH.hasNext()) {
            cantHoras += iCH.next();
        }
        return cantHoras;
    }
    
    private void reiniciarVentanaPrincipal() {
        /*obtengo los reclamos*/
        List<Reclamo> lReclamos = this.controlador.listarReclamos();
        Iterator<Reclamo> li = lReclamos.iterator();
        /*Declaracion de variables que contendran los reclamos activos y finalizados*/
        List<Reclamo> lReclamosActivos = this.controlador.listarReclamosActivos();
        List<Reclamo> lReclamosFinalizados = this.controlador.listarReclamosFinalizados();
        /*
        try {
             while (li.hasNext()) {
                if (li.next() != null) {
                    if (li.next().getFechaFin() == null) {
                        // Cargar los reclamos activos
                        if (li.next() != null) {
                            lReclamosActivos.add(li.next());
                        }
                    } else {
                        // Cargar los reclamos finalizados
                        if (li.next() != null) {
                            lReclamosFinalizados.add(li.next());
                        }
                    }
                }    
            }
        } catch (Exception e) {
            this.controlador.mensaje("MA", e.toString(), "Atención");
        }*/
        this.lstReclamosActivos.setListData(lReclamosActivos.toArray());
        this.lstReclamosFinalizados.setListData(lReclamosFinalizados.toArray());
        /*this.lblArticuloVentanaPrincipal.setText("");
        this.lblFechaEntradaVentanaPrincipal.setText("");
        this.lblHorasInvertidasVentanaPrincipal.setText("");
        this.lblNumeroReclamoVentanaPrincipal.setText("");
        this.txtDescripcion.setText("");
        this.lstTecnicosVentanaPrincipal.setListData(SIN_TECNICOS);*/
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArticulos;
    private javax.swing.JButton btnConfiguraciones;
    private javax.swing.JButton btnReclamos;
    private javax.swing.JButton btnTecnicos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstReclamosActivos;
    private javax.swing.JList lstReclamosFinalizados;
    private javax.swing.JToolBar tlb_principal;
    // End of variables declaration//GEN-END:variables
}
