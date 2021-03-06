/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoolomania.funcional.vista;

import com.zoolomania.funcional.control.GuiaTrs;
import com.zoolomania.funcional.control.ItinerarioTrs;
import com.zoolomania.funcional.control.MyExcepcion;
import com.zoolomania.funcional.control.UtilGestion;
import com.zoolomania.funcional.modelo.Guia;
import com.zoolomania.funcional.modelo.Itinerario;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que permitirá simular el formulario para realizar operaciones de
 * negocio con Guia
 *
 * @author Erick Díaz
 */
public class frmGuia extends javax.swing.JFrame {
    
    GuiaTrs gtrs = new GuiaTrs();
    ItinerarioTrs itrs = new ItinerarioTrs();
    List<Guia> guias = gtrs.listar();
    List<Itinerario> itinerarios = itrs.listar();
    boolean bandera = false;
    
    private void cargarTablaI() {
        Object[] columna = {"ID", "Codigo", "N° Especies visitadas", "Duración (HH/mm)", "N° Max. Personas", "Longitud (Km)"};
        DefaultTableModel modeloI = new DefaultTableModel(columna, 0);
        for (Itinerario i : itinerarios) {
            short id = i.getId();
            String codigo = i.getCodigo();
            int especies = i.especiesVisitadas(i.getZonas());
            LocalTime duracion = i.getDuracionRecorrido();
            byte personas = i.getNumMaxVisitantes();
            float longitud = i.getLongitud();
            Object[] fila = {id, codigo, especies, duracion, personas, longitud};
            modeloI.addRow(fila);
        }
        this.tablaI.setModel(modeloI);
    }

    /*
    Tabla que tiene la hora en la cuál el Guia tendrá que realizar el itinerario y se carga cuando se acceden a sus relaciones
     */
    private void cargarTablaGI() {
        Object[] columna = {"Hora expedición", "Codigo", "N° Especies visitadas", "Duración (HH/mm)", "N° Max. Personas", "Longitud (Km)"};
        DefaultTableModel modeloI = new DefaultTableModel(columna, 0);
        for (Itinerario i : itinerarios) {
            LocalTime hItinerario = i.getHoraItinerario();
            String codigo = i.getCodigo();
            int especies = i.especiesVisitadas(i.getZonas());
            LocalTime duracion = i.getDuracionRecorrido();
            byte personas = i.getNumMaxVisitantes();
            float longitud = i.getLongitud();
            Object[] fila = {hItinerario, codigo, especies, duracion, personas, longitud};
            modeloI.addRow(fila);
        }
        this.tablaI.setModel(modeloI);
    }
    
    private void cargarTablaG() {
        Object[] columna = {"ID", "Nombre", "Dirección", "Teléfono", "Fecha Inicio Trabajo"};
        DefaultTableModel modeloG = new DefaultTableModel(columna, 0);
        for (Guia g : guias) {
            short id = g.getId();
            String nombre = g.getNombre();
            String direccion = g.getDireccion();
            String telefono = g.getTelefono();
            LocalDateTime fecha = g.getFechInicioTrabajar();
            Object[] fila = {id, nombre, direccion, telefono, fecha};
            modeloG.addRow(fila);
        }
        this.tablaG.setModel(modeloG);
    }

    /**
     * Creates new form frmGuia
     */
    public frmGuia() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "src/iconos/logo.jpg");
        cargarTablaI();
        cargarTablaG();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        bAgregar1 = new javax.swing.JButton();
        bEliminar1 = new javax.swing.JButton();
        bRelacion1 = new javax.swing.JButton();
        cBoxO = new javax.swing.JComboBox<>();
        bOrdenar1 = new javax.swing.JButton();
        rAscendente1 = new javax.swing.JRadioButton();
        rDescendente1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaI = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaG = new javax.swing.JTable();
        cBox = new javax.swing.JComboBox<>();
        rDescendente = new javax.swing.JRadioButton();
        rAscendente = new javax.swing.JRadioButton();
        bOrdenar = new javax.swing.JButton();
        bRelacion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bRegresar = new javax.swing.JButton();
        jid = new javax.swing.JTextField();
        jNada = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bAgregar = new javax.swing.JButton();
        jTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        bAgregar1.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        bAgregar1.setText("Agregar");
        bAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregar1ActionPerformed(evt);
            }
        });

        bEliminar1.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        bEliminar1.setText("Eliminar");
        bEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminar1ActionPerformed(evt);
            }
        });

        bRelacion1.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        bRelacion1.setText("Ver Todo");
        bRelacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRelacion1ActionPerformed(evt);
            }
        });

        cBoxO.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        cBoxO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Id" }));

        bOrdenar1.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        bOrdenar1.setText("Ordenar");
        bOrdenar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrdenar1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rAscendente1);
        rAscendente1.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        rAscendente1.setSelected(true);
        rAscendente1.setText("Ascendente");

        buttonGroup2.add(rDescendente1);
        rDescendente1.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        rDescendente1.setText("Descendente");

        tablaI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaI);

        tablaG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaG);

        cBox.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        cBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Id" }));

        buttonGroup1.add(rDescendente);
        rDescendente.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        rDescendente.setText("Descendente");

        buttonGroup1.add(rAscendente);
        rAscendente.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        rAscendente.setSelected(true);
        rAscendente.setText("Ascendente");

        bOrdenar.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        bOrdenar.setText("Ordenar");
        bOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrdenarActionPerformed(evt);
            }
        });

        bRelacion.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        bRelacion.setText("ver Relacion");
        bRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRelacionActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bEliminar.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bRegresar.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        bRegresar.setText("Menu/Principal");
        bRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresarActionPerformed(evt);
            }
        });

        jid.setBackground(new java.awt.Color(0, 102, 153));
        jid.setForeground(new java.awt.Color(255, 255, 255));
        jid.setBorder(null);

        jNada.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jNada.setText("ID:");

        jNombre.setBackground(new java.awt.Color(0, 102, 153));
        jNombre.setForeground(new java.awt.Color(255, 255, 255));
        jNombre.setBorder(null);

        jLabel2.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        bAgregar.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        bAgregar.setText("Agregar");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });

        jTelefono.setBackground(new java.awt.Color(0, 102, 153));
        jTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jTelefono.setBorder(null);

        jLabel4.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel4.setText("Telefono:");

        jDireccion.setBackground(new java.awt.Color(0, 102, 153));
        jDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jDireccion.setBorder(null);

        jLabel5.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel5.setText("Dirección:");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bOrdenar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bAgregar)
                                .addGap(46, 46, 46)
                                .addComponent(jButton1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bRelacion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rAscendente)
                                .addGap(18, 18, 18)
                                .addComponent(rDescendente))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                                .addGap(141, 141, 141)
                                .addComponent(jNada, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(bRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bOrdenar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cBoxO, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rAscendente1)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(bAgregar1)
                                .addGap(46, 46, 46)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bEliminar1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rDescendente1)
                                .addGap(18, 18, 18)
                                .addComponent(bRelacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bRegresar))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAgregar1)
                            .addComponent(bEliminar1))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bOrdenar)
                            .addComponent(cBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rAscendente)
                            .addComponent(rDescendente)
                            .addComponent(bOrdenar1)
                            .addComponent(cBoxO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rAscendente1)
                            .addComponent(rDescendente1)
                            .addComponent(bRelacion1))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNada, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAgregar)
                            .addComponent(jButton1)
                            .addComponent(bEliminar)
                            .addComponent(bRelacion)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1232, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new frmMenuPrincipal().setVisible(true);
    }//GEN-LAST:event_bRegresarActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        // TODO add your handling code here:
        if (!(jNombre.getText().isEmpty() | jTelefono.getText().isEmpty()
                | jDireccion.getText().isEmpty() | jid.getText().isEmpty())) {
            try {
                gtrs.guardar(new Guia(jNombre.getText(), jDireccion.getText(), jTelefono.getText(),
                        Short.parseShort(jid.getText())));
                jNombre.setText("");
                jTelefono.setText("");
                jDireccion.setText("");
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese número enteros para los campos cuantitativos",
                        "Error en la capa 8", JOptionPane.INFORMATION_MESSAGE);
            } catch (MyExcepcion ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al guardar", JOptionPane.ERROR_MESSAGE);
            } finally {
                jid.setText("");
                cargarTablaG();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
        if (tablaG.getSelectedRow() > -1) {
            try {
                UtilGestion.eliminacionCompleta(guias.get(tablaG.getSelectedRow()));
                gtrs.eliminar(guias.get(tablaG.getSelectedRow()));
            } catch (MyExcepcion ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Error al Eliminar", JOptionPane.ERROR_MESSAGE);
            } finally {
                cargarTablaG();
                itinerarios = itrs.listar();
                cargarTablaI();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor elija la fila a eliminar",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (tablaG.getSelectedRow() > -1 & !(jNombre.getText().isEmpty() | jTelefono.getText().isEmpty()
                | jDireccion.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Solo el ID no puede ser actualizado",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
            try {
                gtrs.actulizar(new Guia(jNombre.getText(),
                        jDireccion.getText(), jTelefono.getText(), guias.get(tablaG.getSelectedRow()).getId()));
                jNombre.setText("");
                jTelefono.setText("");
                jDireccion.setText("");
                jid.setText("");
            } catch (MyExcepcion ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al Actualizar", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRelacionActionPerformed
        // TODO add your handling code here:
        int contador = 0;
        if (tablaG.getSelectedRow() > -1) {
            for (Itinerario i : guias.get(tablaG.getSelectedRow()).getItinerarios()) {
                for (Itinerario ii : itinerarios) {
                    if (i.equals(ii)) {
                        guias.get(tablaG.getSelectedRow()).getItinerarios().
                                set(guias.get(tablaG.getSelectedRow()).getItinerarios().indexOf(i), ii);
                    }
                }
            }
            itinerarios = guias.get(tablaG.getSelectedRow()).getItinerarios();
            cargarTablaGI();
            bandera = true;
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila al cuál desea acceder a los itinerarios",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bRelacionActionPerformed

    private void bAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregar1ActionPerformed
        // TODO add your handling code here:
        if (tablaG.getSelectedRow() > -1 & tablaI.getSelectedRow() > -1 & !bandera) {
            Guia guia = guias.get(tablaG.getSelectedRow());
            Itinerario itinerario = itinerarios.get(tablaI.getSelectedRow());
            if (!guia.getItinerarios().contains(itinerario)) {
                guia.agregarItinerario(itinerario);
                itinerario.agregarGuia(guia);
                try {
                    gtrs.actulizar(guia);
                    itrs.actulizar(itinerario);
                    JOptionPane.showMessageDialog(null, "Itinerario agregado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } catch (MyExcepcion ex) {
                    Logger.getLogger(frmGuia.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    cargarTablaI();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El itinerario ya está en la lista de " + guia.getNombre(),
                        "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Si desea agregar un itinerario agregelos desde la lista completa",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bAgregar1ActionPerformed

    private void bEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminar1ActionPerformed
        // TODO add your handling code here:
        if (tablaG.getSelectedRow() > -1 & tablaI.getSelectedRow() > -1 & bandera) {
            Guia guia = guias.get(tablaG.getSelectedRow());
            Itinerario itinerario = itinerarios.get(tablaI.getSelectedRow());
            if (guia.getItinerarios().contains(itinerario)) {
                guia.eliminarItinerario(itinerario);
                itinerario.eliminarGuia(guia);
                try {
                    gtrs.actulizar(guia);
                    itrs.actulizar(itinerario);
                } catch (MyExcepcion ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Aviso", JOptionPane.ERROR_MESSAGE);
                } finally {
                    cargarTablaI();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se puede eliminar el itinerario pues no está en la lista del guia.",
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Si desea eliminar un itinerario eliminelo desde la lista del Guia",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bEliminar1ActionPerformed

    private void bOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrdenarActionPerformed
        // TODO add your handling code here:
        if (cBox.getSelectedIndex() == 0) {
            Guia.bandera = false;
            if (rAscendente.isSelected()) {
                Collections.sort(guias, Collections.reverseOrder());
            } else if (rDescendente.isSelected()) {
                Collections.sort(guias);
            }
        } else if (cBox.getSelectedIndex() == 1) {
            Guia.bandera = true;
            if (rAscendente.isSelected()) {
                Collections.sort(guias);
            } else if (rDescendente.isEnabled()) {
                Collections.sort(guias, Collections.reverseOrder());
            }
        }
        cargarTablaG();
    }//GEN-LAST:event_bOrdenarActionPerformed

    private void bOrdenar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrdenar1ActionPerformed
        // TODO add your handling code here:
        if (cBoxO.getSelectedIndex() == 0) {
            Itinerario.bandera = false;
            if (rAscendente1.isSelected()) {
                Collections.sort(itinerarios, Collections.reverseOrder());
            } else if (rDescendente1.isSelected()) {
                Collections.sort(itinerarios);
            }
        } else if (cBoxO.getSelectedIndex() == 1) {
            Itinerario.bandera = true;
            if (rAscendente.isSelected()) {
                Collections.sort(itinerarios);
            } else if (rDescendente.isEnabled()) {
                Collections.sort(itinerarios, Collections.reverseOrder());
            }
        }
        cargarTablaI();
    }//GEN-LAST:event_bOrdenar1ActionPerformed

    private void bRelacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRelacion1ActionPerformed
        // TODO add your handling code here:
        itinerarios = itrs.listar();
        cargarTablaI();
        bandera = false;
    }//GEN-LAST:event_bRelacion1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGuia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bAgregar1;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bEliminar1;
    private javax.swing.JButton bOrdenar;
    private javax.swing.JButton bOrdenar1;
    private javax.swing.JButton bRegresar;
    private javax.swing.JButton bRelacion;
    private javax.swing.JButton bRelacion1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cBox;
    private javax.swing.JComboBox<String> cBoxO;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jDireccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jNada;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTelefono;
    private javax.swing.JTextField jid;
    private javax.swing.JRadioButton rAscendente;
    private javax.swing.JRadioButton rAscendente1;
    private javax.swing.JRadioButton rDescendente;
    private javax.swing.JRadioButton rDescendente1;
    private javax.swing.JTable tablaG;
    private javax.swing.JTable tablaI;
    // End of variables declaration//GEN-END:variables
}
