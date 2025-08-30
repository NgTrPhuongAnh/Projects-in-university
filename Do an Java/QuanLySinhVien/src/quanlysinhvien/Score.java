package quanlysinhvien;

import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quanlysinhvien.DatabaseConnection;

public class Score extends javax.swing.JFrame {

    public Score() {
        initComponents();
        loadScore();
    }

    private void loadScore() {
        DefaultTableModel model = (DefaultTableModel) Scoretb.getModel();
        model.setRowCount(0); // Xóa các dòng cũ

    try (Connection conn = DatabaseConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM DiemSo")) {

        while (rs.next()) {
            Object[] row = {
                rs.getString("MSV"),
                rs.getString("Hoten"),
                rs.getString("Lop"),
                rs.getString("IDNganh"),
                rs.getString("MonHoc"),
                rs.getInt("SoTin"),
                rs.getFloat("Diem")
            };
            model.addRow(row);
        }
        System.out.println("Data loaded successfully.");
    } catch (Exception e) {
        System.out.println("Error loading data:");
        e.printStackTrace();
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btadd = new javax.swing.JButton();
        btdel = new javax.swing.JButton();
        btfind = new javax.swing.JButton();
        btud = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Scoretb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmsv = new javax.swing.JTextField();
        txtlop = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        txtidmj = new javax.swing.JTextField();
        txtmhoc = new javax.swing.JTextField();
        txtscore = new javax.swing.JTextField();
        txtsotin = new javax.swing.JTextField();
        btclean = new javax.swing.JButton();
        btex = new javax.swing.JButton();

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

        btud.setBackground(new java.awt.Color(220, 220, 220));
        btud.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btud.setForeground(new java.awt.Color(0, 64, 0));
        btud.setText("UPDATE");
        btud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btudActionPerformed(evt);
            }
        });

        Scoretb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MSV", "Họ tên", "Lớp", "Mã ngành", "Môn học", "Số tín", "Điểm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Scoretb);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 220, 220));
        jLabel1.setText("MSV:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(220, 220, 220));
        jLabel2.setText("Họ tên:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(220, 220, 220));
        jLabel3.setText("Mã ngành:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(220, 220, 220));
        jLabel4.setText("Lớp:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(220, 220, 220));
        jLabel5.setText("Môn học:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(220, 220, 220));
        jLabel6.setText("Số tín:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(220, 220, 220));
        jLabel7.setText("Điểm:");

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
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtmsv, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(40, 40, 40)
                                .addComponent(txtlop, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txthoten))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(txtmhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtscore, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtidmj, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtsotin, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btadd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btud, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btfind, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btdel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btclean)
                .addGap(35, 35, 35)
                .addComponent(btex)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btex)
                    .addComponent(btclean))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtmsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtlop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btadd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btdel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtidmj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtsotin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtmhoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtscore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btfind, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btud, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
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

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed
        // TODO add your handling code here:
        String MSV = txtmsv.getText();
        String Hoten = txthoten.getText();
        String Lop = txtlop.getText();
        String IDNganh = txtidmj.getText();
        String MonHoc = txtmhoc.getText();
        String SoTin = txtsotin.getText();
        String Diem = txtscore.getText();

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(
                "INSERT INTO DiemSo (MSV, Hoten, Lop, IDNganh, MonHoc, SoTin, Diem) VALUES (?, ?, ?, ?, ?, ?, ?)"
            )) {
            pstmt.setString(1, MSV);
            pstmt.setString(2, Hoten);
            pstmt.setString(3, Lop);
            pstmt.setString(4, IDNganh);
            pstmt.setString(5, MonHoc);
            pstmt.setString(6, SoTin);
            pstmt.setString(7, Diem);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Added successfully!");
                loadScore(); 
            }
        } catch (Exception e) {
            System.out.println("Error adding data:");
            e.printStackTrace();
        } 
    }//GEN-LAST:event_btaddActionPerformed

    private void btcleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcleanActionPerformed
        // TODO add your handling code here:
        txtmsv.setText("");
        txthoten.setText("");
        txtlop.setText("");
        txtidmj.setText("");
        txtsotin.setText("");
        txtmhoc.setText("");
        txtscore.setText("");
    }//GEN-LAST:event_btcleanActionPerformed

    private void btexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Menu MenuFrame = new Menu();
        MenuFrame.setVisible(true);
    }//GEN-LAST:event_btexActionPerformed

    private void btdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdelActionPerformed
        // TODO add your handling code here:
        String MSV = txtmsv.getText();

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(
                 "DELETE FROM DiemSo WHERE MSV = ?"
             )) {
            pstmt.setString(1, MSV);

            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Deleted successfully!");
                loadScore(); 
            }
        } catch (Exception e) {
            System.out.println("Error deleting data:");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btdelActionPerformed

    private void btudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btudActionPerformed
        // TODO add your handling code here:
        String MSV = txtmsv.getText().trim();
        String Hoten = txthoten.getText().trim();
        String Lop = txtlop.getText().trim();
        String IDNganh = txtidmj.getText().trim();
        String MonHoc = txtmhoc.getText().trim();
        String SoTinStr = txtsotin.getText().trim();
        String DiemStr = txtscore.getText().trim();

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(
                "UPDATE DiemSo SET Hoten = ?, Lop = ?, IDNganh = ?, MonHoc = ?, SoTin = ?, Diem = ? WHERE MSV = ?"
             )) {
            
            // Kiểm tra giá trị SoTinStr có phải số nguyên
            if (!SoTinStr.matches("\\d+")) {
                System.out.println("SoTin must be an integer number!");
                return; // Dừng thực thi nếu dữ liệu không hợp lệ
            }

            // Kiểm tra giá trị DiemStr có phải số thập phân
            if (!DiemStr.matches("\\d+(\\.\\d+)?")) {
                System.out.println("Diem must be a decimal number!");
                return; // Dừng thực thi nếu dữ liệu không hợp lệ
            }

            int SoTin = Integer.parseInt(SoTinStr); // Chuyển đổi chuỗi thành số nguyên
            float Diem = Float.parseFloat(DiemStr); // Chuyển đổi chuỗi thành số thực

        // Gán tham số cho câu lệnh SQL
        pstmt.setString(1, Hoten);
        pstmt.setString(2, Lop);
        pstmt.setString(3, IDNganh);
        pstmt.setString(4, MonHoc);
        pstmt.setInt(5, SoTin);
        pstmt.setFloat(6, Diem); 
        pstmt.setString(7, MSV);

        // Thực thi câu lệnh SQL
        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Updated successfully!");
            loadScore(); // Tải lại danh sách
        } else {
            System.out.println("Cannot find information, check your code.");
        }
    } catch (NumberFormatException e) {
        System.out.println("Error in number format: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Error occurred: ");
        e.printStackTrace();
    }
    }                                    

    private void btfindActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        String MSV = txtmsv.getText().trim();
        String Hoten = txthoten.getText().trim();
        String Lop = txtlop.getText().trim();
        String IDNganh = txtidmj.getText().trim();
        String MonHoc = txtmhoc.getText().trim();
        String SoTin = txtsotin.getText().trim();
        String Diem = txtscore.getText().trim();

        StringBuilder query = new StringBuilder("SELECT * FROM DiemSo WHERE 1=1");
        if (!MSV.isEmpty()) {
            query.append(" AND MSV LIKE ?");
        }
        if (!Hoten.isEmpty()) {
            query.append(" AND Hoten LIKE ?");
        }
        if (!Lop.isEmpty()) {
            query.append(" AND Lop LIKE ?");
        }
        if (!IDNganh.isEmpty()) {
            query.append(" AND IDNganh LIKE ?");
        }
        if (!MonHoc.isEmpty()) {
            query.append(" AND MonHoc LIKE ?");
        }
        if (!SoTin.isEmpty()) {
            query.append(" AND SoTin LIKE ?");
        }
        if (!Diem.isEmpty()) {
            query.append(" AND Diem LIKE ?");
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
            if (!IDNganh.isEmpty()) {
                pstmt.setString(paramIndex++, "%" + IDNganh + "%");
            }
            if (!MonHoc.isEmpty()) {
                pstmt.setString(paramIndex++, "%" + MonHoc + "%");
            }
            if (!SoTin.isEmpty()) {
                pstmt.setString(paramIndex++, "%" + SoTin + "%");
            }
            if (!Diem.isEmpty()) {
                pstmt.setString(paramIndex++, "%" + Diem + "%");
            }

            ResultSet rs = pstmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) Scoretb.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("MSV"),
                    rs.getString("Hoten"),
                    rs.getString("Lop"),
                    rs.getString("IDNganh"),
                    rs.getString("MonHoc"),
                    rs.getString("SoTin"),
                    rs.getString("Diem"),
                });
            }

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Cannot find information!", "Information", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error during find: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btudActionPerformed

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
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Score().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Scoretb;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtidmj;
    private javax.swing.JTextField txtlop;
    private javax.swing.JTextField txtmhoc;
    private javax.swing.JTextField txtmsv;
    private javax.swing.JTextField txtscore;
    private javax.swing.JTextField txtsotin;
    // End of variables declaration//GEN-END:variables
}
