
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
public class PaymentBillForm extends javax.swing.JFrame {

    /**
     * Creates new form PaymentBillForm
     */
    public PaymentBillForm() {
        initComponents();
        getContentPane().setBackground(Color.gray);
    }

    public void setNameText (String Name){
        pbName.setText(Name);
    }
    
    public void setAcnoText (String accNO){
        pbAn.setText(accNO);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pbEcom = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        pbAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pbPaycode = new javax.swing.JTextField();
        btBack = new javax.swing.JButton();
        btPay = new javax.swing.JButton();
        pbName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pbAn = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pbPin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PAYMENT BILL");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Bill Type :");

        pbEcom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pbEcom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Shopee", "Tokopedia", "Lazada" }));
        pbEcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbEcomActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Amount :");

        pbAmount.setEditable(false);
        pbAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pbAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbAmountActionPerformed(evt);
            }
        });
        pbAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pbAmountKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Payment Code :");

        pbPaycode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\backk1.png")); // NOI18N
        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
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

        pbName.setEditable(false);
        pbName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Name :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Account Number :");

        pbAn.setEditable(false);
        pbAn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\Eye-2-icon-1.png")); // NOI18N
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("PIN :");

        pbPin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btBack)
                        .addGap(161, 161, 161)
                        .addComponent(btPay)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pbPaycode, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pbEcom, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pbName, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pbAn, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pbAmount)
                                    .addComponent(pbPin, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSearch)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pbAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pbEcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pbPaycode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pbAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pbPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBack)
                    .addComponent(btPay))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pbEcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbEcomActionPerformed
        String selectedEcom = (String) pbEcom.getSelectedItem();
        String kode = "";
        switch (selectedEcom){
            case "Shopee":
                kode = "1234";
                break;
            case "Tokopedia":
                kode = "2345";
                break;
            case "Lazada":
                kode = "3456";
                break;
            default:
                break;
        }
        pbPaycode.setText(kode);
    }//GEN-LAST:event_pbEcomActionPerformed

    private void pbAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pbAmountActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        // TODO add your handling code here:
        Mainmenu.getMainmenu().setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btBackActionPerformed

    private void pbAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pbAmountKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_pbAmountKeyTyped

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        String kode = pbPaycode.getText();
        try {
            Connection con = db.conn();
            String query = "SELECT amount FROM payment_bill WHERE kode = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, kode);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                int amount = rs.getInt("amount");
                pbAmount.setText(Integer.toString(amount));
            }else {
                JOptionPane.showMessageDialog(null, "Payment code cannot found!");
                pbAmount.setText("");
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error retrieving payment amount: " + ex.getMessage());
        }
    }//GEN-LAST:event_btSearchActionPerformed

    private void btPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPayActionPerformed
    try {
        Connection con = db.conn();
        int amount = Integer.parseInt(pbAmount.getText()); // Ambil amount dari textfield
        int accountNumber = Integer.parseInt(pbAn.getText()); // Ambil account number dari textfield
        String query = "SELECT pin, current_balance FROM customer WHERE acc_no = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, accountNumber);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int correctPin = rs.getInt("pin");
            int currentBalanceFromDB = rs.getInt("current_balance");
            if (!pbPin.getText().isEmpty()) {
                int pin = Integer.parseInt(pbPin.getText()); // Ambil pin dari textfield
                if (pin == correctPin) {
                    // Kurangi current balance sesuai dengan amount
                    int newBalance = currentBalanceFromDB - amount;
                    if (newBalance >= 0) {
                        // Update current balance di database
                        String updateQuery = "UPDATE customer SET current_balance = ? WHERE acc_no = ?";
                        PreparedStatement updatePs = con.prepareStatement(updateQuery);
                        updatePs.setInt(1, newBalance);
                        updatePs.setInt(2, accountNumber);
                        updatePs.executeUpdate();
                        // Tampilkan current balance yang baru di textfield
                        Mainmenu mm = Mainmenu.getMainmenu();
                        mm.updateBalance(String.valueOf(newBalance));

                        String updatePaymentQuery = "UPDATE payment_bill SET amount = 0 WHERE acc_no = ?";
                        PreparedStatement updatePaymentPs = con.prepareStatement(updatePaymentQuery);
                        updatePaymentPs.setInt(1, accountNumber);
                        updatePaymentPs.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Payment Successful.");

                        mm.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong PIN.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "PIN must be filled in.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Account cannot found.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }

    }//GEN-LAST:event_btPayActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentBillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentBillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentBillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentBillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentBillForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btPay;
    private javax.swing.JButton btSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField pbAmount;
    private javax.swing.JTextField pbAn;
    private javax.swing.JComboBox<String> pbEcom;
    private javax.swing.JTextField pbName;
    private javax.swing.JTextField pbPaycode;
    private javax.swing.JPasswordField pbPin;
    // End of variables declaration//GEN-END:variables
}
