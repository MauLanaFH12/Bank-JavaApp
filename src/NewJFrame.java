
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MaulanaFH
 */
public class NewJFrame extends javax.swing.JFrame {
int t,s,tab=50000;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbEnter2 = new javax.swing.JButton();
        jbEnter3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TfPin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setDoubleBuffered(false);
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MANDIRI - SIDOARJO");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 40, 330, 40);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Jl.Pahlawan No.31 Sidoarjo");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 70, 230, 40);

        jbEnter2.setText("CONFIRM");
        jbEnter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnter2ActionPerformed(evt);
            }
        });
        jPanel1.add(jbEnter2);
        jbEnter2.setBounds(50, 230, 110, 30);

        jbEnter3.setText("EXIT");
        jbEnter3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnter3ActionPerformed(evt);
            }
        });
        jPanel1.add(jbEnter3);
        jbEnter3.setBounds(230, 230, 110, 30);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ATM");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(160, 10, 80, 40);
        jPanel1.add(TfPin);
        TfPin.setBounds(170, 140, 100, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pin :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(104, 144, 40, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEnter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnter2ActionPerformed
        int Pin;
        int pin=1234;

        Pin = Integer.parseInt(TfPin.getText().toString());
        if (Pin == pin)
        {
            this.setVisible(false);
            new MainMenu().setVisible(true);
        }
        else if ( Pin != pin)
        {
            JOptionPane.showMessageDialog(null, "Masukkan PIN dengan benar!");
        }
    }//GEN-LAST:event_jbEnter2ActionPerformed

    private void jbEnter3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnter3ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbEnter3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TfPin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbEnter;
    private javax.swing.JButton jbEnter1;
    private javax.swing.JButton jbEnter2;
    private javax.swing.JButton jbEnter3;
    // End of variables declaration//GEN-END:variables
}
