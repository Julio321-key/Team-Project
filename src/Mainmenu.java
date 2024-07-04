import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Mainmenu extends javax.swing.JFrame {

    public Mainmenu() {
        initComponents();
        getContentPane().setBackground(Color.gray);
    }
    
    private static Mainmenu mainme;
    
    public static Mainmenu getMainmenu(){
        return mainme;
    }
    
    public static void setMainmenu(Mainmenu menu){
        mainme = menu;
    }
    
    public void setNameText(String name){
        un.setText(name);
    }
    
    public void setDOB(String dob){
        dofb.setText(dob);
    }
    
    public void updateBalance(String newBalance) {
        cBalance.setText(newBalance);
    }
    
    public void updateB (String newBalance){
        cBalance.setText(newBalance);
    }
    
    public void setAddress(String addrs){
        address.setText(addrs);
    }
    
    public void setGender(String gender){
        gd.setText(gender);
    }
    
    public void setAccnum(String acc_num){
        an.setText(acc_num);
    }
    
    public void setMobNum(String mnumber){
        mPhone.setText(mnumber);
    }
    
    public void setCurBalance(String cbln){
        cBalance.setText(cbln);
    }
    
    public void setUsName(String name){
        usrn.setText(name);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usrn = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dofb = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        gd = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        an = new javax.swing.JTextField();
        mPhone = new javax.swing.JTextField();
        btCloseacc = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        cBalance = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btWithdraw = new javax.swing.JButton();
        btDeposit = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btTransfer = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btVerifyLoan = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(811, 401));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\pig1.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 204));
        jLabel2.setText("OINK");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel3.setText("BANK");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("USER :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("DATE :");

        usrn.setEditable(false);
        usrn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrnActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Name :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Date of birth :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Gender :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Address :");

        dofb.setEditable(false);
        dofb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dofb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dofbActionPerformed(evt);
            }
        });

        un.setEditable(false);
        un.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });

        gd.setEditable(false);
        gd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gdActionPerformed(evt);
            }
        });

        address.setEditable(false);
        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Account Number :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Mobile Phone :");

        an.setEditable(false);
        an.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        an.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anActionPerformed(evt);
            }
        });

        mPhone.setEditable(false);
        mPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPhoneActionPerformed(evt);
            }
        });

        btCloseacc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCloseacc.setText("Close Account");
        btCloseacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseaccActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Current Balance :");

        cBalance.setEditable(false);
        cBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dofb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(an, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(btCloseacc)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(an, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dofb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(mPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(40, 40, 40)
                .addComponent(btCloseacc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Information Account", jPanel1);

        btWithdraw.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\cash-withdrawal1.png")); // NOI18N
        btWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btWithdrawActionPerformed(evt);
            }
        });

        btDeposit.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\deposit1.png")); // NOI18N
        btDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\paymentbill1.png")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btTransfer.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\transfer1.png")); // NOI18N
        btTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTransferActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Withdraw");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Payment Bill");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Deposit");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Transfer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btWithdraw)
                            .addComponent(jButton7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel14)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btTransfer)
                            .addComponent(btDeposit)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel16)))
                .addGap(194, 211, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btWithdraw)
                    .addComponent(btDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transaction", jPanel2);

        btVerifyLoan.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\verifyLoan1.png")); // NOI18N
        btVerifyLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerifyLoanActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\DisbursmentLoan1.png")); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Verify Loan");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Disbursment Loan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVerifyLoan)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(20, 20, 20)))
                .addGap(78, 78, 78)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10)
                    .addComponent(jLabel18))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btVerifyLoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Loan", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usrn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(usrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrnActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void dofbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dofbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dofbActionPerformed

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unActionPerformed

    private void gdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gdActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void anActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anActionPerformed

    private void mPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mPhoneActionPerformed

    private void btWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btWithdrawActionPerformed
        try {
        Connection con = db.conn();
        String accNum = an.getText(); // Ambil nomor akun dari teksfield
        PreparedStatement stmt = con.prepareStatement("SELECT user_name, acc_no, current_balance FROM customer WHERE acc_no = ?");
        stmt.setString(1, accNum);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            WithdrawForm wd = new WithdrawForm();
            
            String Name = rs.getString("user_name");
            int accnum = rs.getInt("acc_no");
            String accNO = String.valueOf(accnum);
            int cB = rs.getInt("current_balance");
            String cBln = String.valueOf(cB);
            // Set nilai dari database ke teksfield pada form withdraw
            wd.setNameText(Name);
            wd.setAcnoText(accNO);
            wd.setCurrentBalanceText(cBln);
            
            Mainmenu.setMainmenu(this);
            
            wd.setVisible(true);
            dispose();
            con.close();
        } else {
            // Handle jika tidak ada data yang ditemukan
        }
    } catch (Exception e) {
        // Handle eksepsi
        e.printStackTrace();
    }
    }//GEN-LAST:event_btWithdrawActionPerformed

    private void btCloseaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseaccActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to close your account?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
        try {
            // Mendapatkan koneksi ke database
            Connection conn = db.conn();

            // Menghapus data dari database
            String sql = "DELETE FROM customer WHERE acc_no = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(an.getText()));
            pstmt.executeUpdate();

            // Menampilkan pesan sukses
            JOptionPane.showMessageDialog(this, "Closed Account successfully.");

            // Menutup koneksi dan kembali ke form autentikasi
            pstmt.close();
            conn.close();
            new Authe().setVisible(true);
            this.dispose(); // Menutup form Mainmenu
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
        }
    }//GEN-LAST:event_btCloseaccActionPerformed

    private void btDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositActionPerformed
        // TODO add your handling code here:
        try {
        Connection con = db.conn();
        String accNum = an.getText(); // Ambil nomor akun dari teksfield
        PreparedStatement stmt = con.prepareStatement("SELECT user_name, acc_no, current_balance FROM customer WHERE acc_no = ?");
        stmt.setString(1, accNum);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            DepositForm dp = new DepositForm();
            
            String Name = rs.getString("user_name");
            int accnum = rs.getInt("acc_no");
            String accNO = String.valueOf(accnum);
            int cB = rs.getInt("current_balance");
            String cBln = String.valueOf(cB);
            // Set nilai dari database ke teksfield pada form withdraw
            dp.setNameText(Name);
            dp.setAcnoText(accNO);
            dp.setCurrentBalanceText(cBln);
            
            Mainmenu.setMainmenu(this);
            
            dp.setVisible(true);
            dispose();
            con.close();
        } else {
            // Handle jika tidak ada data yang ditemukan
        }
    } catch (Exception e) {
        // Handle eksepsi
        e.printStackTrace();
    }
    }//GEN-LAST:event_btDepositActionPerformed

    private void btTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTransferActionPerformed
        // TODO add your handling code here:
        try {
        Connection con = db.conn();
        String accNum = an.getText(); // Ambil nomor akun dari teksfield
        PreparedStatement stmt = con.prepareStatement("SELECT user_name, acc_no, current_balance FROM customer WHERE acc_no = ?");
        stmt.setString(1, accNum);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            TransferForm tf = new TransferForm ();
            
            String Name = rs.getString("user_name");
            int accnum = rs.getInt("acc_no");
            String accNO = String.valueOf(accnum);
            int cB = rs.getInt("current_balance");
            String cBln = String.valueOf(cB);
            // Set nilai dari database ke teksfield pada form withdraw
            tf.setNameText(Name);
            tf.setAcnoText(accNO);
            tf.setCurrentBalanceText(cBln);
            
            Mainmenu.setMainmenu(this);
            
            tf.setVisible(true);
            dispose();
            con.close();
        } else {
            // Handle jika tidak ada data yang ditemukan
        }
    } catch (Exception e) {
        // Handle eksepsi
        e.printStackTrace();
    }
    }//GEN-LAST:event_btTransferActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try {
        Connection con = db.conn();
        String accNum = an.getText(); // Ambil nomor akun dari teksfield
        PreparedStatement stmt = con.prepareStatement("SELECT user_name, acc_no FROM customer WHERE acc_no = ?");
        stmt.setString(1, accNum);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            PaymentBillForm pb = new PaymentBillForm();
            
            String Name = rs.getString("user_name");
            int accnum = rs.getInt("acc_no");
            String accNO = String.valueOf(accnum);
            
            pb.setNameText(Name);
            pb.setAcnoText(accNO);
            
            
            Mainmenu.setMainmenu(this);
            
            pb.setVisible(true);
            dispose();
            con.close();
        } else {
            // Handle jika tidak ada data yang ditemukan
        }
    } catch (Exception e) {
        // Handle eksepsi
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            Connection con = db.conn();
            
            String query = "SELECT c.acc_no, c.user_name, l.loan_amount FROM customer c JOIN loan l ON c.acc_no = l.acc_no";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()){
                
                int accNo = rs.getInt("acc_no");
                String name = rs.getString("user_name");
                double amount = rs.getDouble("loan_amount");
                
                DisbursmentLoanForm dl = new DisbursmentLoanForm();
                
                dl.setTextaccno(String.valueOf(accNo));
                dl.setTextname(name);
                dl.setTextamount(String.valueOf(amount));
                
                Mainmenu.setMainmenu(this);
            
                dl.setVisible(true);
                dispose();
                con.close();
            }else{
            
            }
        }catch (SQLException e){
        
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btVerifyLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerifyLoanActionPerformed
        try {
        Connection con = db.conn();
        String accNum = an.getText(); // Ambil nomor akun dari teksfield
        PreparedStatement stmt = con.prepareStatement("SELECT user_name, acc_no FROM customer WHERE acc_no = ?");
        stmt.setString(1, accNum);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            VerifyLoanForm vl = new VerifyLoanForm ();
            
            String Name = rs.getString("user_name");
            int accnum = rs.getInt("acc_no");
            String accNO = String.valueOf(accnum);
            
            vl.setNameText(Name);
            vl.setAcnoText(accNO);
            
            
            Mainmenu.setMainmenu(this);
            
            vl.setVisible(true);
            dispose();
            con.close();
        } else {
            // Handle jika tidak ada data yang ditemukan
        }
    } catch (Exception e) {
        // Handle eksepsi
        e.printStackTrace();
    }
    }//GEN-LAST:event_btVerifyLoanActionPerformed

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
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField an;
    private javax.swing.JButton btCloseacc;
    private javax.swing.JButton btDeposit;
    private javax.swing.JButton btTransfer;
    private javax.swing.JButton btVerifyLoan;
    private javax.swing.JButton btWithdraw;
    private javax.swing.JTextField cBalance;
    private javax.swing.JTextField dofb;
    private javax.swing.JTextField gd;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField mPhone;
    private javax.swing.JTextField un;
    private javax.swing.JTextField usrn;
    // End of variables declaration//GEN-END:variables
}
