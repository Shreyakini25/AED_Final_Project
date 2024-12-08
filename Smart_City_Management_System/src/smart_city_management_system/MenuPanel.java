package smart_city_management_system;

import smart_city_management_system.Resident_Management.Resident_Management_System;
import smart_city_management_system.Hospital_Management.Hospital_Management_System;
import smart_city_management_system.Education_Management.Education_Management_System;
import smart_city_management_system.Tourism_Management.Tourism_Management_System;

public class MenuPanel extends javax.swing.JFrame {

    public MenuPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        residentManagement = new javax.swing.JButton();
        hospitalManagement = new javax.swing.JButton();
        educationManagement = new javax.swing.JButton();
        tourismManagement = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 204));
        title.setText("WELCOME TO SMART CITY MANAGEMENT SYSTEM");

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart_city_management_system/SMART CITY (1).png"))); // NOI18N

        residentManagement.setBackground(new java.awt.Color(255, 255, 204));
        residentManagement.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        residentManagement.setForeground(new java.awt.Color(102, 0, 0));
        residentManagement.setText("Resident Management ");
        residentManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                residentManagementActionPerformed(evt);
            }
        });

        hospitalManagement.setBackground(new java.awt.Color(255, 255, 204));
        hospitalManagement.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        hospitalManagement.setForeground(new java.awt.Color(102, 0, 0));
        hospitalManagement.setText("Hospital Management ");
        hospitalManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalManagementActionPerformed(evt);
            }
        });

        educationManagement.setBackground(new java.awt.Color(255, 255, 204));
        educationManagement.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        educationManagement.setForeground(new java.awt.Color(102, 0, 0));
        educationManagement.setText("Education Management ");
        educationManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                educationManagementActionPerformed(evt);
            }
        });

        tourismManagement.setBackground(new java.awt.Color(255, 255, 204));
        tourismManagement.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        tourismManagement.setForeground(new java.awt.Color(102, 0, 0));
        tourismManagement.setText("Tourism Management ");
        tourismManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tourismManagementActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 204));
        exit.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 0, 0));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(title))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(educationManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(residentManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tourismManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospitalManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(residentManagement)
                        .addGap(43, 43, 43)
                        .addComponent(hospitalManagement)
                        .addGap(50, 50, 50)
                        .addComponent(educationManagement)
                        .addGap(50, 50, 50)
                        .addComponent(tourismManagement)
                        .addGap(45, 45, 45)
                        .addComponent(exit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void residentManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_residentManagementActionPerformed

        this.dispose();
        new Resident_Management_System().setVisible(true);
    }//GEN-LAST:event_residentManagementActionPerformed

    private void hospitalManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalManagementActionPerformed
        this.dispose();
        new Hospital_Management_System().setVisible(true);
    }//GEN-LAST:event_hospitalManagementActionPerformed

    private void educationManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_educationManagementActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Education_Management_System().setVisible(true);
    }//GEN-LAST:event_educationManagementActionPerformed

    private void tourismManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tourismManagementActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Tourism_Management_System().setVisible(true);
    }//GEN-LAST:event_tourismManagementActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JButton educationManagement;
    private javax.swing.JButton exit;
    private javax.swing.JButton hospitalManagement;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton residentManagement;
    private javax.swing.JLabel title;
    private javax.swing.JButton tourismManagement;
    // End of variables declaration//GEN-END:variables
}
