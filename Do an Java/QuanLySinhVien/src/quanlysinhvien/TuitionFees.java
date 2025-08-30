package quanlysinhvien;

import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quanlysinhvien.DatabaseConnection;

public class TuitionFees extends javax.swing.JFrame {

    public TuitionFees() {
        initComponents();
        loadFees();
    }

    private void loadFees() {
        DefaultTableModel model = (DefaultTableModel) Feestb.getModel();
        model.setRowCount(0); // Xóa các dòng cũ

    try (Connection conn = DatabaseConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM HocPhi")) {

        while (rs.next()) {
            Object[] row = {
                rs.getString("MSV"),
                rs.getString("Hoten"),
                rs.getString("Lop"),
                rs.getString("IDNganh"),
                rs.getString("Hocphi"),
                rs.getString("Trangthai")
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
        Feestb = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtmsv = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        txtidmj = new javax.swing.JTextField();
        txtlop = new javax.swing.JTextField();
        txttt = new javax.swing.JTextField();
        txtfee = new javax.swing.JTextField();
        btclean2 = new javax.swing.JButton();
        btex2 = new javax.swing.JButton();

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

        Feestb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MSV", "Họ tên", "Lớp", "Mã ngành", "Học phí", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Feestb);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(220, 220, 220));
        jLabel2.setText("MSV:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(220, 220, 220));
        jLabel3.setText("Lớp:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(220, 220, 220));
        jLabel4.setText("Họ tên:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(220, 220, 220));
        jLabel5.setText("ID Ngành:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(220, 220, 220));
        jLabel7.setText("Trạng thái:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(220, 220, 220));
        jLabel8.setText("Học phí:");

        btclean2.setBackground(new java.awt.Color(0, 64, 0));
        btclean2.setForeground(new java.awt.Color(220, 220, 220));
        btclean2.setText("Clean");
        btclean2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclean2ActionPerformed(evt);
            }
        });

        btex2.setBackground(new java.awt.Color(0, 64, 0));
        btex2.setForeground(new java.awt.Color(255, 0, 0));
        btex2.setText("Exit");
        btex2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btex2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txthoten, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtmsv, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtfee)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txttt))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtidmj, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtlop)))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btud, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btdel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btadd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btfind, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btclean2)
                        .addGap(43, 43, 43)
                        .addComponent(btex2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btclean2)
                    .addComponent(btex2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtmsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtidmj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtlop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txttt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btfind, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btadd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btud, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btdel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btclean2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclean2ActionPerformed
        // TODO add your handling code here:
        txtmsv.setText("");
        txthoten.setText("");
        txtlop.setText("");
        txtidmj.setText("");
        txtfee.setText("");
        txttt.setText("");
    }//GEN-LAST:event_btclean2ActionPerformed

    private void btex2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btex2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Menu MenuFrame = new Menu();
        MenuFrame.setVisible(true);
    }//GEN-LAST:event_btex2ActionPerformed

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed
        // TODO add your handling code here:
        String MSV = txtmsv.getText();
        String Hoten = txthoten.getText();
        String Lop = txtlop.getText();
        String IDNganh = txtidmj.getText();
        String Hocphi = txtfee.getText();
        String Trangthai = txttt.getText(); 

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(
                "INSERT INTO HocPhi (MSV, Hoten, Lop, IDNganh, Hocphi, Trangthai) VALUES (?, ?, ?, ?, ?, ?)"
            )) {
            pstmt.setString(1, MSV);
            pstmt.setString(2, Hoten);
            pstmt.setString(3, Lop); 
            pstmt.setString(4, IDNganh);
            pstmt.setString(5, Hocphi);
            pstmt.setString(6, Trangthai);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Added successfully!");
                loadFees(); 
            }
        } catch (Exception e) {
            System.out.println("Error adding data:");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btaddActionPerformed

    private void btfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfindActionPerformed
        // TODO add your handling code here:
        String MSV = txtmsv.getText().trim();
        String Hoten = txthoten.getText().trim();
        String Lop = txtlop.getText().trim();

        StringBuilder query = new StringBuilder("SELECT * FROM HocPhi WHERE 1=1");
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

            DefaultTableModel model = (DefaultTableModel) Feestb.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("MSV"),
                    rs.getString("Hoten"),
                    rs.getString("Lop"),
                    rs.getString("IDNganh"),
                    rs.getString("Hocphi"),
                    rs.getString("Trangthai")
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

    private void btudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btudActionPerformed
        // TODO add your handling code here:
        String MSV = txtmsv.getText();
        String Hoten = txthoten.getText();
        String Lop = txtlop.getText(); 
        String IDNganh = txtidmj.getText();
        String Hocphi = txtfee.getText();
        String Trangthai = txttt.getText();

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(
                "UPDATE HocPhi SET Hoten = ?, Lop = ?, IDNganh = ?, Hocphi = ?, Trangthai = ? WHERE MSV = ?"
             )) {
            pstmt.setString(1, Hoten);
            pstmt.setString(2, Lop); 
            pstmt.setString(3, IDNganh);
            pstmt.setString(4, Hocphi);
            pstmt.setString(5, Trangthai);
            pstmt.setString(6, MSV);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Updated successfully!");
                loadFees(); 
            }
        } catch (Exception e) {
            System.out.println("Error updating data:");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btudActionPerformed

    private void btdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdelActionPerformed
        // TODO add your handling code here:
         String MSV = txtmsv.getText();

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(
                 "DELETE FROM HocPhi WHERE MSV = ?"
             )) {
            pstmt.setString(1, MSV);

            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Deleted successfully!");
                loadFees(); 
            }
        } catch (Exception e) {
            System.out.println("Error deleting data:");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btdelActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TuitionFees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Feestb;
    private javax.swing.JButton btadd;
    private javax.swing.JButton btclean2;
    private javax.swing.JButton btdel;
    private javax.swing.JButton btex2;
    private javax.swing.JButton btfind;
    private javax.swing.JButton btud;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtfee;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtidmj;
    private javax.swing.JTextField txtlop;
    private javax.swing.JTextField txtmsv;
    private javax.swing.JTextField txttt;
    // End of variables declaration//GEN-END:variables
}
