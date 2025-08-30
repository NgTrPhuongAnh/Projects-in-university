package quanlysinhvien;

import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quanlysinhvien.DatabaseConnection;

public class Student extends javax.swing.JFrame {

    
    public Student() {
        initComponents();
        loadStudent();
    }
    
    private void loadStudent() {
        DefaultTableModel model = (DefaultTableModel) Studenttb.getModel();
        model.setRowCount(0); // Xóa các dòng cũ

    try (Connection conn = DatabaseConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM ThongTinSinhVien")) {

        while (rs.next()) {
            Object[] row = {
                rs.getString("MSV"),
                rs.getString("Hoten"),
                rs.getDate("NgaySinh"),
                rs.getString("Gioi"),
                rs.getString("Lop"),
                rs.getString("SDT")
            };
            model.addRow(row);
        }
        System.out.println("Data loaded successfully.");
    } catch (Exception e) {
        System.out.println("Error loading data:");
        e.printStackTrace();
    }
}
    
    private void addStudent() {
        // TODO: Implement add functionality
        JOptionPane.showMessageDialog(this, "ADD functionality not implemented yet.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    private void deleteStudent() {
        // TODO: Implement delete functionality
        JOptionPane.showMessageDialog(this, "DELETE functionality not implemented yet.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    private void findStudent() {
        // TODO: Implement find functionality
        JOptionPane.showMessageDialog(this, "FIND functionality not implemented yet.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    private void updateStudent() {
        // TODO: Implement update functionality
        JOptionPane.showMessageDialog(this, "UPDATE functionality not implemented yet.", "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btdel = new javax.swing.JButton();
        btadd = new javax.swing.JButton();
        btfind = new javax.swing.JButton();
        btud = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Studenttb = new javax.swing.JTable();
        txtmsv = new javax.swing.JTextField();
        txtnsinh = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        txtlop = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        txtgioi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btex = new javax.swing.JButton();
        btclean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 64, 0));

        btdel.setBackground(new java.awt.Color(220, 220, 220));
        btdel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btdel.setForeground(new java.awt.Color(0, 64, 0));
        btdel.setText("DELETE");
        btdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdelActionPerformed(evt);
            }
        });

        btadd.setBackground(new java.awt.Color(220, 220, 220));
        btadd.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btadd.setForeground(new java.awt.Color(0, 64, 0));
        btadd.setText("ADD");
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });

        btfind.setBackground(new java.awt.Color(220, 220, 220));
        btfind.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btfind.setForeground(new java.awt.Color(0, 64, 0));
        btfind.setText("FIND");
        btfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfindActionPerformed(evt);
            }
        });

        btud.setBackground(new java.awt.Color(220, 220, 220));
        btud.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btud.setForeground(new java.awt.Color(0, 64, 0));
        btud.setText("UPDATE");
        btud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btudActionPerformed(evt);
            }
        });

        Studenttb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MSV", "Hoten", "NgaySinh", "Gioi", "Lop", "SDT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Studenttb);

        txtlop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlopActionPerformed(evt);
            }
        });

        txtgioi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgioiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 220, 220));
        jLabel1.setText("MSV:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(220, 220, 220));
        jLabel2.setText("Họ tên:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(220, 220, 220));
        jLabel3.setText("Giới:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(220, 220, 220));
        jLabel4.setText("Ngày sinh:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(220, 220, 220));
        jLabel5.setText("Lớp:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(220, 220, 220));
        jLabel6.setText("SDT:");

        btex.setBackground(new java.awt.Color(0, 64, 0));
        btex.setForeground(new java.awt.Color(255, 0, 0));
        btex.setText("Exit");
        btex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexActionPerformed(evt);
            }
        });

        btclean.setBackground(new java.awt.Color(0, 64, 0));
        btclean.setForeground(new java.awt.Color(220, 220, 220));
        btclean.setText("Clean");
        btclean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btadd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtmsv, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtnsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtgioi))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtlop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtsdt)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                        .addComponent(btud, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btdel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btfind, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btclean)
                .addGap(35, 35, 35)
                .addComponent(btex)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btex)
                    .addComponent(btclean))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtmsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btdel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btadd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btfind, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btud, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtnsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtgioi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtlop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtlopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlopActionPerformed

    private void txtgioiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgioiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgioiActionPerformed

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed
        // TODO add your handling code here:
        String MSV = txtmsv.getText();
        String Hoten = txthoten.getText();
        String NgaySinh = txtnsinh.getText();
        String Gioi = txtgioi.getText(); 
        String Lop = txtlop.getText();
        String SDT = txtsdt.getText();

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(
                "INSERT INTO ThongTinSinhVien (MSV, Hoten, NgaySinh, Gioi, Lop, SDT) VALUES (?, ?, ?, ?, ?, ?)"
            )) {
            pstmt.setString(1, MSV);
            pstmt.setString(2, Hoten);
            pstmt.setDate(3, java.sql.Date.valueOf(NgaySinh)); 
            pstmt.setString(4, Gioi);
            pstmt.setString(5, Lop);
            pstmt.setString(6, SDT);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Added successfully!");
                loadStudent(); 
            }
        } catch (Exception e) {
            System.out.println("Error adding data:");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btaddActionPerformed

    private void btdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdelActionPerformed
        // TODO add your handling code here:
        String MSV = txtmsv.getText();

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(
                 "DELETE FROM ThongTinSinhVien WHERE MSV = ?"
             )) {
            pstmt.setString(1, MSV);

            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Deleted successfully!");
                loadStudent(); 
            }
        } catch (Exception e) {
            System.out.println("Error deleting data:");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btdelActionPerformed

    private void btudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btudActionPerformed
        // TODO add your handling code here:
        String MSV = txtmsv.getText();
        String Hoten = txthoten.getText();
        String NgaySinh = txtnsinh.getText(); 
        String Gioi = txtgioi.getText();
        String Lop = txtlop.getText();
        String SDT = txtsdt.getText();

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(
                "UPDATE ThongTinSinhVien SET Hoten = ?, NgaySinh = ?, Gioi = ?, Lop = ?, SDT = ? WHERE MSV = ?"
             )) {
            pstmt.setString(1, Hoten);
            pstmt.setDate(2, java.sql.Date.valueOf(NgaySinh)); 
            pstmt.setString(3, Gioi);
            pstmt.setString(4, Lop);
            pstmt.setString(5, SDT);
            pstmt.setString(6, MSV);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Updated successfully!");
                loadStudent(); 
            }
        } catch (Exception e) {
            System.out.println("Error updating data:");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btudActionPerformed

    private void btfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfindActionPerformed
        // TODO add your handling code here:
        String MSV = txtmsv.getText().trim();
        String Hoten = txthoten.getText().trim();
        String Lop = txtlop.getText().trim();

        StringBuilder query = new StringBuilder("SELECT * FROM ThongTinSinhVien WHERE 1=1");
        if (!MSV.isEmpty()) {
            query.append(" AND MSV LIKE ?");
        }
        if (!Hoten.isEmpty()) {
            query.append(" AND Hoten LIKE ?");
        }
        if (!Lop.isEmpty()) {
            query.append(" AND Lop LIKE ?");
        }

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query.toString())) {

            int paramIndex = 1;
            if (!MSV.isEmpty()) {
                pstmt.setString(paramIndex++, "%" + MSV + "%");
            }
            if (!Hoten.isEmpty()) {
                pstmt.setString(paramIndex++, "%" + Hoten + "%");
            }
            if (!Lop.isEmpty()) {
                pstmt.setString(paramIndex++, "%" + Lop + "%");
            }

            ResultSet rs = pstmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) Studenttb.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("MSV"),
                    rs.getString("Hoten"),
                    rs.getDate("NgaySinh"),
                    rs.getString("Gioi"),
                    rs.getString("Lop"),
                    rs.getString("SDT")
                });
            }

            // Nếu không có kết quả
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Cannot find information!", "Information", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error during find: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btfindActionPerformed

    private void btexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Menu MenuFrame = new Menu();
        MenuFrame.setVisible(true);
    }//GEN-LAST:event_btexActionPerformed

    private void btcleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcleanActionPerformed
        // TODO add your handling code here:
        txtmsv.setText("");
        txthoten.setText("");
        txtnsinh.setText("");
        txtgioi.setText("");
        txtlop.setText("");
        txtsdt.setText("");
    }//GEN-LAST:event_btcleanActionPerformed

    /**
     * @param args the command line arguments
     **/
  
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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Student().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Studenttb;
    private javax.swing.JButton btadd;
    private javax.swing.JButton btclean;
    private javax.swing.JButton btdel;
    private javax.swing.JButton btex;
    private javax.swing.JButton btfind;
    private javax.swing.JButton btud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtgioi;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtlop;
    private javax.swing.JTextField txtmsv;
    private javax.swing.JTextField txtnsinh;
    private javax.swing.JTextField txtsdt;
    // End of variables declaration//GEN-END:variables

}
