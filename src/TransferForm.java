
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TransferForm extends javax.swing.JFrame {

    /**
     * Creates new form TransferForm
     */
    public TransferForm() {
        initComponents();
        getContentPane().setBackground(Color.gray);
        tfName.setBackground(Color.gray);
        tfAn.setBackground(Color.gray);
        tfCurbal.setBackground(Color.gray);
        tfDesname.setBackground(Color.gray);
        btTf.setEnabled(false);
        
    }

    public void setNameText (String Name){
        tfName.setText(Name);
    }
    
    public void setAcnoText (String accNO){
        tfAn.setText(accNO);
    }
    
    public void setCurrentBalanceText (String cBln){
        tfCurbal.setText(cBln);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfDesaccnum = new javax.swing.JTextField();
        tfCurbal = new javax.swing.JTextField();
        tfAn = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfDesname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfAmount = new javax.swing.JTextField();
        btTf = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("TRANSFER");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Account Number :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Current Balance :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Destination Account No :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Account Name :");

        tfDesaccnum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfDesaccnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDesaccnumActionPerformed(evt);
            }
        });
        tfDesaccnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDesaccnumKeyTyped(evt);
            }
        });

        tfCurbal.setEditable(false);
        tfCurbal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfAn.setEditable(false);
        tfAn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfName.setEditable(false);
        tfName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfDesname.setEditable(false);
        tfDesname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\search.gif")); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Transfer Amount :");

        tfAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfAmountKeyTyped(evt);
            }
        });

        btTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btTf.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\ok.gif")); // NOI18N
        btTf.setText("Transfer");
        btTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTfActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\backk1.png")); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfName)
                            .addComponent(tfAn)
                            .addComponent(tfCurbal)
                            .addComponent(tfDesaccnum)
                            .addComponent(tfDesname)
                            .addComponent(tfAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(btTf)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addComponent(tfAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(tfCurbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDesaccnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDesname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(53, 82, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btTf)
                            .addComponent(jButton4))
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Mainmenu.getMainmenu().setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
        Connection con = db.conn();
        String receiverNum = tfDesaccnum.getText(); // Ambil nomor akun dari teksfield
        String SenderNum = tfAn.getText();
        
        if (receiverNum.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please enter receiver's account number.");
            return;
        }
        
        PreparedStatement stmt = con.prepareStatement("SELECT user_name FROM customer WHERE acc_no = ?");
        stmt.setInt(1, Integer.parseInt(receiverNum));
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            String accName = rs.getString("user_name");
            tfDesname.setText(accName);
            
            if (receiverNum.equals(SenderNum)){
                JOptionPane.showMessageDialog(rootPane, "Sender and receiver account cannot be the same.");
                tfDesname.setText("");
                btTf.setEnabled(false);
                return;
            }
            // Aktifkan button transfer setelah nama pengguna ditemukan
            btTf.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Receiver account not found");
            tfDesname.setText("");
            //Nonaktifkan button transfer jika nama pengguna tidak ditemukan
            btTf.setEnabled(false);
            
        }
        con.close();
    } catch (SQLException e) {
        System.out.println("Failed to connect to database.");
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void btTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTfActionPerformed
    try {    
        Connection con = db.conn();
        String senderAccNum = tfAn.getText();
        String receiverAccNum = tfDesaccnum.getText();
        String amountText = tfAmount.getText();
        
        if(amountText.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Please enter the amount.");
            return;
        }
        
        int transferAmount = Integer.parseInt(amountText);
        // Validasi saldo pengirim
        PreparedStatement validateSenderStmt = con.prepareStatement("SELECT current_balance FROM customer WHERE acc_no = ?");
        validateSenderStmt.setString(1, senderAccNum);
        ResultSet senderRs = validateSenderStmt.executeQuery();
        if (senderRs.next()) {
            int senderBalance = senderRs.getInt("current_balance");
            if (transferAmount > senderBalance) {
                JOptionPane.showMessageDialog(rootPane, "Insufficient balance for transfer.");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Sender account not found.");
            return;
        }

        // Validasi penerima
        PreparedStatement validateReceiverStmt = con.prepareStatement("SELECT user_name FROM customer WHERE acc_no = ?");
        validateReceiverStmt.setString(1, receiverAccNum);
        ResultSet receiverRs = validateReceiverStmt.executeQuery();
        if (!receiverRs.next()) {
            JOptionPane.showMessageDialog(rootPane, "Receiver account not found.");
            return;
        }

        // Kurangkan saldo pengirim
        PreparedStatement updateSenderStmt = con.prepareStatement("UPDATE customer SET current_balance = current_balance - ? WHERE acc_no = ?");
        updateSenderStmt.setInt(1, transferAmount);
        updateSenderStmt.setString(2, senderAccNum);
        updateSenderStmt.executeUpdate();

        // Tambahkan saldo penerima
        PreparedStatement updateReceiverStmt = con.prepareStatement("UPDATE customer SET current_balance = current_balance + ? WHERE acc_no = ?");
        updateReceiverStmt.setInt(1, transferAmount);
        updateReceiverStmt.setString(2, receiverAccNum);
        updateReceiverStmt.executeUpdate();
        
        // Ambil saldo terbaru pengirim
        PreparedStatement getSenderBalanceStmt = con.prepareStatement("SELECT current_balance FROM customer WHERE acc_no = ?");
        getSenderBalanceStmt.setString(1, senderAccNum);
        ResultSet senderBalanceRs = getSenderBalanceStmt.executeQuery();
        int newSenderBalance = 0;
        if (senderBalanceRs.next()) {
        newSenderBalance = senderBalanceRs.getInt("current_balance");
        }

        JOptionPane.showMessageDialog(rootPane, "Transfer successful!");
        
        Mainmenu mm = Mainmenu.getMainmenu();
        mm.updateBalance(String.valueOf(newSenderBalance));
            
        mm.setVisible(true);
        dispose();

        con.close();
    } catch (SQLException e) {
        System.out.println("Failed to connect to database.");
        e.printStackTrace();
    }
    }//GEN-LAST:event_btTfActionPerformed

    private void tfDesaccnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDesaccnumActionPerformed
        
    }//GEN-LAST:event_tfDesaccnumActionPerformed

    private void tfDesaccnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDesaccnumKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfDesaccnumKeyTyped

    private void tfAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAmountKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfAmountKeyTyped

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
            java.util.logging.Logger.getLogger(TransferForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btTf;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tfAmount;
    private javax.swing.JTextField tfAn;
    private javax.swing.JTextField tfCurbal;
    private javax.swing.JTextField tfDesaccnum;
    private javax.swing.JTextField tfDesname;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
