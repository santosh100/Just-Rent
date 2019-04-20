package PROJECT;

import com.sun.glass.events.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user1
 */
public class MyAddCustomer extends javax.swing.JInternalFrame {

    private PreparedStatement pstmt;
    private ResultSet rs;
    private DefaultTableModel model = new DefaultTableModel();
    static int SUPPLIER_ID;

    public MyAddCustomer() {

        initComponents();
//        snameTextField.requestFocusInWindow();        
        addRecordIntoTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        reportButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        mobnoTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();

        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1385, 700));

        jPanel4.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMER DETAIL ENTRY");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel7.setText("Search:");

        searchTextField.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        searchTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyTyped(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "GENDER", "MOB NO", "ADDRESS"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        reportButton.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        reportButton.setText("REPORT OF LIST OF CUSTOMERS");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reportButton)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setText("Full Name");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setText("ID");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel10.setText("Mobile No.");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setText("Address");

        idTextField.setEditable(false);
        idTextField.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N

        nameTextField.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        nameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTextFieldKeyTyped(evt);
            }
        });

        mobnoTextField.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        mobnoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobnoTextFieldKeyTyped(evt);
            }
        });

        addressTextArea.setColumns(20);
        addressTextArea.setLineWrap(true);
        addressTextArea.setRows(5);
        jScrollPane1.setViewportView(addressTextArea);

        addButton.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel8.setText("(Auto generated, not required while new entry)");

        genderComboBox.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Select-----", "MALE", "FEMALE" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(41, 41, 41))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(62, 62, 62)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(44, 44, 44)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(96, 96, 96)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addComponent(deleteButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(mobnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetButton)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * ******************************************************************************************
     */
    public void addRecordIntoTable() {
        pstmt = null;
        rs = null;
        try {
            String c_name = searchTextField.getText().trim().toUpperCase();
            if (c_name.equalsIgnoreCase("")) {
                pstmt = MyLogin.con.prepareStatement("select * from CUSTOMER_DETAIL", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            } else {
                pstmt = MyLogin.con.prepareStatement("select * from CUSTOMER_DETAIL where C_NAME like '" + c_name + "%'", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            }
            rs = pstmt.executeQuery();
            pstmt.clearParameters();

            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
            while (tm.getRowCount() > 0) {
                tm.removeRow(0);
            }
            while (rs.next()) {
                Object kk[] = {rs.getInt("C_ID"), rs.getString("C_NAME"), rs.getString("C_GENDER"), rs.getString("C_MOB_NO"), rs.getString("C_ADDRESS")};
                tm.addRow(kk);
            }
        } catch (Exception e) {
            System.out.println(" Error inside addrecordinto table " + e);
        }
    }

    /**
     * ***************************************************************************************************
     */
    private void clearFields() {
        idTextField.setText("");
        nameTextField.setText("");
        genderComboBox.removeAllItems();
        genderComboBox.addItem("-----Select-----");
        genderComboBox.addItem("MALE");
        genderComboBox.addItem("FEMALE");
        mobnoTextField.setText("");
        addressTextArea.setText("");
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        String c_name, c_gender, mobno, address;

        c_name = nameTextField.getText().trim().toUpperCase();
        c_gender = genderComboBox.getSelectedItem().toString();
        mobno = mobnoTextField.getText().trim();
        address = addressTextArea.getText().trim().toUpperCase();
        if (c_name.equalsIgnoreCase("") || mobno.equals("") || address.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "FILL ALL DETAILS CAREFULLY (Except Id)", "SAVE RECORD", JOptionPane.ERROR_MESSAGE);
        } else if (mobno.length() != 10) {
            JOptionPane.showMessageDialog(null, "MOBILE NUMBER CANNOT BE LESS THAN 10 DIGITS)", "SAVE RECORD", JOptionPane.ERROR_MESSAGE);
        } else if (c_gender.equalsIgnoreCase("-----Select-----")) {
            JOptionPane.showMessageDialog(null, "SELECT GENDER", "ADD RECORD", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                pstmt = MyLogin.con.prepareStatement("insert into CUSTOMER_DETAIL (C_NAME,C_GENDER,C_MOB_NO,C_ADDRESS) values(?,?,?,?)", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                pstmt.setString(1, c_name);
                pstmt.setString(2, c_gender);
                pstmt.setString(3, mobno);
                pstmt.setString(4, address);
                int i = pstmt.executeUpdate();
                pstmt.clearParameters();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Entry successfull", "Supplier Entry", JOptionPane.INFORMATION_MESSAGE);
                    clearFields();
                    addRecordIntoTable();
                } else {
                    System.out.println("Problem in insertion data in CUSTOMER_DETAIL TABLE");
                }
            } catch (Exception e) {
                System.out.println("Error " + e);
            }
        }
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_addButtonActionPerformed

    public void test() {
        pstmt = null;
        rs = null;
        try {
            int c_id = Integer.parseInt(idTextField.getText());
            pstmt = MyLogin.con.prepareStatement("select * from CUSTOMER_DETAIL where C_ID = ?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pstmt.setInt(1, c_id);
            rs = pstmt.executeQuery();
            pstmt.clearParameters();
            rs.next();
        } catch (Exception e) {
            System.out.println(" Error in test " + e);
        }
    }
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String customer_name = nameTextField.getText().trim().toUpperCase();
        String c_gender = genderComboBox.getSelectedItem().toString();
        String mob_no = mobnoTextField.getText().trim();
        String address = addressTextArea.getText().trim().toUpperCase();

        try {
            int id = Integer.parseInt(idTextField.getText().trim());
            if (!(customer_name.equalsIgnoreCase("") || mob_no.equalsIgnoreCase("") || address.equalsIgnoreCase(""))) {
                if (mob_no.length() != 10) {
                    JOptionPane.showMessageDialog(null, "MOBILE NUMBER CANNOT BE LESS THAN 10 DIGITS)", "UPDATION  ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    test();
                    if (!(customer_name.equalsIgnoreCase(rs.getString("C_NAME")) && address.equalsIgnoreCase(rs.getString("C_ADDRESS")) && mob_no.equalsIgnoreCase(rs.getString("C_MOB_NO")) && c_gender.equalsIgnoreCase(rs.getString("C_GENDER")))) {
                        pstmt = MyLogin.con.prepareStatement("update CUSTOMER_DETAIL set C_NAME = ?,C_GENDER =?,C_MOB_NO = ?, C_ADDRESS = ? where C_ID = ?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        pstmt.setString(1, customer_name);
                        pstmt.setString(2, c_gender);
                        pstmt.setString(3, mob_no);
                        pstmt.setString(4, address);
                        pstmt.setInt(5, id);
                        int i = pstmt.executeUpdate();
                        pstmt.clearParameters();
                        if (i > 0) {
                            JOptionPane.showMessageDialog(null, "Detail Updated Successfully", "UPDATE", JOptionPane.INFORMATION_MESSAGE);
                            clearFields();
                            addRecordIntoTable();
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "NO CHANGES MADE", "UPDATION CANCLED", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "CHOOSE ANY RECORD TO UPDATE FROM THE TABLE", "ZERO SUPPLIER SELECTED", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("Exception inside update button " + e);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:        
        clearFields();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased

        addRecordIntoTable();
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        // TODO add your handling code here:
        reportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        try {
            GenerateReport ob = new GenerateReport();
            ob.showListOfCustomersReport();
        } catch (Exception e) {
            System.out.println("exception " + e);
        }
        reportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

    }//GEN-LAST:event_reportButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:        
        try {
            int id = Integer.parseInt(idTextField.getText().trim());
            int j = JOptionPane.showConfirmDialog(null, "Are you sure you want to permanently delete this record", "Delete Record", JOptionPane.CANCEL_OPTION);
            if (j == 0) {
                pstmt = MyLogin.con.prepareStatement("delete from CUSTOMER_DETAIL where C_ID = ?");
                pstmt.setInt(1, id);
                int i = pstmt.executeUpdate();
                pstmt.clearParameters();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "One record deleted Successfully", "DELETE", JOptionPane.INFORMATION_MESSAGE);
                    clearFields();
                    addRecordIntoTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Deletion Failed", "DELETE", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Deletion canceled", "DELETE", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "SELECT CUSTOMER FROM TABLE TO DELETE", "ZERO CUSTOMER SELECTED", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            System.out.println("Exception inside delete button " + e);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int rowIndex = jTable1.getSelectedRow();
            if (rowIndex > -1) {
                idTextField.setText(model.getValueAt(rowIndex, 0).toString());
                nameTextField.setText(model.getValueAt(rowIndex, 1).toString());
                // jDateChooser1.setDate(Date.valueOf(model.getValueAt(rowIndex ,2).toString().substring(0,10)));
                // jTextField2.setText(model.getValueAt(rowIndex ,2).toString());
                genderComboBox.removeAllItems();
                if (model.getValueAt(rowIndex, 2).toString().equalsIgnoreCase("MALE")) {
                    genderComboBox.addItem("MALE");
                    genderComboBox.addItem("FEMALE");
                } else {
                    genderComboBox.addItem("FEMALE");
                    genderComboBox.addItem("MALE");
                }
                mobnoTextField.setText(model.getValueAt(rowIndex, 3).toString());
                addressTextArea.setText(model.getValueAt(rowIndex, 4).toString());
            }
        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param evt
     *
     * @param
     * letters*************************************************************************************
     */
    public void checkLetters(java.awt.event.KeyEvent evt, String letters) {
        char cr = evt.getKeyChar();
        if (!((Character.isLetter(cr)) || (cr == KeyEvent.VK_BACKSPACE) || (cr == KeyEvent.VK_SPACE))) {
            getToolkit().beep();
            evt.consume();
        }
        if (letters.length() > 49) {
            getToolkit().beep();
            evt.consume();
        }
    }

    /**
     * @param evt
     * @param fieldname
     *
     *
     **************************************************************************************
     */
    public void checkNumbers(java.awt.event.KeyEvent evt, javax.swing.JTextField fieldname) {
        char cr = evt.getKeyChar();
        if (!(Character.isDigit(cr) || (cr == KeyEvent.VK_BACKSPACE) || cr == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
        if (fieldname.getText().length() > 9) {
            getToolkit().beep();
            evt.consume();
        }
    }
    private void searchTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyTyped
        // TODO add your handling code here:
        checkLetters(evt, searchTextField.getText());
    }//GEN-LAST:event_searchTextFieldKeyTyped

    private void mobnoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobnoTextFieldKeyTyped
        checkNumbers(evt, mobnoTextField);
    }//GEN-LAST:event_mobnoTextFieldKeyTyped

    private void nameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextFieldKeyTyped
        checkLetters(evt, nameTextField.getText());
    }//GEN-LAST:event_nameTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mobnoTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton reportButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

}
