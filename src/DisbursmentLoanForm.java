
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author julio
 */
public class DisbursmentLoanForm extends javax.swing.JFrame {

    /**
     * Creates new form DisbursmentLoanForm
     */
    public DisbursmentLoanForm() {
        initComponents();
        getContentPane().setBackground(Color.gray);
    }

    public void setTextname (String name){
        dlName.setText(name);
    }
    
    public void setTextaccno (String accNo){
        dlAn.setText(accNo);
    }
    
    public void setTextamount (String amount){
        dlAmount.setText(amount);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dlAn = new javax.swing.JTextField();
        dlName = new javax.swing.JTextField();
        dlAmount = new javax.swing.JTextField();
        btBackdl = new javax.swing.JButton();
        btPay = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dlDate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        dlPin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DISBURSMENT LOAN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Account Number :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Amount");

        dlAn.setEditable(false);
        dlAn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dlAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlAnActionPerformed(evt);
            }
        });

        dlName.setEditable(false);
        dlName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dlName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlNameActionPerformed(evt);
            }
        });

        dlAmount.setEditable(false);
        dlAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dlAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlAmountActionPerformed(evt);
            }
        });

        btBackdl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btBackdl.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\backk1.png")); // NOI18N
        btBackdl.setText("Back");
        btBackdl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackdlActionPerformed(evt);
            }
        });

        btPay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btPay.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\ok.gif")); // NOI18N
        btPay.setText("Pay");
        btPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPayActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Pin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(153, 153, 153))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btBackdl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btPay))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dlAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dlName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dlDate, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dlPin, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dlAn, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dlAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dlName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dlAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dlDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBackdl)
                    .addComponent(btPay))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dlNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dlNameActionPerformed

    private void btPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPayActionPerformed
        try {
        Connection con = db.conn();

        int accNo = Integer.parseInt(dlAn.getText());
        String pin = dlPin.getText();
        Date payDate = dlDate.getDate();

        // Validasi PIN harus sesuai dengan data customer
        String checkPinQuery = "SELECT * FROM customer WHERE acc_no = ? AND pin = ?";
        PreparedStatement checkPinStmt = con.prepareStatement(checkPinQuery);
        checkPinStmt.setInt(1, accNo);
        checkPinStmt.setString(2, pin);
        ResultSet pinRs = checkPinStmt.executeQuery();

        if (!pinRs.next()) {
            JOptionPane.showMessageDialog(null, "Wrong PIN.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Update loan_amount menjadi 0 dan set pay_date
        String updateQuery = "UPDATE loan SET loan_amount = 0, loan_status = 'Can apply loans', pay_date = ? WHERE acc_no = ?";
        PreparedStatement updateStmt = con.prepareStatement(updateQuery);
        updateStmt.setDate(1, new java.sql.Date(payDate.getTime()));
        updateStmt.setInt(2, accNo);
        updateStmt.executeUpdate();

        JOptionPane.showMessageDialog(null, "Payment Successful. You can apply loans", "Information", JOptionPane.INFORMATION_MESSAGE);
        
        Mainmenu mm = Mainmenu.getMainmenu();      
        // Tampilkan kembali Mainmenu dan dispose WithdrawForm
        mm.setVisible(true);
        dispose();
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Payment failed!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btPayActionPerformed

    private void btBackdlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackdlActionPerformed
        // TODO add your handling code here:
        Mainmenu.getMainmenu().setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btBackdlActionPerformed

    private void dlAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlAnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dlAnActionPerformed

    private void dlAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dlAmountActionPerformed

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
            java.util.logging.Logger.getLogger(DisbursmentLoanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisbursmentLoanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisbursmentLoanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisbursmentLoanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisbursmentLoanForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBackdl;
    private javax.swing.JButton btPay;
    private javax.swing.JTextField dlAmount;
    private javax.swing.JTextField dlAn;
    private com.toedter.calendar.JDateChooser dlDate;
    private javax.swing.JTextField dlName;
    private javax.swing.JPasswordField dlPin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
