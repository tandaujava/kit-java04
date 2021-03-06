/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2.javaswing.b4;

import com.sun.javafx.css.SizeUnits;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class FormThiSinh extends javax.swing.JFrame {

    /**
     * Creates new form FormThiSinh
     */
    public FormThiSinh() {
        initComponents();
    }
    public boolean KiemTraSvKhoiA()
    {
        if(txtHoTen.getText().equals("") || txtNgaySinh.getText().equals("") || txtDiaCHi.getText().equals("")|| txtToan.getText().equals("")
                || txtLy.getText().equals("") || txtHoa.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Khong bo trong thong tin ca nhan!");
          return false;
        }
        else{
            try {
            Float.parseFloat(txtToan.getText());
            Float.parseFloat(txtLy.getText());
            Float.parseFloat(txtHoa.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Diem la chu so!");
                return false;
            }
        }
    return true;
       
    }
    ThiSinhKhoiA sva = new ThiSinhKhoiA();
    public boolean LayThongTinKhoiA(){
        if(KiemTraSvKhoiA()){
            sva.setDiaChi(txtDia.getText());
            sva.setHoTen(txtHoTen.getText());
            sva.setNgaySinh(txtDia.getText());
            sva.setDiemToan(txtToan.getText());
            sva.setDiemLy(txtLy.getText());
            sva.setDiemHoa(txtHoa.getText());
            
            return true;
        }
        return false;
    }
    public boolean XetSVA(){
        float sum;
        if (KiemTraSvKhoiA()) {
            sum = Float.parseFloat(txtToan.getText()) + Float.parseFloat(txtLy.getText()) + Float.parseFloat(txtHoa.getText());
            if( sum <= 20){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
    
    public boolean KiemTraSVc(){
        if(txtHoTen.getText().equals("") || txtNgaySinh.getText().equals("") || txtDiaCHi.getText().equals("")|| 
                txtVan.getText().equals("") || txtSu.getText().equals("") || txtDia.getText().equals("")){
             JOptionPane.showMessageDialog(this, "Khong bo trong thong tin ca nhan!");
          return false;
        }
        else{
            try {
            Float.parseFloat(txtVan.getText());
            Float.parseFloat(txtSu.getText());
            Float.parseFloat(txtDia.getText());
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(this, "Diem la chu so!");
                return false;
            }
        }
        return true;
    }
     public boolean XetSVC(){
        float sum;
        if (KiemTraSVc()) {
            sum = Float.parseFloat(txtVan.getText()) + Float.parseFloat(txtSu.getText()) + Float.parseFloat(txtDia.getText());
            if( sum <= 20){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
    
    ThiSinhKhoiC svc = new ThiSinhKhoiC();
    public boolean LayTHonTInKhoic()
    {
        if(KiemTraSVc()){
        svc.setDiaChi(txtDia.getText());
        svc.setHoTen(txtHoTen.getText());
        svc.setNgaySinh(txtDia.getText());
        svc.setDiemVan(txtVan.getText());
        svc.setDiemSu(txtSu.getText());
        svc.setDiemDia(txtDia.getText());
        
        return true;
    }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiaCHi = new javax.swing.JTextField();
        bgSVKhoiA = new javax.swing.JRadioButton();
        bgSinhVienKhoiB = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtLy = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtToan = new javax.swing.JTextField();
        txtHoa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSu = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        txtVan = new javax.swing.JTextField();
        cbnNhapSVKhoiA = new javax.swing.JButton();
        cbnNhapSVKhoiB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THI SINH");

        jLabel2.setText("Họ tên:");

        jLabel3.setText("Ngày sinh:");

        jLabel4.setText("Địa chỉ:");

        buttonGroup1.add(bgSVKhoiA);
        bgSVKhoiA.setText("Sinh vien khối A");
        bgSVKhoiA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgSVKhoiAActionPerformed(evt);
            }
        });

        buttonGroup1.add(bgSinhVienKhoiB);
        bgSinhVienKhoiB.setText("SInh vien khối B");
        bgSinhVienKhoiB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgSinhVienKhoiBActionPerformed(evt);
            }
        });

        jLabel5.setText("Toán");

        txtLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLyActionPerformed(evt);
            }
        });

        jLabel6.setText("Lý");

        jLabel7.setText("Hóa");

        txtToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToanActionPerformed(evt);
            }
        });

        txtHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoaActionPerformed(evt);
            }
        });

        jLabel8.setText("Văn");

        jLabel9.setText("Sử");

        jLabel10.setText("Địa");

        txtSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuActionPerformed(evt);
            }
        });

        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });

        txtVan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVanActionPerformed(evt);
            }
        });

        cbnNhapSVKhoiA.setText("Tiếp tục nhập sv khoi A");
        cbnNhapSVKhoiA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnNhapSVKhoiAActionPerformed(evt);
            }
        });

        cbnNhapSVKhoiB.setText("Tiếp tục nhập sv khối B");
        cbnNhapSVKhoiB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnNhapSVKhoiBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(cbnNhapSVKhoiA))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(84, 84, 84)
                                    .addComponent(txtDiaCHi, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(84, 84, 84)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(84, 84, 84)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(bgSVKhoiA))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtHoa, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                            .addComponent(txtLy)
                                            .addComponent(txtToan))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(209, 209, 209)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(txtVan, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22))
                                            .addComponent(txtSu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbnNhapSVKhoiB)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(123, 123, 123)
                                                .addComponent(bgSinhVienKhoiB)
                                                .addGap(20, 20, 20)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiaCHi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bgSVKhoiA)
                    .addComponent(bgSinhVienKhoiB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtVan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtHoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbnNhapSVKhoiA)
                    .addComponent(cbnNhapSVKhoiB))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLyActionPerformed

    private void txtToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToanActionPerformed

    private void txtHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoaActionPerformed

    private void txtSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void txtVanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVanActionPerformed

    private void bgSVKhoiAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgSVKhoiAActionPerformed
        // TODO add your handling code here:
        txtToan.setEnabled(true);
        txtLy.setEnabled(true);
        txtHoa.setEnabled(true);
        txtVan.setEnabled(false);
        txtSu.setEnabled(false);
        txtDia.setEnabled(false);
        
    }//GEN-LAST:event_bgSVKhoiAActionPerformed

    private void bgSinhVienKhoiBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgSinhVienKhoiBActionPerformed
        // TODO add your handling code here:
        txtToan.setEnabled(false);
        txtLy.setEnabled(false);
        txtHoa.setEnabled(false);
        txtVan.setEnabled(true);
        txtSu.setEnabled(true);
        txtDia.setEnabled(true);
    }//GEN-LAST:event_bgSinhVienKhoiBActionPerformed

    private void cbnNhapSVKhoiAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnNhapSVKhoiAActionPerformed
        // TODO add your handling code here:
        txtToan.setEnabled(true);
        txtLy.setEnabled(true);
        txtHoa.setEnabled(true);
        txtVan.setEnabled(false);
        txtSu.setEnabled(false);
        txtDia.setEnabled(false);
        if (LayThongTinKhoiA()) {
            sva.HienThiThongTinKhoiA();
        }
         if (XetSVA()) {
            System.out.println("TRUNG TUYEN");
        }else{
            System.out.println("KHONG TRUNG TUYEN");
        }
       txtToan.setText("");
       txtLy.setText("");
       txtHoa.setText("");
       txtHoTen.setText("");
       txtDiaCHi.setText("");
       txtNgaySinh.setText("");
      
    }//GEN-LAST:event_cbnNhapSVKhoiAActionPerformed

    private void cbnNhapSVKhoiBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnNhapSVKhoiBActionPerformed
        // TODO add your handling code here:
        txtToan.setEnabled(false);
        txtLy.setEnabled(false);
        txtHoa.setEnabled(false);
        txtVan.setEnabled(true);
        txtSu.setEnabled(true);
        txtDia.setEnabled(true);
        if (LayTHonTInKhoic()) {
            svc.XuatThongTInThiSinhKhoiC();
        }
        if (XetSVC()) {
            System.out.println("TRUNG TUYEN");
        }else{
            System.out.println("KHONG TRUNG TUYEN");
        }
        txtVan.setText("");
        txtSu.setText("");
        txtDia.setText("");
        txtHoTen.setText("");
        txtDiaCHi.setText("");
        txtNgaySinh.setText("");
        
        
    }//GEN-LAST:event_cbnNhapSVKhoiBActionPerformed

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
            java.util.logging.Logger.getLogger(FormThiSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormThiSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormThiSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormThiSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormThiSinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bgSVKhoiA;
    private javax.swing.JRadioButton bgSinhVienKhoiB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cbnNhapSVKhoiA;
    private javax.swing.JButton cbnNhapSVKhoiB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtDiaCHi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtHoa;
    private javax.swing.JTextField txtLy;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSu;
    private javax.swing.JTextField txtToan;
    private javax.swing.JTextField txtVan;
    // End of variables declaration//GEN-END:variables
}
