/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
/**
 *
 * @author MaulanaFH
 */
public class MainMenu extends javax.swing.JFrame {
 String str, str1;
        int choice, z, pin = 1234, counter = 0, a = 3;
        int t, s, tab = 50000;
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfPilih = new javax.swing.JTextField();
        btPilih = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setDoubleBuffered(false);
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PILIHAN MENU");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 10, 150, 40);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("[1] INFORMASI SALDO");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 70, 230, 30);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("[2] PENYETORAN");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(190, 70, 230, 30);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("[3] PENARIKAN");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 110, 230, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("[4] PETUNJUK");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 110, 230, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("[5] KELUAR");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 160, 230, 30);
        jPanel1.add(tfPilih);
        tfPilih.setBounds(150, 210, 70, 30);

        btPilih.setText("OK");
        btPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPilihActionPerformed(evt);
            }
        });
        jPanel1.add(btPilih);
        btPilih.setBounds(150, 260, 70, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPilihActionPerformed
        // TODO add your handling code here:
        int iPil;
        iPil = Integer.parseInt(tfPilih.getText().toString());
        if (iPil == 1)
        {
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar : " + tab); //informasi saldo
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain ?","ATM BNI SYARIAH-BOJONEGORO",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BNI SYARIAH - BOJONEGORO, ambil kartu ATM Anda.");
                System.exit(0);
            }
        }
        else if (iPil == 2)
        {
            this.setVisible(false);
            str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah penyetoran : " ); //menabung
            s = Integer.parseInt(str1);
            setor hasil = new setor();
            hasil.menabung(tab, s);
            tab =hasil.getsaldo();
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain ?","ATM BNI SYARIAH-BOJONEGORO",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BNI SYARIAH - BOJONEGORO, ambil kartu ATM Anda.");
                System.exit(0);
            }
        }
        else if (iPil == 3)
        {
            this.setVisible(false);
            str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah penarikan : " ); //pengambilan
            t = Integer.parseInt(str1);
            tarik mengambil = new tarik();
            mengambil.ambil(tab,t);
            tab =mengambil.getsaldo();
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM BNI SYARIAH-BOJONEGORO",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BNI SYARIAH - BOJONEGORO, ambil kartu ATM Anda.");
                System.exit(0);
            }
        }
        else if (iPil == 4)
        {
            z=JOptionPane.showConfirmDialog(null,"Cara Penggunaan Aplikasi\n[1] Masukkan PIN dengan benar\n[2] Bertransaksilah dengan benar sesuai pilihan\n[3] Gunakan Uang sesuai kebutuhan dan rajinlah menabung\n ","INFO",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BNI SYARIAH - BOJONEGORO, ambil kartu ATM Anda.");
                System.exit(0);
            }
        }
        else if (iPil == 5)
        {
            JOptionPane.showMessageDialog(null,"SILAHKAN AMBIL KARTU ATM ANDA !","TERIMAKASIH",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_btPilihActionPerformed

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
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPilih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfPilih;
    // End of variables declaration//GEN-END:variables
}
