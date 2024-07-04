
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.awt.Color;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author julio
 */
public class Authe extends javax.swing.JFrame {
    
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public Authe() {
        initComponents();
        con = db.conn();
        getContentPane().setBackground(Color.gray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Accnum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        NewAcc = new javax.swing.JButton();
        jPin = new javax.swing.JPasswordField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\pig1.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 204));
        jLabel3.setText("OINK");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel4.setText("BANK");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Account Number :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("PIN :");

        Accnum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Accnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccnumActionPerformed(evt);
            }
        });
        Accnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AccnumKeyTyped(evt);
            }
        });

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        NewAcc.setText("NEW ACC");
        NewAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAccActionPerformed(evt);
            }
        });

        jPin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPinKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButton1)
                        .addGap(37, 37, 37)
                        .addComponent(NewAcc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addComponent(Accnum)
                            .addComponent(jPin))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel4)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Accnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(NewAcc))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccnumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String an = Accnum.getText();
        String pin = jPin.getText();
        
        try{
            String sql = " SELECT * FROM customer WHERE acc_no=? AND pin=? ";
            pst = con.prepareCall(sql);
            
            pst.setString(1, an);
            pst.setString(2, pin);
            
            rs = pst.executeQuery();
            
            if (rs.next()){
                JOptionPane.showMessageDialog(rootPane, "Login Successfully ...");
                Mainmenu mm = new Mainmenu();
                
                String name = rs.getString("user_name");
                String dob = rs.getString("birthday");
                String gender = rs.getString("gender");
                String addrs = rs.getString("address");
                int accnum = rs.getInt("acc_no");
                String acc_num = String.valueOf(accnum);
                String mnumber = rs.getString("mobile_number");
                int cb = rs.getInt("current_balance");
                String cbln = String.valueOf(cb);
                
                mm.setNameText(name);
                mm.setDOB(dob);
                mm.setAddress(addrs);
                mm.setGender(gender);
                mm.setAccnum(acc_num);
                mm.setMobNum(mnumber);
                mm.setCurBalance(cbln);
                mm.setUsName(name);
                
                mm.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Login Failed!");
            }
        }catch(Exception e) {
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NewAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAccActionPerformed
        // TODO add your handling code here:
        ACC account = new ACC();
        account.show();
        
        dispose();
    }//GEN-LAST:event_NewAccActionPerformed

    private void AccnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AccnumKeyTyped
        // TODO add your handling code here:
        
        if (!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_AccnumKeyTyped

    private void jPinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPinKeyTyped
        // TODO add your handling code here:
        
        if (!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jPinKeyTyped

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
            java.util.logging.Logger.getLogger(Authe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Accnum;
    private javax.swing.JButton NewAcc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPin;
    // End of variables declaration//GEN-END:variables
}
