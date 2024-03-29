package bank.atm.management.system;

/**
 *
 * @author Dell
 */
public class MainMenu extends javax.swing.JFrame {

    Deposit showDeposit = new Deposit(this);
    Withdraw showWithdraw = new Withdraw(this);
    ChangePin showChangePin = new ChangePin(this);
    FastCash showFastCash = new FastCash(this);
    Balance showBlance = new Balance(this);
    MiniStatement showMiniStatement = new MiniStatement(this);

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        
       
    }
    int MyAccNum;

    public MainMenu(int AccountNum) {
        initComponents();
        MyAccNum = AccountNum;
        accNumLb.setText("" + MyAccNum);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDepositMenu = new javax.swing.JButton();
        btnFastCashMenu = new javax.swing.JButton();
        btnBalaceMenu = new javax.swing.JButton();
        btnWithdrawMenu = new javax.swing.JButton();
        btnMiniStateMenu = new javax.swing.JButton();
        btnChangePinMenu = new javax.swing.JButton();
        btnExitMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        accNumLb = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Atm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDepositMenu.setText("DEPOSIT");
        btnDepositMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDepositMenuMouseClicked(evt);
            }
        });
        jPanel1.add(btnDepositMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 90, 30));

        btnFastCashMenu.setText("FASTCASH");
        btnFastCashMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFastCashMenuMouseClicked(evt);
            }
        });
        jPanel1.add(btnFastCashMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 90, 30));

        btnBalaceMenu.setText("BALANCE");
        btnBalaceMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBalaceMenuMouseClicked(evt);
            }
        });
        jPanel1.add(btnBalaceMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 90, 30));

        btnWithdrawMenu.setText("WITHDRAW");
        btnWithdrawMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWithdrawMenuMouseClicked(evt);
            }
        });
        jPanel1.add(btnWithdrawMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 100, 30));

        btnMiniStateMenu.setText("MINI STATEMENT");
        btnMiniStateMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMiniStateMenuMouseClicked(evt);
            }
        });
        jPanel1.add(btnMiniStateMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 110, 30));

        btnChangePinMenu.setText("CHANGE PIN");
        btnChangePinMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangePinMenuMouseClicked(evt);
            }
        });
        jPanel1.add(btnChangePinMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 100, 30));

        btnExitMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMenuMouseClicked(evt);
            }
        });
        jPanel1.add(btnExitMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 40, 20));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLEASE SELECT YOUR TRANSTRATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 270, 30));

        accNumLb.setBackground(new java.awt.Color(255, 255, 255));
        accNumLb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        accNumLb.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(accNumLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 100, 30));

        jLabel4.setFont(new java.awt.Font("Wide Latin", 1, 8)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Account Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, 30));

        Atm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Atm.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\Bank ATM Management System\\icon\\atm2.jpg")); // NOI18N
        jPanel1.add(Atm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 550));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositMenuMouseClicked
        // TODO add your handling code here:

        new Deposit(MyAccNum).setVisible(true);
        new Deposit(MyAccNum).setLocationRelativeTo(null);
//        this.dispose();

//        dispose();
//        showDeposit.setVisible(true);
//        showDeposit.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnDepositMenuMouseClicked

    private void btnWithdrawMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWithdrawMenuMouseClicked
        // TODO add your handling code here:
        new Withdraw(MyAccNum).setVisible(true);
        new Withdraw(MyAccNum).setLocationRelativeTo(null);

//        dispose();
//        showWithdraw.setVisible(true);
//        showWithdraw.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnWithdrawMenuMouseClicked

    private void btnChangePinMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangePinMenuMouseClicked
        // TODO add your handling code here:
        new ChangePin(MyAccNum).setVisible(true);
        new ChangePin(MyAccNum).setLocationRelativeTo(null);

//        dispose();
//        showChangePin.setVisible(true);
//        showChangePin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnChangePinMenuMouseClicked

    private void btnFastCashMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFastCashMenuMouseClicked
        // TODO add your handling code here:

        dispose();
        showFastCash.setVisible(true);
        showFastCash.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnFastCashMenuMouseClicked

    private void btnBalaceMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBalaceMenuMouseClicked
        // TODO add your handling code here:
        new Balance(MyAccNum).setVisible(true);
        new Balance(MyAccNum).setLocationRelativeTo(null);

//        dispose();
//        showBlance.setVisible(true);
        showBlance.setLocationRelativeTo(null);


    }//GEN-LAST:event_btnBalaceMenuMouseClicked

    private void btnMiniStateMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiniStateMenuMouseClicked
        // TODO add your handling code here
        dispose();
        new MiniStatement(MyAccNum).setVisible(true);

        dispose();
        showMiniStatement.setVisible(true);
        showMiniStatement.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMiniStateMenuMouseClicked

    private void btnExitMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMenuMouseClicked
        // TODO add your handling code here:
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnExitMenuMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atm;
    private javax.swing.JLabel accNumLb;
    private javax.swing.JButton btnBalaceMenu;
    private javax.swing.JButton btnChangePinMenu;
    private javax.swing.JButton btnDepositMenu;
    private javax.swing.JButton btnExitMenu;
    private javax.swing.JButton btnFastCashMenu;
    private javax.swing.JButton btnMiniStateMenu;
    private javax.swing.JButton btnWithdrawMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
