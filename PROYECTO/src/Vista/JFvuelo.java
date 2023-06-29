
package Vista;

import Negocio.ConexionSQL;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JFvuelo extends javax.swing.JFrame {
    
    ConexionSQL con = new ConexionSQL();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;

    /**
     * Creates new form JFvuelo
     */
    public JFvuelo() {
        initComponents();
        this.setLocationRelativeTo(this);
        tabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTFvueloId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JTFSalida = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        JBAgregar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        JBNuevo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        JBEliminar = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        JBModificar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTabla = new javax.swing.JTable();
        JBRegresar = new javax.swing.JButton();
        JTFDestino = new javax.swing.JTextField();
        JTFAerolinea = new javax.swing.JTextField();
        JTFLugarOrigen = new javax.swing.JTextField();

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
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        jLabel3.setText("EMPRESA DE VUELOS NACIONAL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 134, 190));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRO DE VUELOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 50));

        JTFvueloId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JTFvueloId.setForeground(new java.awt.Color(0, 0, 0));
        JTFvueloId.setText("max 3 caracteres");
        JTFvueloId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFvueloIdMouseClicked(evt);
            }
        });
        jPanel1.add(JTFvueloId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 380, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Vuelo ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Hora de salida");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Aerolinea");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Lugar de origen");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 30));

        JTFSalida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JTFSalida.setForeground(new java.awt.Color(0, 0, 0));
        JTFSalida.setText("Formato: 17h00");
        JTFSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFSalidaMouseClicked(evt);
            }
        });
        JTFSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFSalidaActionPerformed(evt);
            }
        });
        jPanel1.add(JTFSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 380, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Lugar de destino");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 30));

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        JBAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JBAgregar.setText("AGREGAR");
        JBAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(JBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 100, 40));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));

        JBNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JBNuevo.setText("NUEVO");
        JBNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBNuevoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 100, 40));

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));

        JBEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JBEliminar.setText("ELIMINAR");
        JBEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, 40));

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));

        JBModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JBModificar.setText("MODIFICAR");
        JBModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JBModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(JBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("LISTA VUELOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 560, 10));

        JTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Vuelo", "Aerolinea", "Origen", "Destino", "Hora Salida"
            }
        ));
        JTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 560, 220));

        JBRegresar.setText("Regresar");
        JBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(JBRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        JTFDestino.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(JTFDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 380, -1));

        JTFAerolinea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(JTFAerolinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 380, -1));

        JTFLugarOrigen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JTFLugarOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFLugarOrigenActionPerformed(evt);
            }
        });
        jPanel1.add(JTFLugarOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 380, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBAgregarMouseClicked
        // TODO add your handling code here:
        agregar();
        tabla();
        nuevo();
    }//GEN-LAST:event_JBAgregarMouseClicked

    private void JTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTablaMouseClicked
        // TODO add your handling code here:
        int fila = JTabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "No esta seleccionada ninguna fila");
        }else{
            String vueloId = (String)JTabla.getValueAt(fila, 0);
            String aerolinea = (String)JTabla.getValueAt(fila, 1);
            String origen = (String)JTabla.getValueAt(fila, 2);
            String destino = (String)JTabla.getValueAt(fila, 3);
            String horaSalida = (String)JTabla.getValueAt(fila, 4);
            
            JTFvueloId.setText(vueloId);
            JTFAerolinea.setText(aerolinea);
            JTFLugarOrigen.setText(origen);
            JTFDestino.setText(destino);
            JTFSalida.setText(horaSalida);
            
            JTFvueloId.setEditable(false);
            JTFvueloId.setEnabled(false);
            
        }
    }//GEN-LAST:event_JTablaMouseClicked

    private void JBModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBModificarMouseClicked
        // TODO add your handling code here:
        modificar();
        tabla();
        nuevo();
    }//GEN-LAST:event_JBModificarMouseClicked

    private void JBEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBEliminarMouseClicked
        // TODO add your handling code here:
        eliminar();
        tabla();
        nuevo();
        
    }//GEN-LAST:event_JBEliminarMouseClicked

    private void JBNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBNuevoMouseClicked
        // TODO add your handling code here:
        nuevo();
    }//GEN-LAST:event_JBNuevoMouseClicked

    private void JBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRegresarActionPerformed
        // TODO add your handling code here:
        JFopciones op = new JFopciones();
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JBRegresarActionPerformed

    private void JTFSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFSalidaMouseClicked
        
        if(JTFSalida.getText().equals("Formato: 17h00")){
            JTFSalida.setText("");
            JTFSalida.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_JTFSalidaMouseClicked

    private void JTFSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFSalidaActionPerformed

    private void JTFvueloIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFvueloIdMouseClicked
      
        if(JTFvueloId.getText().equals("max 3 caracteres")){
            JTFvueloId.setText("");
            JTFvueloId.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_JTFvueloIdMouseClicked

    private void JTFLugarOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFLugarOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFLugarOrigenActionPerformed

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
            java.util.logging.Logger.getLogger(JFvuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFvuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFvuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFvuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFvuelo().setVisible(true);
            }
        });
    }
    
    void tabla(){
        String sql = "select  * from vuelos";
        try{
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[]vuelos = new Object[5];
            modelo = (DefaultTableModel)JTabla.getModel();
            while(rs.next()){
                vuelos[0] = rs.getString("VueloId");
                vuelos[1] = rs.getString("Aerolinea");
                vuelos[2] = rs.getString("Origen");
                vuelos[3] = rs.getString("Destino");
                vuelos[4] = rs.getString("HoraSalida");
                modelo.addRow(vuelos);
            }
            JTabla.setModel(modelo);
            
        }catch(Exception e){
            
        }
    }
    
    void limpiarTabla(){
         for(int i = 0; i < JTabla.getRowCount(); i++){
            modelo.removeRow(i);
            i -= 1;
        }
    }
    
    void nuevo(){
        JTFvueloId.setText("");
        JTFAerolinea.setText("");
        JTFLugarOrigen.setText("");
        JTFDestino.setText("");
        JTFSalida.setText("");
        
        JTFvueloId.setEditable(true);
        JTFvueloId.setEnabled(true);
    }
    
    void agregar(){
        String vueloId = JTFvueloId.getText();
        String aerolinea = JTFAerolinea.getText();
        String origen = JTFLugarOrigen.getText();
        String destino = JTFDestino.getText();
        String horaSalida = JTFSalida.getText();
        
        if(vueloId.isEmpty() || aerolinea.isEmpty() || origen.isEmpty() || destino.isEmpty() || horaSalida.isEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Los campos solicitados no pueden esta vacios!");
            limpiarTabla();
        }else{
            String sql = "insert into vuelos (VueloId,Aerolinea,Origen,Destino,HoraSalida) values ('"+vueloId+"','"+aerolinea+"','"+origen+"','"+destino+"','"+horaSalida+"')";
            try{
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                limpiarTabla();
                
            }catch(Exception e){
                
            }
        }
    }
    
    void modificar(){
        String vueloId = JTFvueloId.getText();
        String aerolinea = JTFAerolinea.getText();
        String origen = JTFLugarOrigen.getText();
        String destino = JTFDestino.getText();
        String horaSalida = JTFSalida.getText();
        
        if(vueloId.isEmpty() || aerolinea.isEmpty() || origen.isEmpty() || destino.isEmpty() || horaSalida.isEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Los campos solicitados no pueden esta vacios!");
            limpiarTabla();
        }else{
            String sql = "update vuelos set VueloId = '" + vueloId + "', Aerolinea = '" + aerolinea +"', Origen = '" + origen +"', Destino = '" + destino+"', HoraSalida = '" + horaSalida +"' where VueloId = '" + vueloId + "'";
            try{
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                limpiarTabla();
                
            }catch(Exception e){
                
            }
        }
    }
    
    void eliminar(){
        String vueloId = JTFvueloId.getText();
        int select = JTabla.getSelectedRow();
        
        if(select == -1){
            JOptionPane.showMessageDialog(null, "No esta seleccionada ninguna fila");
        }else{
            String sql = "delete from vuelos where VueloId = '" + vueloId + "'";
            
            try{
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                limpiarTabla(); 
            }catch(Exception e){
                
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JBAgregar;
    private javax.swing.JLabel JBEliminar;
    private javax.swing.JLabel JBModificar;
    private javax.swing.JLabel JBNuevo;
    private javax.swing.JButton JBRegresar;
    private javax.swing.JTextField JTFAerolinea;
    private javax.swing.JTextField JTFDestino;
    private javax.swing.JTextField JTFLugarOrigen;
    private javax.swing.JTextField JTFSalida;
    private javax.swing.JTextField JTFvueloId;
    private javax.swing.JTable JTabla;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
