package PROJECT;

import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user1
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MAIN_MENU
     */
    public MainPage() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        this.setLocationRelativeTo(null);
        MyFrontPage ob = new MyFrontPage();
        desktopPane.add(ob);
        ob.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        roomdetailLabel = new javax.swing.JLabel();
        staffdetailLabel = new javax.swing.JLabel();
        customerdetailLabel = new javax.swing.JLabel();
        roomstatusLabel = new javax.swing.JLabel();
        roombookingLabel = new javax.swing.JLabel();
        paymentLabel = new javax.swing.JLabel();
        reportLabel = new javax.swing.JLabel();
        backupLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1175, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        homeLabel.setBackground(new java.awt.Color(102, 0, 102));
        homeLabel.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLabel.setText("HOME");
        homeLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        homeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelMouseExited(evt);
            }
        });

        roomdetailLabel.setBackground(new java.awt.Color(102, 0, 102));
        roomdetailLabel.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        roomdetailLabel.setForeground(new java.awt.Color(255, 255, 255));
        roomdetailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomdetailLabel.setText("ROOM DETAIL");
        roomdetailLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        roomdetailLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        roomdetailLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomdetailLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roomdetailLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roomdetailLabelMouseExited(evt);
            }
        });

        staffdetailLabel.setBackground(new java.awt.Color(102, 0, 102));
        staffdetailLabel.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        staffdetailLabel.setForeground(new java.awt.Color(255, 255, 255));
        staffdetailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staffdetailLabel.setText("STAFF DETAIL");
        staffdetailLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        staffdetailLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        staffdetailLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffdetailLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                staffdetailLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                staffdetailLabelMouseExited(evt);
            }
        });

        customerdetailLabel.setBackground(new java.awt.Color(102, 0, 102));
        customerdetailLabel.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        customerdetailLabel.setForeground(new java.awt.Color(255, 255, 255));
        customerdetailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerdetailLabel.setText("CUSTOMER DETAIL");
        customerdetailLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        customerdetailLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerdetailLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerdetailLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerdetailLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerdetailLabelMouseExited(evt);
            }
        });

        roomstatusLabel.setBackground(new java.awt.Color(102, 0, 102));
        roomstatusLabel.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        roomstatusLabel.setForeground(new java.awt.Color(255, 255, 255));
        roomstatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomstatusLabel.setText("ROOM STATUS");
        roomstatusLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        roomstatusLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        roomstatusLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomstatusLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roomstatusLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roomstatusLabelMouseExited(evt);
            }
        });

        roombookingLabel.setBackground(new java.awt.Color(102, 0, 102));
        roombookingLabel.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        roombookingLabel.setForeground(new java.awt.Color(255, 255, 255));
        roombookingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roombookingLabel.setText("ROOM BOOKING");
        roombookingLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        roombookingLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        roombookingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roombookingLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roombookingLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roombookingLabelMouseExited(evt);
            }
        });

        paymentLabel.setBackground(new java.awt.Color(102, 0, 102));
        paymentLabel.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        paymentLabel.setForeground(new java.awt.Color(255, 255, 255));
        paymentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paymentLabel.setText("PAYMENT / BILL");
        paymentLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        paymentLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paymentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paymentLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paymentLabelMouseExited(evt);
            }
        });

        reportLabel.setBackground(new java.awt.Color(102, 0, 102));
        reportLabel.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        reportLabel.setForeground(new java.awt.Color(255, 255, 255));
        reportLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportLabel.setText("REPORTS");
        reportLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        reportLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportLabelMouseExited(evt);
            }
        });

        backupLabel.setBackground(new java.awt.Color(102, 0, 102));
        backupLabel.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        backupLabel.setForeground(new java.awt.Color(255, 255, 255));
        backupLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backupLabel.setText("BACKUP");
        backupLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backupLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backupLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backupLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backupLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backupLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomdetailLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staffdetailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerdetailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(roomstatusLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roombookingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paymentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backupLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roomdetailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(staffdetailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customerdetailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roomstatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roombookingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(desktopPane)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomdetailLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomdetailLabelMouseClicked
        // TODO add your handling code here:
        roomdetailLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        MyAddRoom ob = new MyAddRoom();
        desktopPane.add(ob);
        ob.setVisible(true);
        roomdetailLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_roomdetailLabelMouseClicked

    private void staffdetailLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffdetailLabelMouseClicked
        // TODO add your handling code here:
        staffdetailLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        MyAddStaff ob = new MyAddStaff();
        desktopPane.add(ob);
        ob.setVisible(true);
        staffdetailLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_staffdetailLabelMouseClicked

    private void customerdetailLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerdetailLabelMouseClicked
        // TODO add your handling code here:
        customerdetailLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        MyAddCustomer ob = new MyAddCustomer();
        desktopPane.add(ob);
        ob.setVisible(true);
        customerdetailLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_customerdetailLabelMouseClicked

    private void roomstatusLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomstatusLabelMouseClicked
        // TODO add your handling code here:
        roomstatusLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        MyRoomStatus ob = new MyRoomStatus();
        desktopPane.add(ob);
        ob.setVisible(true);
        roomstatusLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_roomstatusLabelMouseClicked

    private void roombookingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roombookingLabelMouseClicked
        // TODO add your handling code here:
        roombookingLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        MyBooking ob = new MyBooking();
        desktopPane.add(ob);
        ob.setVisible(true);
        roombookingLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_roombookingLabelMouseClicked

    private void paymentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentLabelMouseClicked
        // TODO add your handling code here:
        paymentLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        MyPayBill ob = new MyPayBill();
        desktopPane.add(ob);
        ob.setVisible(true);
        paymentLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_paymentLabelMouseClicked

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        // TODO add your handling code here:    
        homeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        MyFrontPage ob = new MyFrontPage();
        desktopPane.add(ob);
        ob.setVisible(true);
        homeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    }//GEN-LAST:event_homeLabelMouseClicked

    private void reportLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportLabelMouseClicked
        // TODO add your handling code here:
        reportLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        MyReport ob = new MyReport();
        desktopPane.add(ob);
        ob.setVisible(true);
        reportLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_reportLabelMouseClicked

    private void homeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseEntered
        // TODO add your handling code here:
        homeLabel.setOpaque(true);
        homeLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_homeLabelMouseEntered

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseExited
        // TODO add your handling code here:
        homeLabel.setOpaque(false);
        homeLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.EtchedBorder.LOWERED));
    }//GEN-LAST:event_homeLabelMouseExited

    private void roomdetailLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomdetailLabelMouseEntered
        // TODO add your handling code here:
        roomdetailLabel.setOpaque(true);
        roomdetailLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_roomdetailLabelMouseEntered

    private void roomdetailLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomdetailLabelMouseExited
        // TODO add your handling code here:
        roomdetailLabel.setOpaque(false);
        roomdetailLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.EtchedBorder.LOWERED));
    }//GEN-LAST:event_roomdetailLabelMouseExited

    private void staffdetailLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffdetailLabelMouseEntered
        // TODO add your handling code here:
        staffdetailLabel.setOpaque(true);
        staffdetailLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_staffdetailLabelMouseEntered

    private void staffdetailLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffdetailLabelMouseExited
        // TODO add your handling code here:
        staffdetailLabel.setOpaque(false);
        staffdetailLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.EtchedBorder.LOWERED));
    }//GEN-LAST:event_staffdetailLabelMouseExited

    private void customerdetailLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerdetailLabelMouseEntered
        // TODO add your handling code here:
        customerdetailLabel.setOpaque(true);
        customerdetailLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_customerdetailLabelMouseEntered

    private void customerdetailLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerdetailLabelMouseExited
        // TODO add your handling code here:
        customerdetailLabel.setOpaque(false);
        customerdetailLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.EtchedBorder.LOWERED));
    }//GEN-LAST:event_customerdetailLabelMouseExited

    private void roomstatusLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomstatusLabelMouseEntered
        // TODO add your handling code here:
        roomstatusLabel.setOpaque(true);
        roomstatusLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_roomstatusLabelMouseEntered

    private void roomstatusLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomstatusLabelMouseExited
        // TODO add your handling code here:
        roomstatusLabel.setOpaque(false);
        roomstatusLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.EtchedBorder.LOWERED));
    }//GEN-LAST:event_roomstatusLabelMouseExited

    private void roombookingLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roombookingLabelMouseEntered
        // TODO add your handling code here:
        roombookingLabel.setOpaque(true);
        roombookingLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_roombookingLabelMouseEntered

    private void roombookingLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roombookingLabelMouseExited
        // TODO add your handling code here:
        roombookingLabel.setOpaque(false);
        roombookingLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.EtchedBorder.LOWERED));
    }//GEN-LAST:event_roombookingLabelMouseExited

    private void paymentLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentLabelMouseEntered
        // TODO add your handling code here:
        paymentLabel.setOpaque(true);
        paymentLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_paymentLabelMouseEntered

    private void paymentLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentLabelMouseExited
        // TODO add your handling code here:
        paymentLabel.setOpaque(false);
        paymentLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.EtchedBorder.LOWERED));
    }//GEN-LAST:event_paymentLabelMouseExited

    private void reportLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportLabelMouseEntered
        // TODO add your handling code here:
        reportLabel.setOpaque(true);
        reportLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_reportLabelMouseEntered

    private void reportLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportLabelMouseExited
        // TODO add your handling code here:
        reportLabel.setOpaque(false);
        reportLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.EtchedBorder.LOWERED));
    }//GEN-LAST:event_reportLabelMouseExited

    private void backupLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backupLabelMouseClicked
        // TODO add your handling code here:
        backupLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        MyBackUp ob = new MyBackUp();
        desktopPane.add(ob);
        ob.setVisible(true);
        backupLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    }//GEN-LAST:event_backupLabelMouseClicked

    private void backupLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backupLabelMouseEntered
        // TODO add your handling code here:
        backupLabel.setOpaque(true);
        backupLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_backupLabelMouseEntered

    private void backupLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backupLabelMouseExited
        // TODO add your handling code here:
        backupLabel.setOpaque(false);
        backupLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.EtchedBorder.LOWERED));
    }//GEN-LAST:event_backupLabelMouseExited

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backupLabel;
    private javax.swing.JLabel customerdetailLabel;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JLabel roombookingLabel;
    private javax.swing.JLabel roomdetailLabel;
    private javax.swing.JLabel roomstatusLabel;
    private javax.swing.JLabel staffdetailLabel;
    // End of variables declaration//GEN-END:variables

}
