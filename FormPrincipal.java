package Proyecto;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormPrincipal extends javax.swing.JFrame {

    Conexion conectar = Conexion.getInstance();
    int ID, BanderaGuarda = 0;

    public FormPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_orden = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_titulo = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        lbl_domicilio = new javax.swing.JLabel();
        txt_domicilio = new javax.swing.JTextField();
        lbl_barrio = new javax.swing.JLabel();
        lbl_nacimiento = new javax.swing.JLabel();
        txt_nacimiento = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        opcion_barrio = new javax.swing.JComboBox<>();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        txt_mostrar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_buscar = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        rbtn_nombre = new javax.swing.JRadioButton();
        rbtn_apellido = new javax.swing.JRadioButton();
        rbtn_id = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_titulo.setText("CARGA DE DATOS");

        lbl_id.setText("Id:");

        lbl_nombre.setText("Nombre:");

        lbl_apellido.setText("Apellido:");

        lbl_domicilio.setText("Domicilio:");

        lbl_barrio.setText("Barrio:");

        lbl_nacimiento.setText("Fecha de nacimiento:");

        lbl_telefono.setText("Telefono:");

        lbl_email.setText("Email:");

        opcion_barrio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");

        btn_salir.setText("Salir");

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_consultar.setText("Consultar");

        lbl_buscar.setText("Ingrese la consulta a buscar:");

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscarKeyPressed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        grupo_orden.add(rbtn_nombre);
        rbtn_nombre.setText("Ordenar por nombre");
        rbtn_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn_nombreMouseClicked(evt);
            }
        });

        grupo_orden.add(rbtn_apellido);
        rbtn_apellido.setText("Ordenar por apellido");
        rbtn_apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn_apellidoMouseClicked(evt);
            }
        });

        grupo_orden.add(rbtn_id);
        rbtn_id.setText("Ordenar por ID");
        rbtn_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn_idMouseClicked(evt);
            }
        });

        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_datosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_barrio)
                        .addGap(51, 51, 51)
                        .addComponent(opcion_barrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_id)
                        .addGap(37, 37, 37)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_apellido)
                        .addGap(37, 37, 37)
                        .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_telefono)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_cancelar)
                                .addGap(34, 34, 34)
                                .addComponent(btn_eliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_nuevo)
                                .addGap(46, 46, 46)
                                .addComponent(btn_consultar)))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_nacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nacimiento))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_nombre)
                                    .addComponent(lbl_domicilio))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_email)
                                .addGap(18, 18, 18)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbl_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buscar)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtn_id, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtn_apellido)
                            .addComponent(rbtn_nombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(lbl_titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_modificar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_guardar)
                                .addGap(238, 238, 238)
                                .addComponent(btn_salir)
                                .addGap(57, 57, 57)
                                .addComponent(txt_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_id)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_apellido)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_barrio)
                            .addComponent(opcion_barrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_telefono)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_domicilio)
                            .addComponent(txt_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nacimiento)
                            .addComponent(txt_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_email)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_salir)
                    .addComponent(txt_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar)
                    .addComponent(btn_nuevo)
                    .addComponent(btn_consultar))
                .addGap(43, 43, 43)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtn_id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtn_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtn_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_buscar)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar)))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        Connection conexion = conectar.conectar();
        try {
            PreparedStatement insertar;

            if (BanderaGuarda == 0) {
                insertar = conexion.prepareStatement("insert into contactos values(?,?,?,?,?,?,?)");
                insertar.setString(1, "0"); // ID
                insertar.setString(2, txt_nombre.getText().trim()); // Campo Nombre
                insertar.setString(3, txt_apellido.getText().trim()); // Campo Apellido
                insertar.setString(4, txt_domicilio.getText().trim()); // Campo Direccion
                insertar.setString(5, txt_telefono.getText().trim()); // Campo Telefono
                insertar.setString(6, txt_nacimiento.getText().trim()); // Campo Cumple
                insertar.setString(7, opcion_barrio.getSelectedItem().toString()); // Campo Barrio
                insertar.setString(6, txt_email.getText().trim());

            } else {
                insertar = conexion.prepareStatement("UPDATE contactos SET Nombre=?,Apellido=?,Direccion=?,Telefono=?,Cumple=?,Barrio=? where Id=" + ID);

                insertar.setString(1, txt_nombre.getText().trim()); // Campo Nombre
                insertar.setString(2, txt_apellido.getText().trim()); // Campo Apellido
                insertar.setString(3, txt_domicilio.getText().trim()); // Campo Direccion
                insertar.setString(4, txt_telefono.getText().trim()); // Campo Telefono
                insertar.setString(5, txt_nacimiento.getText().trim()); // Campo Cumple
                insertar.setString(6, opcion_barrio.getSelectedItem().toString()); // Campo Barrio
                insertar.setString(5, txt_email.getText().trim());
            }
            insertar.executeUpdate();
            conectar.cerrarConexion();

            if (BanderaGuarda == 0) {
                JOptionPane.showMessageDialog(null, "Los Datos se Agregaron exitosamente ");
            } else {
                JOptionPane.showMessageDialog(null, "Los Datos se Modificaron correctamente ");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        LimpiarCasilla();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        buscar();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed

        DesbloqueCasilla();
        LimpiarCasilla();

        BanderaGuarda = 0;
        txt_mostrar.setText(Integer.toString(BanderaGuarda));
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed

        DesbloqueCasilla();

        BanderaGuarda = 1; // Cargo la Bandera con el valor 1 para saber que viene de modificar
        ID = Integer.parseInt(txt_id.getText());
        txt_mostrar.setText(Integer.toString(BanderaGuarda));
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed

        buscar();
    }//GEN-LAST:event_txt_buscarKeyPressed

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        buscar();
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void rbtn_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_idMouseClicked

        buscar();
    }//GEN-LAST:event_rbtn_idMouseClicked

    private void rbtn_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_nombreMouseClicked

        buscar();
    }//GEN-LAST:event_rbtn_nombreMouseClicked

    private void rbtn_apellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_apellidoMouseClicked
        buscar();
    }//GEN-LAST:event_rbtn_apellidoMouseClicked

    private void tabla_datosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_datosMousePressed

        if (evt.getClickCount() == 2) {
        int fila = tabla_datos.getSelectedRow();
        int cod  ;

        cod = Integer.parseInt(tabla_datos.getValueAt(fila, 6).toString()) - 1;

        txt_id.setText(tabla_datos.getValueAt(fila, 0).toString());
        txt_nombre.setText(tabla_datos.getValueAt(fila, 1).toString());
        txt_apellido.setText(tabla_datos.getValueAt(fila, 2).toString());
        txt_domicilio.setText(tabla_datos.getValueAt(fila, 3).toString());
        txt_telefono.setText(tabla_datos.getValueAt(fila, 4).toString());
        txt_nacimiento.setText(tabla_datos.getValueAt(fila, 5).toString());
        txt_email.setText(tabla_datos.getValueAt(fila, 5).toString());

        opcion_barrio.setSelectedIndex(cod);
        }
    }//GEN-LAST:event_tabla_datosMousePressed

    
public void buscar() {

        DefaultTableModel modelo = new DefaultTableModel();
        tabla_datos.setModel(modelo);

        try {
            Connection conexion = conectar.conectar();
            PreparedStatement seleccionar;
            ResultSet consulta = null;
            String buscar = txt_buscar.getText();

            if (rbtn_id.isSelected()) {
                seleccionar = conexion.prepareStatement("Select * from contactos where Apellido like CONCAT(?,'%') order by 1");

                seleccionar.setString(1, buscar);
                consulta = seleccionar.executeQuery();
            }
            if (rbtn_nombre.isSelected()) {
                seleccionar = conexion.prepareStatement("Select * from contactos where Apellido like CONCAT(?,'%') order by 2");

                seleccionar.setString(1, buscar);
                consulta = seleccionar.executeQuery();
            }
            if (rbtn_apellido.isSelected()) {
                seleccionar = conexion.prepareStatement("Select * from contactos where Apellido like CONCAT(?,'%') order by 3");

                seleccionar.setString(1, buscar);
                consulta = seleccionar.executeQuery();
            }

            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Domicilio");
            modelo.addColumn("Cumpleaños");
            modelo.addColumn("Barrio");
            modelo.addColumn("Telefono");
            modelo.addColumn("Email");

            int cantColumnas = consulta.getMetaData().getColumnCount();
            while (consulta.next()) {
                Object[] filas = new Object[cantColumnas];
                for (int i = 0; i < cantColumnas; i++) {
                    filas[i] = consulta.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

            conectar.cerrarConexion();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }

    private void LimpiarCasilla() {
        txt_id.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_domicilio.setText("");
        txt_telefono.setText("");
        txt_nacimiento.setText("");
        txt_email.setText("");
    }

    private void BloquearCasilla() {

        txt_id.setEnabled(false);
        txt_nombre.setEnabled(false);
        txt_apellido.setEnabled(false);
        txt_domicilio.setEnabled(false);
        txt_telefono.setEnabled(false);
        txt_nacimiento.setEnabled(false);
        txt_email.setEnabled(false);

    }

    private void DesbloqueCasilla() {
        txt_id.setEnabled(false);
        txt_nombre.setEnabled(true);
        txt_apellido.setEnabled(true);
        txt_domicilio.setEnabled(true);
        txt_telefono.setEnabled(true);
        txt_nacimiento.setEnabled(true);
        txt_email.setEnabled(true);
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
            java.util.logging.Logger.getLogger(FormPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup grupo_orden;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_barrio;
    private javax.swing.JLabel lbl_buscar;
    private javax.swing.JLabel lbl_domicilio;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nacimiento;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JComboBox<String> opcion_barrio;
    private javax.swing.JRadioButton rbtn_apellido;
    private javax.swing.JRadioButton rbtn_id;
    private javax.swing.JRadioButton rbtn_nombre;
    private javax.swing.JTable tabla_datos;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_domicilio;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_mostrar;
    private javax.swing.JTextField txt_nacimiento;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
