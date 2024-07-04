import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class FormLoan extends javax.swing.JFrame {

    /**
     * Creates new form FormLoan
     */
    public FormLoan() {
        initComponents();
        getContentPane().setBackground(Color.gray);
    }

    public void setAccNo(String accNo) {
        flAn.setText(accNo);
    }

    public void setName(String name) {
        flName.setText(name);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        flAn = new javax.swing.JTextField();
        flName = new javax.swing.JTextField();
        flLoanamount = new javax.swing.JTextField();
        flPin = new javax.swing.JTextField();
        flDate = new com.toedter.calendar.JDateChooser();
        btBackfl = new javax.swing.JButton();
        btAcceptfl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("FORM LOAN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Account Number :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Date :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Loan Amount :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("PIN :");

        flAn.setEditable(false);
        flAn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        flName.setEditable(false);
        flName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        flName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flNameActionPerformed(evt);
            }
        });

        flLoanamount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        flLoanamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flLoanamountActionPerformed(evt);
            }
        });

        flPin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btBackfl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btBackfl.setText("Back");
        btBackfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackflActionPerformed(evt);
            }
        });

        btAcceptfl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAcceptfl.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\ok.gif")); // NOI18N
        btAcceptfl.setText("Accept");
        btAcceptfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcceptflActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(201, 201, 201))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(82, 82, 82)
                        .addComponent(flDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(flPin))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(flAn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(74, 74, 74)
                        .addComponent(flName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26)
                        .addComponent(flLoanamount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btBackfl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(btAcceptfl)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(flAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(flName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(flDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(flLoanamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(flPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBackfl)
                    .addComponent(btAcceptfl))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void flNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flNameActionPerformed

    private void btAcceptflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcceptflActionPerformed
        try {
        Connection con = db.conn();
        
        String pin = flPin.getText();
        int accNo = Integer.parseInt(flAn.getText());

        // Mendapatkan nilai dari flDate
        java.util.Date date = flDate.getDate();
        if (date == null) {
            JOptionPane.showMessageDialog(null, "Please fill the borrowing date", "Warning", JOptionPane.WARNING_MESSAGE);
            return; // Hentikan eksekusi
        }
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        // Mendapatkan nilai dari flLoanamount
        String loanAmountStr = flLoanamount.getText();
        if (loanAmountStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill the total loans you want to apply", "Warning", JOptionPane.WARNING_MESSAGE);
            return; // Hentikan eksekusi
        }
        double loanAmount = Double.parseDouble(loanAmountStr);

        // Mendapatkan nilai dari flPin
        String checkPinQuery = "SELECT * FROM customer WHERE acc_no = ? AND pin = ?";
        PreparedStatement checkPinStmt = con.prepareStatement(checkPinQuery);
        checkPinStmt.setInt(1, accNo);
        checkPinStmt.setString(2, pin);
        ResultSet pinRs = checkPinStmt.executeQuery();

        if (!pinRs.next()) {
            JOptionPane.showMessageDialog(null, "Wrong PIN.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Update loan_date, loan_amount, dan loan_status
        String updateLoanQuery = "UPDATE loan SET loan_date = ?, loan_amount = ?, loan_status = ? WHERE acc_no = ?";
        PreparedStatement updateLoanStmt = con.prepareStatement(updateLoanQuery);
        updateLoanStmt.setDate(1, sqlDate);
        updateLoanStmt.setDouble(2, loanAmount);
        updateLoanStmt.setString(3, "Can't apply loans");
        updateLoanStmt.setInt(4, accNo);
        updateLoanStmt.executeUpdate();

        JOptionPane.showMessageDialog(null, "Data Saved.");
        
        Mainmenu mm = Mainmenu.getMainmenu();      
        // Tampilkan kembali Mainmenu dan dispose WithdrawForm
        mm.setVisible(true);
        dispose();
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to save data.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btAcceptflActionPerformed

    private void flLoanamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flLoanamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flLoanamountActionPerformed

    private void btBackflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackflActionPerformed
        Mainmenu.getMainmenu().setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btBackflActionPerformed

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
            java.util.logging.Logger.getLogger(FormLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcceptfl;
    private javax.swing.JButton btBackfl;
    private javax.swing.JTextField flAn;
    private com.toedter.calendar.JDateChooser flDate;
    private javax.swing.JTextField flLoanamount;
    private javax.swing.JTextField flName;
    private javax.swing.JTextField flPin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
