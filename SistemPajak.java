import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

class Karyawan {
    
    protected String nip; 
    protected String nama;
    protected String jabatan;
    protected int gajipokok;   

    Karyawan(String nip, String nama, String jabatan, int gajipokok) {
        this.nip = nip;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajipokok = gajipokok;
    }

    Karyawan() {
    }
}

public class SistemPajak extends javax.swing.JFrame { //class
	Karyawan karyawan = new Karyawan(); //object

    int x=0;
    String nip; 
    String nama;
    String jabatan;
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

    public SistemPajak() { //default constructor
        super("Aplikasi Perhitungan Gaji");
        initComponents();
    }
    
    public interface proses{
    	public void gaji();
    	public void total();
    	public void bersih();
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
        txtgajipokok.setText("");
        txttunjanganistri.setText("");
        txtgajikotor.setText("");
        txtpajak.setText("");
        txtgajibersih.setText("");
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtnip = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        btn_simpan = new javax.swing.JButton();
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
        txtnama = new javax.swing.JTextField();
        cmdbersih = new javax.swing.JButton();
        cmdhitung = new javax.swing.JButton();
        txtgajipokok = new javax.swing.JTextField();
        txttunjanganistri = new javax.swing.JTextField();
        txtgajikotor = new javax.swing.JTextField();
        txtpajak = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Gaji Bersih");

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
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

        btn_simpan.setBackground(new java.awt.Color(0, 153, 204));
        btn_simpan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
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

        txtgajibersih.setEnabled(false);

        opsi1.setBackground(new java.awt.Color(51, 51, 51));
        opsi1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opsi1.setForeground(new java.awt.Color(204, 204, 204));
        opsi1.setText("Menikah");
        opsi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opsi1ActionPerformed(evt);
            }
        });

        opsi2.setBackground(new java.awt.Color(51, 51, 51));
        opsi2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opsi2.setForeground(new java.awt.Color(204, 204, 204));
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("NIP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Jabatan");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Status");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Gaji Pokok");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Tunjangan Keluarga ( 20% Gaji )");

        cmdbersih.setBackground(new java.awt.Color(255, 51, 0));
        cmdbersih.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdbersih.setForeground(new java.awt.Color(255, 255, 255));
        cmdbersih.setText("Bersih");
        cmdbersih.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdbersihMouseClicked(evt);
            }
        });

        cmdhitung.setBackground(new java.awt.Color(102, 102, 102));
        cmdhitung.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdhitung.setForeground(new java.awt.Color(255, 255, 255));
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

        txtgajipokok.setEnabled(false);

        txttunjanganistri.setEnabled(false);

        txtgajikotor.setEnabled(false);

        txtpajak.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Gaji Kotor");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Pajak");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("The Coba-Coba Company");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(cmdbersih, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdhitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnip)
                            .addComponent(txtnama)
                            .addComponent(opsi1)
                            .addComponent(opsi2)
                            .addComponent(cmbjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtgajikotor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtpajak)
                                .addComponent(txtgajibersih, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtgajipokok)
                                .addComponent(txttunjanganistri, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(207, 207, 207))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opsi1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opsi2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtgajipokok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttunjanganistri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtgajikotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpajak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgajibersih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdbersih)
                    .addComponent(cmdhitung)
                    .addComponent(btn_simpan))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Sistem Penggajian Karyawan 1.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(178, 178, 178))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseClicked
        
        if (txtnip.getText().trim().equals("") || txtnama.getText().trim().equals("") || txtgajibersih.getText().trim().equals("") ){//jika input kosong
            JOptionPane.showMessageDialog(null, "Lengkapi data terlebih dahulu !!");
        }
        else
        {
        
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
        }
    }//GEN-LAST:event_btn_simpanMouseClicked

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_simpanActionPerformed

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

    private void cmdbersihMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdbersihMouseClicked
        // TODO add your handling code here:
        bersih();
        txtnip.setText("");
        txtnama.setText("");
    }//GEN-LAST:event_cmdbersihMouseClicked

    private void cmdhitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdhitungMouseClicked
        // TODO add your handling code here:
        if (txtgajipokok.getText().trim().equals("")){//jika input kosong
            JOptionPane.showMessageDialog(null, "Coba pilih ulang jabatan terlebih dahulu!!");
        }
        else
        {
        	total();
        }
    }//GEN-LAST:event_cmdhitungMouseClicked

    private void cmdhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdhitungActionPerformed
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
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
