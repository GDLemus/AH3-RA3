
package VISTA;

import javax.swing.table.DefaultTableModel;
import MODEL.UsuariosGT;
import MODEL.UsuariosDAORelacional;        

public class UsuariosVista extends javax.swing.JFrame {

    DefaultTableModel tabla2;
    
    public UsuariosVista() {
        initComponents();
        datos();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        j_tabla = new javax.swing.JTable();
        j_agregar = new javax.swing.JButton();
        j_modificar = new javax.swing.JButton();
        j_eliminar = new javax.swing.JButton();
        j_salir = new javax.swing.JButton();
        hola = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(108, 146, 134));

        jScrollPane1.setBackground(new java.awt.Color(108, 146, 134));

        j_tabla.setBackground(new java.awt.Color(108, 146, 134));
        j_tabla.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        j_tabla.setForeground(new java.awt.Color(0, 0, 0));
        j_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        j_tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        j_tabla.setFocusable(false);
        j_tabla.setGridColor(new java.awt.Color(0, 169, 128));
        j_tabla.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(j_tabla);

        j_agregar.setBackground(new java.awt.Color(40, 157, 210));
        j_agregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        j_agregar.setForeground(new java.awt.Color(0, 0, 0));
        j_agregar.setText("Agregar Usuario");
        j_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_agregarActionPerformed(evt);
            }
        });

        j_modificar.setBackground(new java.awt.Color(40, 157, 210));
        j_modificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        j_modificar.setForeground(new java.awt.Color(0, 0, 0));
        j_modificar.setText("Modificar Usuario");
        j_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_modificarActionPerformed(evt);
            }
        });

        j_eliminar.setBackground(new java.awt.Color(40, 157, 210));
        j_eliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        j_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        j_eliminar.setText("Eliminar Usuario");
        j_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_eliminarActionPerformed(evt);
            }
        });

        j_salir.setBackground(new java.awt.Color(40, 157, 210));
        j_salir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        j_salir.setForeground(new java.awt.Color(0, 0, 0));
        j_salir.setText("Salir");
        j_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_salirActionPerformed(evt);
            }
        });

        hola.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(40, 157, 210));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HOTELES GT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j_salir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hola)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_salir)
                    .addComponent(hola)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_modificar)
                    .addComponent(j_eliminar))
                .addContainerGap(48, Short.MAX_VALUE))
        );

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

    public void informacion(UsuariosGT usuario){
    
    hola.setText("Usuario: "+ usuario.getNombre() + " "+usuario.getApellido());
     
        if (usuario.getRol_id() == 2) {
            j_modificar.setVisible(false);
            j_eliminar.setVisible(false);
        } else {
        }
    
    
    }

    
    
    
    private void j_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_agregarActionPerformed
       
         Agregar ag = new Agregar();
         ag.setVisible(true);
         dispose();
    }//GEN-LAST:event_j_agregarActionPerformed

    private void j_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_salirActionPerformed
       
    System.exit(0);    
    
    }//GEN-LAST:event_j_salirActionPerformed

    private void j_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_modificarActionPerformed
    
         enviar_datos();

    }//GEN-LAST:event_j_modificarActionPerformed

    private void j_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_eliminarActionPerformed
         Eliminar ml = new Eliminar();
         ml.setVisible(true);
         dispose();
         eliminar_datos();
    }//GEN-LAST:event_j_eliminarActionPerformed

    private void enviar_datos(){
    
    int usuario_id = (int) j_tabla.getValueAt(j_tabla.getSelectedRow(), 0);
        
         Modificar mu = new Modificar();
         mu.Mostrar(usuario_id);
         mu.setVisible(true);
         dispose();
       
    }
    
    private void eliminar_datos(){
    
    int usuario_id = (int) j_tabla.getValueAt(j_tabla.getSelectedRow(), 0);
        
//         Eliminar ml = new Eliminar();
//         ml.Mostrar(usuario_id);
//         ml.setVisible(true);
//         dispose();

         Eliminar ml = new Eliminar();
         ml.EliMostrar(usuario_id);
         ml.setVisible(true);
         dispose();
         UsuariosDAORelacional sd = new UsuariosDAORelacional();
         sd.eliminar(usuario_id);
         
         
         
//         UsuariosVista uv = new UsuariosVista();
//         uv.setVisible(true);
//         dispose();
  
    
    }
    
    private void datos(){
    
    String columnas []={"No.","Nombre","Apellido","Rol","Correo","Telefono"};
    tabla2 = new DefaultTableModel(null, columnas);
    UsuariosDAORelacional sd = new UsuariosDAORelacional();    
    for (UsuariosGT dat : sd.listar()) {
          Object ayuda [] = new Object [6];
          ayuda[0] = dat.getUsuario_id();
          ayuda[1] = dat.getNombre();
          ayuda[2] = dat.getApellido();
          ayuda[3] = dat.getRol_id();
          ayuda[4] = dat.getCorreo_electronico();
          ayuda[5] = dat.getTelefono();
          tabla2.addRow(ayuda);
        }
    
    j_tabla.setModel(tabla2);
    
    }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hola;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton j_agregar;
    private javax.swing.JButton j_eliminar;
    private javax.swing.JButton j_modificar;
    private javax.swing.JButton j_salir;
    private javax.swing.JTable j_tabla;
    // End of variables declaration//GEN-END:variables
}
