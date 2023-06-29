package Vista;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

public class JFlogin extends javax.swing.JFrame {
   
    JFopciones opciones = new JFopciones();
    
    
   
 
    public JFlogin() {
        initComponents();
        this.setLocationRelativeTo(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroud = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        JBSalir = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        ciudad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTusuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPcontraseña = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        JBaceptar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        backgroud.setBackground(new java.awt.Color(255, 255, 255));
        backgroud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 134, 190));

        JBSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBSalir.setForeground(new java.awt.Color(255, 255, 255));
        JBSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JBSalir.setText("SALIR");
        JBSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        backgroud.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 160, 40));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        backgroud.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 290, 140));

        ciudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/city.png"))); // NOI18N
        backgroud.add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 290, 500));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        jLabel2.setText("EMPRESA DE VUELOS NACIONAL");
        backgroud.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("INICIAR SESIÓN");
        backgroud.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("USUARIO");
        backgroud.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jTusuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTusuario.setForeground(new java.awt.Color(204, 204, 204));
        jTusuario.setText("Ingrese su nombre de usuario");
        jTusuario.setBorder(null);
        jTusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTusuarioMousePressed(evt);
            }
        });
        backgroud.add(jTusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 400, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        backgroud.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 400, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("CONTRASEÑA");
        backgroud.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        backgroud.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 400, -1));

        jPcontraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPcontraseña.setForeground(new java.awt.Color(204, 204, 204));
        jPcontraseña.setText("********");
        jPcontraseña.setBorder(null);
        jPcontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPcontraseñaMousePressed(evt);
            }
        });
        jPcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPcontraseñaActionPerformed(evt);
            }
        });
        backgroud.add(jPcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 400, 40));

        jPanel1.setBackground(new java.awt.Color(0, 134, 190));
        jPanel1.setForeground(new java.awt.Color(0, 134, 190));

        JBaceptar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBaceptar.setForeground(new java.awt.Color(255, 255, 255));
        JBaceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JBaceptar.setText("ACEPTAR");
        JBaceptar.setToolTipText("");
        JBaceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBaceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBaceptarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JBaceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JBaceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        backgroud.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBSalirMouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_JBSalirMouseClicked

    private void jTusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTusuarioMousePressed
       
        if(jTusuario.getText().equals("Ingrese su nombre de usuario")){
            jTusuario.setText("");
            jTusuario.setForeground(Color.black);
        }
            
        if(String.valueOf(jPcontraseña.getPassword()).isEmpty()){
            jPcontraseña.setText("********");
            jPcontraseña.setForeground(Color.gray);
        }
        
        
    }//GEN-LAST:event_jTusuarioMousePressed

    private void jPcontraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPcontraseñaMousePressed
        
        if(String.valueOf(jPcontraseña.getPassword()).equals("********")){
            jPcontraseña.setText("");
            jPcontraseña.setForeground(Color.black);
        }
        
        if(jTusuario.getText().isEmpty()){
            jTusuario.setText("Ingrese su nombre de usuario");
            jTusuario.setForeground(Color.gray);
        }
         
    }//GEN-LAST:event_jPcontraseñaMousePressed

    private void JBaceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBaceptarMouseClicked
        String usuario = jTusuario.getText();
        String password = new String(jPcontraseña.getPassword());
        
        if(!usuario.equalsIgnoreCase("root") || !password.equals("jeremias9")){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Credenciales incorrectas", "ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            String user = usuario;
            String pass = password;
            String url ="jdbc:mysql://localhost:3306/proyecto";
            
            try(Connection connection = DriverManager.getConnection(url,user,pass)){
                JOptionPane.showMessageDialog(null, "Conectado a la base de datos", "", JOptionPane.INFORMATION_MESSAGE);
                opciones.setVisible(true);
                this.setVisible(false);
                

            }
            catch(SQLException e){
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Error" + e);
                
            }
        } 
      
        

    }//GEN-LAST:event_JBaceptarMouseClicked

    private void jPcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPcontraseñaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JBSalir;
    private javax.swing.JLabel JBaceptar;
    private javax.swing.JPanel backgroud;
    private javax.swing.JLabel ciudad;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPcontraseña;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTusuario;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
