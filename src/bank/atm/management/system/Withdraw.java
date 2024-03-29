/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bank.atm.management.system;

import com.sun.jdi.IntegerValue;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.DataBaseConnection;

/**
 *
 * @author Dell
 */
public class Withdraw extends javax.swing.JFrame {

    DataBaseConnection con = new DataBaseConnection();

    PreparedStatement ps;
    ResultSet rs, rs1;
    String sql = "";

    /**
     * Creates new form Withdraw
     */
    private MainMenu mainMenu;

    public Withdraw(MainMenu mainMenu) {
        initComponents();
        this.mainMenu = mainMenu;
    }
    int MyAccNum;
    
    public Withdraw(int AccNum) {
        initComponents();
        MyAccNum=AccNum;
        getBalance();
   
    }
    
     int oldBlance;
    
       private void getBalance() {
        String sql = "select * from accountinfo where accId="+MyAccNum+";";

        try {
            ps = con.getCon().prepareStatement(sql);

           rs1= ps.executeQuery();
            

            if (rs1.next()) {
                oldBlance = rs1.getInt(9);
                balLbl.setText(""+oldBlance);
                
            } else {
                //  JOptionPane.showMessageDialog(this, "");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAmountWithdraw = new javax.swing.JTextField();
        btnWithdraw = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        balLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Atm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MAXIMUM WITHDRAW IS TK 10,000/-");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 260, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PLEASE  ENTER YOUR AMOUNT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 190, 30));
        jPanel1.add(txtAmountWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, 30));

        btnWithdraw.setText("WITHDRAW");
        btnWithdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWithdrawMouseClicked(evt);
            }
        });
        jPanel1.add(btnWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 110, 30));

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 110, 30));

        balLbl.setBackground(new java.awt.Color(255, 0, 0));
        balLbl.setForeground(new java.awt.Color(255, 255, 255));
        balLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(balLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 90, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Your Balance:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 80, 20));

        Atm.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\Bank ATM Management System\\icon\\atm2.jpg")); // NOI18N
        jPanel1.add(Atm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnWithdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWithdrawMouseClicked
        // TODO add your handling code here:
        if (txtAmountWithdraw.getText().isEmpty() || txtAmountWithdraw.getText().equals(0)) {
            JOptionPane.showMessageDialog(rootPane, "Enter the valid Amount");
        } else if(oldBlance<Integer.valueOf(txtAmountWithdraw.getText())) {
                        JOptionPane.showMessageDialog(rootPane, "Not enough Balance");

        }else{
            
            String sql = "Update accountinfo set balance=? where accId=?";
            try {
                ps = con.getCon().prepareStatement(sql);
                ps.setInt(1, oldBlance - Integer.valueOf(txtAmountWithdraw.getText()));
                ps.setInt(2, MyAccNum);

                if (ps.executeUpdate()==1) {
                    JOptionPane.showMessageDialog(rootPane, "Balance Update");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Missing Update");

                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);

                Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_btnWithdrawMouseClicked

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
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainMenu mainMenu = new MainMenu();
                Withdraw withdraw = new Withdraw(mainMenu);
                withdraw.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atm;
    private javax.swing.JLabel balLbl;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAmountWithdraw;
    // End of variables declaration//GEN-END:variables
}
