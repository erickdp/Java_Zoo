/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoolomania.funcional.vista;

import com.zoolomania.funcional.control.EspecieTrs;
import com.zoolomania.funcional.control.HabitatTrs;
import com.zoolomania.funcional.control.MyExcepcion;
import com.zoolomania.funcional.control.UtilGestion;
import com.zoolomania.funcional.modelo.Especie;
import com.zoolomania.funcional.modelo.Habitat;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick Díaz
 */
public class frmHabitat extends javax.swing.JFrame {

    HabitatTrs htrs = new HabitatTrs();
    EspecieTrs etrs = new EspecieTrs();
    List<Habitat> habitats = (List<Habitat>) htrs.listar();
    List<Especie> especies = (List<Especie>) etrs.listar();
    boolean bandera = false;

    public void cargarTablaE() {
        Object[] columna = {"Marca", "Especie", "Nombre Científico", "Descripción"};
        DefaultTableModel modeloE = new DefaultTableModel(columna, 0);
        for (Especie e : especies) {
            short marca = e.getMarca();
            String especie = e.getNombreEspecie();
            String nombreC = e.getNombreCientifico();
            String descripcion = e.getDescripcion();
            Object[] fila = {marca, especie, nombreC, descripcion};
            modeloE.addRow(fila);
        }
        this.tablaE.setModel(modeloE);
    }

    private void cargarTablaH() {
        Object[] columna = {"ID", "Habitat", "Clima", "Vegetación", "Continente(s)"};
        DefaultTableModel modeloH = new DefaultTableModel(columna, 0);
        for (Habitat h : habitats) {
            short id = h.getId();
            String nombreH = h.getNombreHabitat();
            String clima = h.getClima();
            String vegetacion = h.getVegetacion();
            String continenete = h.getContinente();
            Object[] fila = {id, nombreH, clima, vegetacion, continenete};
            modeloH.addRow(fila);
        }
        this.tablaH.setModel(modeloH);
    }

    /**
     * Creates new form frmHabitat
     */
    public frmHabitat() {
        initComponents();
        setLocationRelativeTo(null);
        cargarTablaE();
        cargarTablaH();
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
        jLabel1 = new javax.swing.JLabel();
        jid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jClima = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jVegetacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jContinente = new javax.swing.JTextArea();
        bAgregar = new javax.swing.JButton();
        bActualizar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bOrdenar = new javax.swing.JButton();
        bOrdenarO = new javax.swing.JButton();
        bAgregarO = new javax.swing.JButton();
        bEliminarO = new javax.swing.JButton();
        bRegresar = new javax.swing.JButton();
        bVerTodoO = new javax.swing.JButton();
        bRelaciones = new javax.swing.JButton();
        rDescendente = new javax.swing.JRadioButton();
        rAscendente = new javax.swing.JRadioButton();
        cBox = new javax.swing.JComboBox<>();
        rAscendenteO = new javax.swing.JRadioButton();
        rDescendenteO = new javax.swing.JRadioButton();
        cBoxO = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaH = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaE = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Nombre Habitat");

        jLabel3.setText("Clima");

        jLabel4.setText("Vegetación");

        jLabel5.setText("Continente(s)");

        jContinente.setColumns(20);
        jContinente.setRows(5);
        jScrollPane1.setViewportView(jContinente);

        bAgregar.setText("Agregar");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });

        bActualizar.setText("Actualizar");
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bOrdenar.setText("Ordenar");
        bOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrdenarActionPerformed(evt);
            }
        });

        bOrdenarO.setText("Ordenar");
        bOrdenarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrdenarOActionPerformed(evt);
            }
        });

        bAgregarO.setText("Agregar");
        bAgregarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarOActionPerformed(evt);
            }
        });

        bEliminarO.setText("Eliminar");
        bEliminarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarOActionPerformed(evt);
            }
        });

        bRegresar.setText("Regresar");
        bRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresarActionPerformed(evt);
            }
        });

        bVerTodoO.setText("Ver Todo");
        bVerTodoO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerTodoOActionPerformed(evt);
            }
        });

        bRelaciones.setText("Ver relaciones");
        bRelaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRelacionesActionPerformed(evt);
            }
        });

        buttonGroup1.add(rDescendente);
        rDescendente.setText("Descendente");

        buttonGroup1.add(rAscendente);
        rAscendente.setSelected(true);
        rAscendente.setText("Ascendente");

        cBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "ID" }));

        buttonGroup2.add(rAscendenteO);
        rAscendenteO.setSelected(true);
        rAscendenteO.setText("Ascendente");

        buttonGroup2.add(rDescendenteO);
        rDescendenteO.setText("Descendente");

        cBoxO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "ID" }));

        tablaH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaH);

        tablaE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jClima, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jVegetacion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bRelaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bEliminar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(bRegresar)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rAscendenteO)
                                        .addGap(30, 30, 30)
                                        .addComponent(rDescendenteO)
                                        .addGap(48, 48, 48)
                                        .addComponent(cBoxO, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bOrdenarO)
                                        .addGap(18, 18, 18)
                                        .addComponent(bAgregarO)
                                        .addGap(33, 33, 33)
                                        .addComponent(bEliminarO)
                                        .addGap(39, 39, 39)
                                        .addComponent(bVerTodoO))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bOrdenar)
                        .addGap(36, 36, 36)
                        .addComponent(rAscendente)
                        .addGap(30, 30, 30)
                        .addComponent(rDescendente)
                        .addGap(48, 48, 48)
                        .addComponent(cBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bAgregar)
                                    .addComponent(bActualizar)
                                    .addComponent(bEliminar)
                                    .addComponent(bOrdenarO)
                                    .addComponent(bAgregarO)
                                    .addComponent(bEliminarO)
                                    .addComponent(bVerTodoO)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bRegresar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jVegetacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bRelaciones))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rDescendenteO)
                            .addComponent(rAscendenteO)
                            .addComponent(cBoxO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bOrdenar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rDescendente)
                                .addComponent(rAscendente)
                                .addComponent(cBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if (!validarCampos()) {
            try {
                htrs.guardar(new Habitat(jNombre.getText(), jClima.getText(), jVegetacion.getText(),
                        jContinente.getText(), Short.parseShort(jid.getText())));
                jNombre.setText("");
                jClima.setText("");
                jVegetacion.setText("");
                jContinente.setText("");
            } catch (MyExcepcion ex) {
                Logger.getLogger(frmHabitat.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                jid.setText("");
                cargarTablaH();
            }
        } else {

        }
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
        if (tablaH.getSelectedRow() > -1) {
            try {
                UtilGestion.eliminacionCompleta(habitats.get(tablaH.getSelectedRow()));
                htrs.eliminar(habitats.get(tablaH.getSelectedRow()));
            } catch (MyExcepcion ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al Guardar", JOptionPane.ERROR_MESSAGE);
            } finally {
                habitats = (List<Habitat>) htrs.listar();
                cargarTablaE();
                cargarTablaH();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila a eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        // TODO add your handling code here:
        if (!validarCampos() & tablaH.getSelectedRow() > -1) {
            JOptionPane.showMessageDialog(null, "El ID no se puede modificar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            try {
                htrs.actulizar(new Habitat(jNombre.getText(), jClima.getText(), jVegetacion.getText(),
                        jContinente.getText(), habitats.get(tablaH.getSelectedRow()).getId()));
                jNombre.setText("");
                jClima.setText("");
                jVegetacion.setText("");
                jContinente.setText("");
            } catch (MyExcepcion ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al Actualizar", JOptionPane.ERROR_MESSAGE);
            } finally {
                jid.setText("");
                cargarTablaH();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila a eliminar "
                    + "o compuebe que los campos estén llenos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bActualizarActionPerformed

    private void bRelacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRelacionesActionPerformed
        // TODO add your handling code here:
        if (tablaH.getSelectedRow() > -1) {
            especies = habitats.get(tablaH.getSelectedRow()).getEspecies();
            cargarTablaE();
            bandera = true;
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a la que quiere ver sus Especies", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bRelacionesActionPerformed

    private void bAgregarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarOActionPerformed
        // TODO add your handling code here:
        if (tablaH.getSelectedRow() > -1 & tablaE.getSelectedRow() > -1 & !bandera) {
            Habitat habitat = habitats.get(tablaH.getSelectedRow());
            Especie especie = especies.get(tablaE.getSelectedRow());
            if (!habitat.getEspecies().contains(especie)) {
                habitat.agregarEspecie(especie);
                especie.agregarHabitat(habitat);
                try {
                    htrs.actulizar(habitat);
                    etrs.actulizar(especie);
                    JOptionPane.showMessageDialog(null, "Se a agregado especie al Habitat", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } catch (MyExcepcion ex) {
                    Logger.getLogger(frmHabitat.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se puede agregar la especie pues ya está dentro de la lista.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila del habitat a la cual desea agregarle la especie. O salga de las especies del habitat",
                     "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bAgregarOActionPerformed

    private void bEliminarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarOActionPerformed
        // TODO add your handling code here:
        if (tablaH.getSelectedRow() > -1 & tablaE.getSelectedRow() > -1 & bandera) {
            Habitat habitat = habitats.get(tablaH.getSelectedRow());
            Especie especie = especies.get(tablaE.getSelectedRow());
            if (habitat.getEspecies().contains(especie)) {
                habitat.eliminarEspecie(especie);
                especie.elimninarHabitat(habitat);
                try {
                    htrs.actulizar(habitat);
                    etrs.actulizar(especie);
                    JOptionPane.showMessageDialog(null, "Especie Eliminada del Habitat", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } catch (MyExcepcion ex) {
                    Logger.getLogger(frmHabitat.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    cargarTablaE();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se puede eliminar la especie pues no está dentro de la lista.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila del habitat a la cual desea agregarle la especie. O ingrese a las especies del Habitat",
                     "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bEliminarOActionPerformed

    private void bVerTodoOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerTodoOActionPerformed
        // TODO add your handling code here:
        especies = (List<Especie>) etrs.listar();
        habitats = (List<Habitat>) htrs.listar();
        cargarTablaE();
        bandera = false;
    }//GEN-LAST:event_bVerTodoOActionPerformed

    private void bOrdenarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrdenarOActionPerformed
        // TODO add your handling code here:
        if (cBoxO.getSelectedIndex() == 0) {
            Especie.bandera = false;
            if (rAscendenteO.isEnabled()) {
                Collections.sort(especies, Collections.reverseOrder());
            } else if (rDescendenteO.isEnabled()) {
                Collections.sort(especies);
            }
        } else if (cBoxO.getSelectedIndex() == 1) {
            Especie.bandera = true;
            if (rAscendenteO.isEnabled()) {
                Collections.sort(especies, Collections.reverseOrder());
            } else if (rDescendenteO.isEnabled()) {
                Collections.sort(especies);
            }
        }
        cargarTablaE();
    }//GEN-LAST:event_bOrdenarOActionPerformed

    private void bOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrdenarActionPerformed
        // TODO add your handling code here:
        if (cBox.getSelectedIndex() == 0) {
            Habitat.bandera = false;
            if (rAscendente.isEnabled()) {
                Collections.sort(habitats, Collections.reverseOrder());
            } else if (rDescendente.isEnabled()){
                Collections.sort(habitats);
            }
        } else if(cBox.getSelectedIndex() == 1){
            Habitat.bandera = true;
            if (rAscendente.isEnabled()) {
                Collections.sort(habitats);
            } else if (rDescendente.isEnabled()){
                Collections.sort(habitats, Collections.reverseOrder());
            }
        }
        cargarTablaH();
    }//GEN-LAST:event_bOrdenarActionPerformed

    private boolean validarCampos() {
        if (jNombre.getText().isEmpty() | jVegetacion.getText().isEmpty()
                | jClima.getText().isEmpty() | jContinente.getText().isEmpty() | jid.getText().isEmpty()) {
            return true;
        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(frmHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHabitat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bAgregarO;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bEliminarO;
    private javax.swing.JButton bOrdenar;
    private javax.swing.JButton bOrdenarO;
    private javax.swing.JButton bRegresar;
    private javax.swing.JButton bRelaciones;
    private javax.swing.JButton bVerTodoO;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cBox;
    private javax.swing.JComboBox<String> cBoxO;
    private javax.swing.JTextField jClima;
    private javax.swing.JTextArea jContinente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jVegetacion;
    private javax.swing.JTextField jid;
    private javax.swing.JRadioButton rAscendente;
    private javax.swing.JRadioButton rAscendenteO;
    private javax.swing.JRadioButton rDescendente;
    private javax.swing.JRadioButton rDescendenteO;
    private javax.swing.JTable tablaE;
    private javax.swing.JTable tablaH;
    // End of variables declaration//GEN-END:variables
}