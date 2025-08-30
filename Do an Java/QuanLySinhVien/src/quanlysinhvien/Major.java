package quanlysinhvien;

import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quanlysinhvien.DatabaseConnection;

public class Major extends javax.swing.JFrame {

    public Major() {
        initComponents();
        loadMajor();
    }

    private void loadMajor() {
        DefaultTableModel model = (DefaultTableModel) Majortb.getModel();
        model.setRowCount(0); // Xóa các dòng cũ

    try (Connection conn = DatabaseConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM NganhHoc")) {

        while (rs.next()) {
            Object[] row = {
                rs.getString("IDNganh"),
                rs.getString("TenNganh"),
                rs.getInt("TongTin")
            };
            model.addRow(row);
        }
        System.out.println("Data loaded successfully.");
    } catch (Exception e) {
        System.out.println("Error loading data:");
        e.printStackTrace();
    }
}
    
    private void addMajor() {
        // TODO: Implement add functionality
        JOptionPane.showMessageDialog(this, "ADD functionality not implemented yet.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    private void deleteMajor() {
        // TODO: Implement delete functionality
        JOptionPane.showMessageDialog(this, "DELETE functionality not implemented yet.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    private void findMajor() {
        // TODO: Implement find functionality
        JOptionPane.showMessageDialog(this, "FIND functionality not implemented yet.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    private void updateMajor() {
        // TODO: Implement update functionality
        JOptionPane.showMessageDialog(this, "UPDATE functionality not implemented yet.", "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btadd = new javax.swing.JButton();
        btdel = new javax.swing.JButton();
        btfind = new javax.swing.JButton();
        btud = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Majortb = new javax.swing.JTable();
        lblidmj = new javax.swing.JLabel();
        lbltenmj = new javax.swing.JLabel();
        lblttin = new javax.swing.JLabel();
        txtidmj = new javax.swing.JTextField();
        txtttin = new javax.swing.JTextField();
        txttenmj = new javax.swing.JTextField();
        btclean = new javax.swing.JButton();
        btex = new javax.swing.JButton();

        jButton2.setBackground(new java.awt.Color(220, 220, 220));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 64, 0));
        jButton2.setText("ADD");

        jButton1.setBackground(new java.awt.Color(220, 220, 220));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 64, 0));
        jButton1.setText("DELETE");

        jButton3.setBackground(new java.awt.Color(220, 220, 220));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 64, 0));
        jButton3.setText("FIND");

        jButton4.setBackground(new java.awt.Color(220, 220, 220));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 64, 0));
        jButton4.setText("UPDATE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 64, 0));

        btadd.setBackground(new java.awt.Color(220, 220, 220));
        btadd.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btadd.setForeground(new java.awt.Color(0, 64, 0));
        btadd.setText("ADD");
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });

        btdel.setBackground(new java.awt.Color(220, 220, 220));
        btdel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btdel.setForeground(new java.awt.Color(0, 64, 0));
        btdel.setText("DELETE");
        btdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdelActionPerformed(evt);
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

        Majortb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã ngành", "Tên ngành", "Tổng tín"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Majortb);

        lblidmj.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblidmj.setForeground(new java.awt.Color(220, 220, 220));
        lblidmj.setText("Mã ngành:");

        lbltenmj.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltenmj.setForeground(new java.awt.Color(220, 220, 220));
        lbltenmj.setText("Tên ngành:");

        lblttin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblttin.setForeground(new java.awt.Color(220, 220, 220));
        lblttin.setText("Tổng tín:");

        btclean.setBackground(new java.awt.Color(0, 64, 0));
        btclean.setForeground(new java.awt.Color(220, 220, 220));
        btclean.setText("Clean");
        btclean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcleanActionPerformed(evt);
            }
        });

        btex.setBackground(new java.awt.Color(0, 64, 0));
        btex.setForeground(new java.awt.Color(255, 0, 0));
        btex.setText("Exit");
        btex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbltenmj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblidmj, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtidmj, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(lblttin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtttin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txttenmj))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btadd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btfind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btdel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btclean)
                                .addGap(35, 35, 35)
                                .addComponent(btex)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btex)
                    .addComponent(btclean))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btdel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btadd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblidmj)
                    .addComponent(txtidmj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblttin)
                    .addComponent(txtttin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttenmj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltenmj)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btud, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btfind, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63))
        );

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

    private void btcleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcleanActionPerformed
        // TODO add your handling code here:
        txtidmj.setText("");
        txttenmj.setText("");
        txtttin.setText("");
    }//GEN-LAST:event_btcleanActionPerformed

    private void btexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Menu MenuFrame = new Menu();
        MenuFrame.setVisible(true);
    }//GEN-LAST:event_btexActionPerformed

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed
        // TODO add your handling code here:
        String IDNganh = txtidmj.getText();
        String TenNganh = txttenmj.getText();
        String TongTin = txtttin.getText();

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(
                "INSERT INTO NganhHoc (IDNganh, TenNganh, TongTin) VALUES (?, ?, ?)"
            )) {
            pstmt.setString(1, IDNganh);
            pstmt.setString(2, TenNganh);
            pstmt.setString(3, TongTin);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Added successfully!");
                loadMajor(); 
            }
        } catch (Exception e) {
            System.out.println("Error adding data:");
            e.printStackTrace();
        } 
    }//GEN-LAST:event_btaddActionPerformed

    private void btdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdelActionPerformed
        // TODO add your handling code here:
        String IDNganh = txtidmj.getText();

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(
                 "DELETE FROM NganhHoc WHERE IDNganh = ?"
             )) {
            pstmt.setString(1, IDNganh);

            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Deleted successfully!");
                loadMajor(); 
            }
        } catch (Exception e) {
            System.out.println("Error deleting data:");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btdelActionPerformed

    private void btudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btudActionPerformed
        // TODO add your handling code here:
        String IDNganh = txtidmj.getText();
        String TenNganh = txttenmj.getText();
        String TongTinStr = txtttin.getText(); 

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(
                "UPDATE NganhHoc SET TenNganh = ?, TongTin = ? WHERE IDNganh = ?"
             )) {
            
            // Kiểm tra giá trị TongTinStr có phải số nguyên
            if (!TongTinStr.matches("\\d+")) {
                System.out.println("TongTin must be integer number!");
                return; // Dừng thực thi nếu dữ liệu không hợp lệ
            }
            
            int TongTin = Integer.parseInt(TongTinStr); // Chuyển đổi chuỗi thành số nguyên
            
           // Gán tham số cho câu lệnh SQL
        pstmt.setString(1, TenNganh); // Gán Tên Ngành
        pstmt.setInt(2, TongTin);    // Gán Tổng Tín (kiểu số nguyên)
        pstmt.setString(3, IDNganh); // Gán ID Ngành

        // Thực thi câu lệnh SQL
        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Updated successfully!");
            loadMajor(); // Tải lại danh sách
        } else {
            System.out.println("Cannot find information, check your code");
        }
    } catch (NumberFormatException e) {
        System.out.println("TongTin must be integer number");
        e.printStackTrace();
    } catch (Exception e) {
        System.out.println("Cannot find error: ");
        e.printStackTrace();
        }
    }//GEN-LAST:event_btudActionPerformed

    private void btfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfindActionPerformed
        // TODO add your handling code here:
        String IDNganh = txtidmj.getText().trim();
        String TenNganh = txttenmj.getText().trim();
        String TongTin = txtttin.getText().trim();

        StringBuilder query = new StringBuilder("SELECT * FROM NganhHoc WHERE 1=1");
        if (!IDNganh.isEmpty()) {
            query.append(" AND IDNganh LIKE ?");
        }
        if (!TenNganh.isEmpty()) {
            query.append(" AND TenNganh LIKE ?");
        }
        if (!TongTin.isEmpty()) {
            query.append(" AND TongTin LIKE ?");
        }

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query.toString())) {

            int paramIndex = 1;
            if (!IDNganh.isEmpty()) {
                pstmt.setString(paramIndex++, "%" + IDNganh + "%");
            }
            if (!TenNganh.isEmpty()) {
                pstmt.setString(paramIndex++, "%" + TenNganh + "%");
            }
            if (!TongTin.isEmpty()) {
                pstmt.setString(paramIndex++, "%" + TongTin + "%");
            }

            ResultSet rs = pstmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) Majortb.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("IDNganh"),
                    rs.getString("TenNganh"),
                    rs.getString("TongTin")
                });
            }

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Cannot find information!", "Information", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error during find: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btfindActionPerformed

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
            java.util.logging.Logger.getLogger(Major.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Major.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Major.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Major.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Major().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Majortb;
    private javax.swing.JButton btadd;
    private javax.swing.JButton btclean;
    private javax.swing.JButton btdel;
    private javax.swing.JButton btex;
    private javax.swing.JButton btfind;
    private javax.swing.JButton btud;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblidmj;
    private javax.swing.JLabel lbltenmj;
    private javax.swing.JLabel lblttin;
    private javax.swing.JTextField txtidmj;
    private javax.swing.JTextField txttenmj;
    private javax.swing.JTextField txtttin;
    // End of variables declaration//GEN-END:variables
}
