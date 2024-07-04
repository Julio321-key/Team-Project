import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;


public class DepositForm extends javax.swing.JFrame {

    /**
     * Creates new form DepositForm
     */
    public DepositForm() {
        initComponents();
        getContentPane().setBackground(Color.gray);
    }

    public void setNameText (String Name){
        depoName.setText(Name);
    }
    
    public void setAcnoText (String accNO){
        depoAn.setText(accNO);
    }
    
    public void setCurrentBalanceText (String cBln){
        depoCurbal.setText(cBln);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        depoAn = new javax.swing.JTextField();
        depoCurbal = new javax.swing.JTextField();
        depoName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btdepoBack = new javax.swing.JButton();
        btDepo = new javax.swing.JButton();
        depoCombobox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Account Number :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Current Balance :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Deposit Amount :");

        depoAn.setEditable(false);
        depoAn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        depoCurbal.setEditable(false);
        depoCurbal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        depoCurbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depoCurbalActionPerformed(evt);
            }
        });

        depoName.setEditable(false);
        depoName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("DEPOSIT");

        btdepoBack.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btdepoBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\backk1.png")); // NOI18N
        btdepoBack.setText("Back");
        btdepoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdepoBackActionPerformed(evt);
            }
        });

        btDepo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btDepo.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\ok.gif")); // NOI18N
        btDepo.setText("Deposit");
        btDepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepoActionPerformed(evt);
            }
        });

        depoCombobox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        depoCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "200", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btdepoBack)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(depoCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btDepo)
                                .addGap(128, 128, 128))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depoCurbal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(depoName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(depoAn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(174, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depoAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depoCurbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(depoCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDepo)
                    .addComponent(btdepoBack))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depoCurbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depoCurbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depoCurbalActionPerformed

    private void btdepoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdepoBackActionPerformed
        // TODO add your handling code here:
        Mainmenu.getMainmenu().setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btdepoBackActionPerformed

    private void btDepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepoActionPerformed
        try {
        Connection conec = db.conn();
        int depositAmount = Integer.parseInt((String) depoCombobox.getSelectedItem()); // Ambil jumlah penarikan dari combobox
        String accNum = depoAn.getText(); // Ambil nomor akun dari teksfield
        // Validasi bahwa saldo mencukupi untuk penarikan
        PreparedStatement validateStmt = conec.prepareStatement("SELECT current_balance FROM customer WHERE acc_no = ?");
        validateStmt.setString(1, accNum);
        ResultSet rs = validateStmt.executeQuery();
        if (rs.next()) {
            int currentBalance = rs.getInt("current_balance");   
            int newBalance = currentBalance + depositAmount;
            
            
            PreparedStatement stmt = conec.prepareStatement("UPDATE customer SET current_balance = ? WHERE acc_no = ?");
            stmt.setInt(1, newBalance);
            stmt.setString(2, accNum);
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(rootPane, "Depo successful!");
                
            Mainmenu mm = Mainmenu.getMainmenu();
            mm.updateB(String.valueOf(newBalance));
                
            // Tampilkan kembali Mainmenu dan dispose WithdrawForm
            mm.setVisible(true);
            dispose();
        }
        conec.close();
    } catch (SQLException | NumberFormatException e) {
        // Handle eksepsi
         e.printStackTrace();
        JOptionPane.showMessageDialog(rootPane, "Failed to connect to database.");
    }
    }//GEN-LAST:event_btDepoActionPerformed

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
            java.util.logging.Logger.getLogger(DepositForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDepo;
    private javax.swing.JButton btdepoBack;
    private javax.swing.JTextField depoAn;
    private javax.swing.JComboBox<String> depoCombobox;
    private javax.swing.JTextField depoCurbal;
    private javax.swing.JTextField depoName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
