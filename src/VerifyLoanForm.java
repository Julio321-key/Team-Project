
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author julio
 */
public class VerifyLoanForm extends javax.swing.JFrame {

    /**
     * Creates new form VerifyLoanForm
     */
    public VerifyLoanForm() {
        initComponents();
        getContentPane().setBackground(Color.gray);
    }

    public void setNameText (String Name){
        vlName.setText(Name);
    }
    
    public void setAcnoText (String accNO){
        vlAn.setText(accNO);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vlName = new javax.swing.JTextField();
        vlAn = new javax.swing.JTextField();
        vlPin = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        btVerify = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("VERIFY LOAN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Account Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("PIN");

        vlName.setEditable(false);
        vlName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        vlAn.setEditable(false);
        vlAn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        vlPin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vlPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vlPinActionPerformed(evt);
            }
        });
        vlPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vlPinKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\backk1.png")); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btVerify.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btVerify.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\ok.gif")); // NOI18N
        btVerify.setText("Verify");
        btVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btVerify)
                .addGap(170, 170, 170))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vlAn, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(vlPin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(vlName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(321, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(vlName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vlAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(vlPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btVerify))
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(jLabel3)
                    .addContainerGap(287, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vlPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vlPinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vlPinActionPerformed

    private void btVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerifyActionPerformed
    try {
        Connection con = db.conn();

        int accNo = Integer.parseInt(vlAn.getText());
        String name = vlName.getText();
        String pin = vlPin.getText();

        // Cek PIN
        String checkPinQuery = "SELECT * FROM customer WHERE acc_no = ? AND pin = ?";
        PreparedStatement checkPinStmt = con.prepareStatement(checkPinQuery);
        checkPinStmt.setInt(1, accNo);
        checkPinStmt.setString(2, pin);
        ResultSet pinRs = checkPinStmt.executeQuery();

        if (!pinRs.next()) {
            JOptionPane.showMessageDialog(null, "Wrong PIN", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Cek status peminjaman
        String loanStatus;
        double loanAmount;
        String checkLoanQuery = "SELECT loan_amount FROM loan WHERE acc_no = ?";
        PreparedStatement checkLoanStmt = con.prepareStatement(checkLoanQuery);
        checkLoanStmt.setInt(1, accNo);
        ResultSet loanRs = checkLoanStmt.executeQuery();

        if (loanRs.next()) {
            loanAmount = loanRs.getDouble("loan_amount");
            if (loanAmount != 0.0) {
                loanStatus = "Sorry, you can't apply loans!";
            } else {
                loanStatus = "You can apply loans";
            }
        } else {
            loanStatus = "You can apply loans";
            // Insert data ke tabel loan
            String insertLoanQuery = "INSERT INTO loan (acc_no, loan_amount, loan_status, loan_date, pay_date) VALUES (?, 0, ?, NULL, NULL)";
            PreparedStatement insertLoanStmt = con.prepareStatement(insertLoanQuery);
            insertLoanStmt.setInt(1, accNo);
            insertLoanStmt.setString(2, loanStatus);
            insertLoanStmt.executeUpdate();
        }

        JOptionPane.showMessageDialog(null, loanStatus, "Loan Status", JOptionPane.INFORMATION_MESSAGE);

        if (loanStatus.equals("You can apply loans")) {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Want to continue apply?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                // Reset loan_date dan pay_date menjadi NULL
                String updateQuery = "UPDATE loan SET loan_date = NULL, pay_date = NULL WHERE acc_no = ?";
                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                updateStmt.setInt(1, accNo);
                updateStmt.executeUpdate();
                
                // Redirect ke form peminjaman
                FormLoan fl = new FormLoan();
                fl.setAccNo(vlAn.getText());
                fl.setName(vlName.getText());
                fl.setVisible(true);
                dispose();
            }
        }

        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to verify.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btVerifyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Mainmenu.getMainmenu().setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void vlPinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vlPinKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_vlPinKeyTyped

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
            java.util.logging.Logger.getLogger(VerifyLoanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerifyLoanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerifyLoanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerifyLoanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerifyLoanForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVerify;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField vlAn;
    private javax.swing.JTextField vlName;
    private javax.swing.JPasswordField vlPin;
    // End of variables declaration//GEN-END:variables
}
