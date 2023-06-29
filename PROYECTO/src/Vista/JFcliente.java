
package Vista;

import Negocio.ConexionSQL;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class JFcliente extends javax.swing.JFrame {
    
    ConexionSQL con = new ConexionSQL();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
 
    public JFcliente() {
        initComponents();
        this.setLocationRelativeTo(this);
        tabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFnombres = new javax.swing.JTextField();
        jTFcedula = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jBagregar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jBmodificar = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jBeliminar = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jBnuevo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        JBRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 134, 190));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" REGISTRO CLIENTES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        jLabel3.setText("EMPRESA DE VUELOS");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Cedula");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Nombres");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 30));

        jTFnombres.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        background.add(jTFnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 413, -1));

        jTFcedula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTFcedula.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jTFcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 413, -1));

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        jBagregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBagregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBagregar.setText("AGREGAR");
        jBagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBagregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jBagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jBagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        background.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 40));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));

        jBmodificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBmodificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBmodificar.setText("MODIFICAR");
        jBmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBmodificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBmodificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));

        jBeliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBeliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBeliminar.setText("ELIMINAR");
        jBeliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBeliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBeliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));

        jBnuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBnuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBnuevo.setText("NUEVO");
        jBnuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBnuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBnuevoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 100, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("LISTA DE CLIENTES");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 560, -1));

        JBRegresar.setText("Regresar");
        JBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRegresarActionPerformed(evt);
            }
        });
        background.add(JBRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        JTablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cedula"
            }
        ));
        JTablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTablaDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTablaDatos);

        background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 560, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBnuevoMouseClicked
        // TODO add your handling code here:
        nuevo();
    }//GEN-LAST:event_jBnuevoMouseClicked

    private void jBagregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBagregarMouseClicked
        // TODO add your handling code here:
        agregar();
        tabla();
        nuevo();
    }//GEN-LAST:event_jBagregarMouseClicked

    private void jBmodificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBmodificarMouseClicked
        // TODO add your handling code here:
        modificar();
        tabla();
        nuevo();
    }//GEN-LAST:event_jBmodificarMouseClicked

    private void jBeliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBeliminarMouseClicked
        // TODO add your handling code here:
        eliminar();
        tabla();
        nuevo();
    }//GEN-LAST:event_jBeliminarMouseClicked

    private void JBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRegresarActionPerformed
        // TODO add your handling code here:
        JFopciones op = new JFopciones();
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JBRegresarActionPerformed

    private void JTablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTablaDatosMouseClicked

        int fila = JTablaDatos.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "Usuario no seleccionado");
        }else{
            String nombre = (String)JTablaDatos.getValueAt(fila, 0);
            String cedula = (String)JTablaDatos.getValueAt(fila, 1);
            jTFnombres.setText(nombre);
            jTFcedula.setText(cedula);

            jTFcedula.setEditable(false);
            jTFcedula.setEnabled(false);
        }
    }//GEN-LAST:event_JTablaDatosMouseClicked

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
            java.util.logging.Logger.getLogger(JFcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFcliente().setVisible(true);
            }
        });
    }
    
    void tabla(){
        String sql = "select * from clientes";
        try{
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[]clientes = new Object[2];
            modelo = (DefaultTableModel)JTablaDatos.getModel();
            while(rs.next()){
                clientes[0] = rs.getString("Nombre");
                clientes[1] = rs.getString("Cedula");
                modelo.addRow(clientes);
            }
            JTablaDatos.setModel(modelo);
            
        }catch(Exception e){
        }
    }
    
    void agregar(){
        String nombre = jTFnombres.getText();
        String cedula = jTFcedula.getText();
        if(nombre.isEmpty() || cedula.isEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Los campos solicitados no pueden esta vacios!");
            limpiartabla();
        }else{
            String sql = "insert into clientes (Nombre,Cedula) values ('"+nombre+"','"+cedula+"')";
            try{
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                limpiartabla();
                
            }catch(Exception e){
                        
            }
        }
        
    }
    
    void modificar(){
        String nom = jTFnombres.getText();
        String ced = jTFcedula.getText();
        String sql = "update clientes set Nombre = '" + nom + "', Cedula = '" + ced + "' where Cedula = '" + ced + "'";
        
        if(nom.isEmpty() || ced.isEmpty()){
            getToolkit().beep();
            limpiartabla();
            JOptionPane.showMessageDialog(null, "Los campos solicitados no pueden esta vacios!");
        }else{
            
            try{
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                limpiartabla();
            }catch(Exception e){
                
            }
        }
    }
    
    void eliminar(){
        String nom = jTFnombres.getText();
        int select = JTablaDatos.getSelectedRow();
        if(select == -1){
            JOptionPane.showMessageDialog(null, "No hay filas seleccionado");
            limpiartabla();
        }else{  
            String sql = "delete from clientes where Nombre = '" + nom + "'";
            try{
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                limpiartabla();
            }catch(Exception e){
                
            }
        }
    }
    
    
    void nuevo(){
        jTFnombres.setText("");
        jTFcedula.setText("");
        jTFcedula.setEditable(true);
        jTFcedula.setEnabled(true);
        
    }
    
    void limpiartabla(){
        for(int i = 0; i < JTablaDatos.getRowCount(); i++){
            modelo.removeRow(i);
            i -= 1;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBRegresar;
    private javax.swing.JTable JTablaDatos;
    private javax.swing.JPanel background;
    private javax.swing.JLabel jBagregar;
    private javax.swing.JLabel jBeliminar;
    private javax.swing.JLabel jBmodificar;
    private javax.swing.JLabel jBnuevo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFcedula;
    private javax.swing.JTextField jTFnombres;
    // End of variables declaration//GEN-END:variables
}
