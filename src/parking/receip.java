/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author godfr
 */
public class receip extends javax.swing.JFrame {

    /**
     * Creates new form receip
     */
    Connection conn = new dbConnect().dbcon();
    public receip() {
        initComponents();
        btn_print.setVisible(false);
        centerFrame();
        
        Statement st;
        ResultSet rs;
        try{
            st = (Statement) conn.createStatement();
            String sql = "SELECT price FROM totalprice";
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                price.setText(rs.getInt("price") + " บาท");
            }
        } catch(SQLException ex){
            System.out.print(ex);
        }
    }
    
    public void centerFrame() {

            Dimension windowSize = getSize();
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Point centerPoint = ge.getCenterPoint();

            int dx = centerPoint.x - windowSize.width / 2;
            int dy = centerPoint.y - windowSize.height / 2;    
            setLocation(dx, dy);
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
        pay = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        receip_show = new javax.swing.JLabel();
        btn_print = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(115, 12, 22));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sarabun", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ระบุจำนวนเงินที่จ่าย");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        pay.setFont(new java.awt.Font("Sarabun", 0, 18)); // NOI18N
        pay.setText("  ");
        pay.setBorder(null);
        jPanel1.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 120, 30));

        jButton1.setBackground(new java.awt.Color(152, 16, 30));
        jButton1.setFont(new java.awt.Font("Sarabun", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ยืนยัน");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 110, -1));

        jLabel2.setFont(new java.awt.Font("Sarabun", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("เงินทอน");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        receip_show.setFont(new java.awt.Font("Sarabun", 0, 18)); // NOI18N
        receip_show.setForeground(new java.awt.Color(51, 204, 0));
        jPanel1.add(receip_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 180, 30));

        btn_print.setFont(new java.awt.Font("Sarabun", 0, 18)); // NOI18N
        btn_print.setText("พิมพ์ใบเสร็จ");
        btn_print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_printMouseClicked(evt);
            }
        });
        jPanel1.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 140, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 400, 40));

        jLabel3.setFont(new java.awt.Font("Sarabun", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("จำนวนเงืนที่ต้องจ่าย");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        price.setFont(new java.awt.Font("Sarabun", 0, 18)); // NOI18N
        price.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Statement st;
        ResultSet rs;
        
        try{
            st = (Statement) conn.createStatement();
            String sql = "SELECT price FROM totalprice";
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                double receip =  Double.parseDouble(pay.getText()) - rs.getDouble("price");
                if(receip > 0){
                    receip_show.setText(receip + " บาท");
                    btn_print.setVisible(true);
                } else{
                    receip_show.setText("จำนวนเงินไม่เพียงพอ");
                }
            }
        } catch(SQLException ex){
            System.out.print(ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void btn_printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_printMouseClicked
        new bill().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_printMouseClicked

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
            java.util.logging.Logger.getLogger(receip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_print;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField pay;
    private javax.swing.JLabel price;
    private javax.swing.JLabel receip_show;
    // End of variables declaration//GEN-END:variables
}
