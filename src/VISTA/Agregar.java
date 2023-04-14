/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import DAO.UsuariosDAO;
import MODEL.UsuariosDAORelacional;
import MODEL.UsuariosGT;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;

public class Agregar extends javax.swing.JFrame {
int estado;
  
    public Agregar() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        j_nombre = new javax.swing.JTextField();
        j_apellido = new javax.swing.JTextField();
        j_telefono = new javax.swing.JTextField();
        j_direccion = new javax.swing.JTextField();
        j_correo = new javax.swing.JTextField();
        j_contrasenia = new javax.swing.JPasswordField();
        j_fecha_nacimiento = new javax.swing.JFormattedTextField();
        j_activo = new javax.swing.JRadioButton();
        j_inactivo = new javax.swing.JRadioButton();
        j_guardar = new javax.swing.JButton();
        j_cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(108, 146, 134));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("AGREGAR USUARIO");

        j_nombre.setBackground(new java.awt.Color(40, 157, 210));

        j_apellido.setBackground(new java.awt.Color(40, 157, 210));

        j_telefono.setBackground(new java.awt.Color(40, 157, 210));

        j_direccion.setBackground(new java.awt.Color(40, 157, 210));

        j_correo.setBackground(new java.awt.Color(40, 157, 210));

        j_contrasenia.setBackground(new java.awt.Color(40, 157, 210));
        j_contrasenia.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        j_contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_contraseniaActionPerformed(evt);
            }
        });

        j_fecha_nacimiento.setBackground(new java.awt.Color(40, 157, 210));
        j_fecha_nacimiento.setFormatterFactory(new javax.swing.JFormattedTextField.AbstractFormatterFactory() {
            public javax.swing.JFormattedTextField.AbstractFormatter
            getFormatter(javax.swing.JFormattedTextField tf){

                try {
                    return new javax.swing.text.MaskFormatter("####/##/##");
                } catch (java.text.ParseException pe){
                    pe.printStackTrace();
                }
                return null;
            }
        });

        j_activo.setBackground(new java.awt.Color(40, 157, 210));
        j_activo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        j_activo.setText("Activo");

        j_inactivo.setBackground(new java.awt.Color(40, 157, 210));
        j_inactivo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        j_inactivo.setText("Inactivo");

        j_guardar.setBackground(new java.awt.Color(40, 157, 210));
        j_guardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        j_guardar.setText("Guardar");
        j_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_guardarActionPerformed(evt);
            }
        });

        j_cancelar.setBackground(new java.awt.Color(40, 157, 210));
        j_cancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        j_cancelar.setText("Cancelar");
        j_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_cancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Direccion");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Correo");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Fecha Nacimiento");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Contraseña");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(j_guardar)
                            .addComponent(j_activo))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j_cancelar)
                            .addComponent(j_inactivo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(j_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(j_telefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(j_direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(j_correo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(j_fecha_nacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(j_contrasenia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(j_apellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {j_apellido, j_contrasenia, j_correo, j_direccion, j_fecha_nacimiento, j_nombre, j_telefono});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_activo)
                    .addComponent(j_inactivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_guardar)
                    .addComponent(j_cancelar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {j_apellido, j_contrasenia, j_correo, j_direccion, j_fecha_nacimiento, j_nombre, j_telefono});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j_contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_contraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_contraseniaActionPerformed

    private void j_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_guardarActionPerformed
        if (j_nombre.getText().isEmpty() || j_apellido.getText().isEmpty() || j_telefono.getText().isEmpty() || j_direccion.getText().isEmpty() || j_correo.getText().isEmpty() || j_fecha_nacimiento.getText().isEmpty() || j_contrasenia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llena todos los campos");
        } else {
            enviar();
            sguardar();
        }
    }//GEN-LAST:event_j_guardarActionPerformed

    private void j_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_cancelarActionPerformed
        
        UsuariosVista uv = new UsuariosVista();
        uv.setVisible(true);
        dispose();
    }//GEN-LAST:event_j_cancelarActionPerformed

    
    public void sguardar(){
    
    if (j_activo.isSelected()) {
    estado = 1;
} else if (j_inactivo.isSelected()) {
    estado = 2;
}
        }
      
    private void enviar(){
                                    // nombre,apellido,telefono,direccion,correo,fecha_nacimiento,contrasenia,activo
     UsuariosGT sgt = new UsuariosGT(j_nombre.getText(), j_apellido.getText(), Integer.parseInt(j_telefono.getText()), j_direccion.getText(), j_correo.getText(), j_fecha_nacimiento.getText(), estado , j_contrasenia.getText());
     UsuariosDAORelacional ud = new UsuariosDAORelacional();
     ud.crear(sgt);
     UsuariosVista Newframe = new UsuariosVista();
     Newframe.setVisible(true);
     dispose();
  
     }
    

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton j_activo;
    private javax.swing.JTextField j_apellido;
    private javax.swing.JButton j_cancelar;
    private javax.swing.JPasswordField j_contrasenia;
    private javax.swing.JTextField j_correo;
    private javax.swing.JTextField j_direccion;
    private javax.swing.JFormattedTextField j_fecha_nacimiento;
    private javax.swing.JButton j_guardar;
    private javax.swing.JRadioButton j_inactivo;
    private javax.swing.JTextField j_nombre;
    private javax.swing.JTextField j_telefono;
    // End of variables declaration//GEN-END:variables
}
