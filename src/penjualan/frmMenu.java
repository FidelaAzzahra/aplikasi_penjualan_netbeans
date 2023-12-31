// Fidela Azzahra
// A11.2021.13417

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package penjualan;

/**
 *
 * @author ASUS
 */

public class frmMenu extends javax.swing.JFrame {
    /**
     * Creates new form frmMenu
     */

    public frmMenu() {
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

        scrollbar1 = new java.awt.Scrollbar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mnBarang = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnTransJual = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnTransPenjualan = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnExport = new javax.swing.JMenuItem();
        mnKeluar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("Data Master");

        mnBarang.setSelected(true);
        mnBarang.setText("Data Barang");
        mnBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBarangActionPerformed(evt);
            }
        });
        jMenu2.add(mnBarang);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Transaksi");

        mnTransJual.setText("Transaksi Penjualan");
        mnTransJual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTransJualActionPerformed(evt);
            }
        });
        jMenu3.add(mnTransJual);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Laporan");

        mnTransPenjualan.setText("Laporan Transaksi Penjualan");
        mnTransPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTransPenjualanActionPerformed(evt);
            }
        });
        jMenu4.add(mnTransPenjualan);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Utility");

        mnExport.setText("Export Database");
        mnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExportActionPerformed(evt);
            }
        });
        jMenu5.add(mnExport);

        jMenuBar1.add(jMenu5);

        mnKeluar.setText("Keluar");
        mnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnKeluarMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnKeluar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnKeluarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnKeluarMouseClicked

    private void mnBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBarangActionPerformed
        // TODO add your handling code here:
        new frmBarang().setVisible(true);
    }//GEN-LAST:event_mnBarangActionPerformed

    private void mnTransJualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTransJualActionPerformed
        // TODO add your handling code here:
        new frmTransaksi().setVisible(true);
    }//GEN-LAST:event_mnTransJualActionPerformed

    private void mnTransPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTransPenjualanActionPerformed
        // TODO add your handling code here:
        new LapPenjualan().setVisible(true);
    }//GEN-LAST:event_mnTransPenjualanActionPerformed

    private void mnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExportActionPerformed
        // TODO add your handling code here:
        new frmBackup().setVisible(true);
    }//GEN-LAST:event_mnExportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JCheckBoxMenuItem mnBarang;
    private javax.swing.JMenuItem mnExport;
    private javax.swing.JMenu mnKeluar;
    private javax.swing.JMenuItem mnTransJual;
    private javax.swing.JMenuItem mnTransPenjualan;
    private java.awt.Scrollbar scrollbar1;
    // End of variables declaration//GEN-END:variables


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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }
}
