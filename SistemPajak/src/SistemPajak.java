/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;
/**
 *
 * @author Habibillah
 */
public class SistemPajak extends javax.swing.JFrame {
    int x=0;
    int gajipokok;
    int gajikotor;
    int pajak;
    int gajibersih;
    int t_istri;
    int t_anak;
    int j_anak;
    String t_istri_1; 
    String t_anak_1;
    String gajikotor_1;
    String pajak_1;
    String gajibersih_1;

    public SistemPajak() {
        setTitle("Aplikasi Perhitungan Gaji");
        initComponents();
    }

     private void gaji(){
        int pilihan=cmbjabatan.getSelectedIndex();
        switch(pilihan){
            case 0:
                txtgajipokok.setText("50000000");
            break;    
            case 1:
                txtgajipokok.setText("25000000");
            break;
            case 2:
                txtgajipokok.setText("17000000");
            break;
            case 3:
                txtgajipokok.setText("15000000");
            break;
            case 4:
                txtgajipokok.setText("12000000");
            break;
            case 5:
                txtgajipokok.setText("5000000");
            break;        
        }
    }
     
      private void Menikah(){
        gajipokok=Integer.valueOf(txtgajipokok.getText());
        t_istri=(20*gajipokok)/100;
        t_istri_1=String.valueOf(t_istri);
        txttunjanganistri.setText(t_istri_1);
    }
      
    private void BelumMenikah(){
         t_istri=0;
        txttunjanganistri.setText("0");
    }

      
    private void total(){
        gajipokok=Integer.valueOf(txtgajipokok.getText());
        if(opsi1.isSelected()==true){
         gajikotor=gajipokok+t_istri;   
        }else{
            gajikotor=gajipokok;
        }
        if (gajikotor >=50000000){
        pajak=(gajikotor*15)/100;
        }
        else if (gajikotor >= 15000000){
        pajak=(gajikotor*10)/100;
        }
        else{
        pajak=(gajikotor*5)/100;
        }
        gajibersih=gajikotor-pajak;
        gajikotor_1=String.valueOf(gajikotor);
        pajak_1=String.valueOf(pajak);
        gajibersih_1=String.valueOf(gajibersih);
        txtgajikotor.setText(gajikotor_1);
        txtpajak.setText(pajak_1);
        txtgajibersih.setText(gajibersih_1);
    }  
    
    private void bersih(){
         gajipokok=0;
         gajikotor=0;
         pajak=0;
         gajibersih=0;
         t_istri=0;
         t_anak=0;
         j_anak=0;
        txtgajipokok.setText("0");
        txttunjanganistri.setText("0");
        txtgajikotor.setText("0");
        txtpajak.setText("0");
        txtgajibersih.setText("0");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtnama = new javax.swing.JTextField();
        cmdbersih = new javax.swing.JButton();
        cmdhitung = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtgajipokok = new javax.swing.JTextField();
        txttunjanganistri = new javax.swing.JTextField();
        txtgajikotor = new javax.swing.JTextField();
        txtpajak = new javax.swing.JTextField();
        txtgajibersih = new javax.swing.JTextField();
        opsi1 = new javax.swing.JRadioButton();
        opsi2 = new javax.swing.JRadioButton();
        cmbjabatan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnip = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        btn_simpan = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cmdbersih.setText("Bersih");
        cmdbersih.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdbersihMouseClicked(evt);
            }
        });

        cmdhitung.setText("Hitung");
        cmdhitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdhitungMouseClicked(evt);
            }
        });
        cmdhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdhitungActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Sistem Pajak Karyawan");

        txtgajipokok.setEnabled(false);

        txttunjanganistri.setEnabled(false);

        txtgajikotor.setEnabled(false);

        txtpajak.setEnabled(false);

        txtgajibersih.setEnabled(false);

        opsi1.setText("Menikah");
        opsi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opsi1ActionPerformed(evt);
            }
        });

        opsi2.setText("Lajang");
        opsi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opsi2ActionPerformed(evt);
            }
        });

        cmbjabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Direktur", "Manager", "Kabag", "Sekretaris", "Karyawan", "Office Boy" }));
        cmbjabatan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbjabatanItemStateChanged(evt);
            }
        });
        cmbjabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbjabatanActionPerformed(evt);
            }
        });

        jLabel1.setText("NIP");

        jLabel2.setText("Nama");

        jLabel3.setText("Jabatan");

        jLabel4.setText("Status");

        jLabel6.setText("Gaji Pokok");

        jLabel7.setText("Tunjangan Keluarga ( 20% Gaji )");

        jLabel9.setText("Gaji Kotor");

        jLabel10.setText("Pajak");

        jLabel11.setText("Gaji Bersih");

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIP", "Nama", "Jabatan", "Gaji Kotor", "Pajak", "Gaji Bersih"
            }
        ));
        jScrollPane2.setViewportView(tabelData);

        btn_simpan.setText("Simpan");
        btn_simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpanMouseClicked(evt);
            }
        });
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnip)
                                            .addComponent(txtnama)
                                            .addComponent(opsi1)
                                            .addComponent(opsi2)
                                            .addComponent(cmbjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmdbersih)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmdhitung)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_simpan)
                                        .addGap(30, 30, 30)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtgajikotor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtpajak)
                                        .addComponent(txtgajibersih, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtgajipokok)
                                        .addComponent(txttunjanganistri, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(jLabel12)))
                        .addGap(0, 82, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opsi1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opsi2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtgajipokok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttunjanganistri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtgajikotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpajak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgajibersih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdbersih)
                    .addComponent(cmdhitung)
                    .addComponent(btn_simpan))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdbersihMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdbersihMouseClicked
        // TODO add your handling code here:
        bersih();
        txtnip.setText("");
        txtnama.setText("");
    }//GEN-LAST:event_cmdbersihMouseClicked

    private void cmdhitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdhitungMouseClicked
        // TODO add your handling code here:
        total();
    }//GEN-LAST:event_cmdhitungMouseClicked

    private void cmdhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdhitungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdhitungActionPerformed

    private void opsi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opsi1ActionPerformed
        // TODO add your handling code here:
        Menikah();
    }//GEN-LAST:event_opsi1ActionPerformed

    private void opsi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opsi2ActionPerformed
        // TODO add your handling code here:
        BelumMenikah();
    }//GEN-LAST:event_opsi2ActionPerformed

    private void cmbjabatanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbjabatanItemStateChanged
        // TODO add your handling code here:
        bersih();
        gaji();
        if (opsi1.isSelected()==true) {
            Menikah();
        }else{
            BelumMenikah();
        }
    }//GEN-LAST:event_cmbjabatanItemStateChanged

    private void cmbjabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbjabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbjabatanActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
    }//GEN-LAST:event_formWindowOpened

    private void btn_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseClicked
            tabelData.setValueAt(txtnip.getText(),x,0);
            tabelData.setValueAt(txtnama.getText(),x,1);
            tabelData.setValueAt(cmbjabatan.getSelectedItem(),x,2);
            tabelData.setValueAt(txtgajikotor.getText(),x,3);
            tabelData.setValueAt(txtpajak.getText(),x,4);
            tabelData.setValueAt(txtgajibersih.getText(),x,5);
            x=x+1;
            bersih();
            txtnip.setText("");
            txtnama.setText("");
    }//GEN-LAST:event_btn_simpanMouseClicked

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_simpanActionPerformed

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
            java.util.logging.Logger.getLogger(SistemPajak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemPajak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemPajak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemPajak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemPajak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> cmbjabatan;
    private javax.swing.JButton cmdbersih;
    private javax.swing.JButton cmdhitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton opsi1;
    private javax.swing.JRadioButton opsi2;
    private javax.swing.JTable tabelData;
    private javax.swing.JTextField txtgajibersih;
    private javax.swing.JTextField txtgajikotor;
    private javax.swing.JTextField txtgajipokok;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnip;
    private javax.swing.JTextField txtpajak;
    private javax.swing.JTextField txttunjanganistri;
    // End of variables declaration//GEN-END:variables
}
