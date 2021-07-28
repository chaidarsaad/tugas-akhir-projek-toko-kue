package TokoKue;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import koneksi.Konfig;

public class login_multiuser extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public login_multiuser() {
        initComponents();
        
        // tidak bisa di resize
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        
        //tampil di tengah
        setLocationRelativeTo(null);
        
        //validasi exit
        validateExit();
    }
    
    private void validateExit(){
        login_multiuser.this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                if (JOptionPane.showConfirmDialog(login_multiuser.this,
                        "Apakah anda yakin ingin keluar dari aplikasi?", "PERINGATAN",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        imagePanel = new javax.swing.JPanel();
        logoToko = new javax.swing.JLabel();
        namaToko = new javax.swing.JLabel();
        versiAplikasi = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        lbluser = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        btnLogin = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        cbuser = new javax.swing.JComboBox<>();
        lblstatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Aplikasi Toko Kue");

        bodyPanel.setBackground(new java.awt.Color(87, 95, 207));

        imagePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207), new java.awt.Color(87, 95, 207)));

        logoToko.setIcon(new javax.swing.ImageIcon("E:\\D\\projek toko kue\\logo fix.png")); // NOI18N

        namaToko.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        namaToko.setText("Arie Cake & Tart Decoration");

        versiAplikasi.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        versiAplikasi.setForeground(new java.awt.Color(87, 95, 207));
        versiAplikasi.setText("beta v0.1");

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanelLayout.createSequentialGroup()
                .addGroup(imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagePanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(logoToko))
                    .addGroup(imagePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(versiAplikasi))
                    .addGroup(imagePanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(namaToko)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanelLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(logoToko)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaToko)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(versiAplikasi)
                .addContainerGap())
        );

        loginPanel.setBackground(new java.awt.Color(87, 95, 207));

        txtuser.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtuser.setForeground(new java.awt.Color(87, 95, 207));

        txtpass.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtpass.setForeground(new java.awt.Color(87, 95, 207));

        lbluser.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbluser.setForeground(new java.awt.Color(255, 255, 255));
        lbluser.setText("Username :");

        lblpass.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblpass.setForeground(new java.awt.Color(255, 255, 255));
        lblpass.setText("Password :");

        btnLogin.setBackground(new java.awt.Color(87, 95, 207));
        btnLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLoginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLoginMouseReleased(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("LOGIN");

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLoginLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblLogin)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLoginLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblLogin)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        cbuser.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cbuser.setForeground(new java.awt.Color(87, 95, 207));
        cbuser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Level", "Admin", "Karyawan" }));

        lblstatus.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblstatus.setForeground(new java.awt.Color(255, 255, 255));
        lblstatus.setText("Level :");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblstatus)
                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblpass)
                        .addComponent(lbluser)
                        .addComponent(txtuser)
                        .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                        .addComponent(cbuser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lbluser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblpass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblstatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setBackground(new Color(230,230,230));
        lblLogin.setForeground(new Color(87,95,207));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setBackground(new Color(87,95,207));
        lblLogin.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMousePressed
        btnLogin.setBackground(new Color(255,255,255));
        lblLogin.setForeground(new Color(62,70,182));
    }//GEN-LAST:event_btnLoginMousePressed

    private void btnLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseReleased
        btnLogin.setBackground(new Color(62,70,182));
        lblLogin.setForeground(new Color(255,255,255));
        
        try{
            String query = "SELECT * FROM `login_multiuser` WHERE username=? and password =? and level=?";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            pst = conn.prepareStatement(query);
            pst.setString(1, txtuser.getText());
            pst.setString(2, txtpass.getText());
            pst.setString(3, String.valueOf(cbuser.getSelectedItem()));
            rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "username dan password benar dan anda login sebagai " + rs.getString("level"));
                if(cbuser.getSelectedIndex()==1){
                    new admin().setVisible(true);
                    this.dispose();
                }else if(cbuser.getSelectedIndex()==2){
                    user u = new user();
                    u.setVisible(true);
                    this.setVisible(false);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "username dan passowrd salah");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnLoginMouseReleased

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
            java.util.logging.Logger.getLogger(login_multiuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_multiuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_multiuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_multiuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_multiuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JComboBox<String> cbuser;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JLabel lbluser;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logoToko;
    private javax.swing.JLabel namaToko;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtuser;
    private javax.swing.JLabel versiAplikasi;
    // End of variables declaration//GEN-END:variables
}
