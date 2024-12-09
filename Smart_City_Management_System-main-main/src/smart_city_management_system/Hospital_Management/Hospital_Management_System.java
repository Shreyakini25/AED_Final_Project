package smart_city_management_system.Hospital_Management;

import smart_city_management_system.MenuPanel;

public class Hospital_Management_System extends javax.swing.JFrame {

    public Hospital_Management_System() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        Image2 = new javax.swing.JLabel();
        AddPatient = new javax.swing.JButton();
        ViewPatient = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        AddDoctor = new javax.swing.JButton();
        ViewDoctor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        title2.setBackground(new java.awt.Color(255, 255, 255));
        title2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        title2.setForeground(new java.awt.Color(255, 255, 204));
        title2.setText("WELCOME TO HOSPITAL  MANAGEMENT SYSTEM");

        Image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart_city_management_system/Hospital Management (3).png"))); // NOI18N

        AddPatient.setBackground(new java.awt.Color(255, 255, 204));
        AddPatient.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        AddPatient.setForeground(new java.awt.Color(102, 0, 0));
        AddPatient.setText("Add Patient");
        AddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPatientActionPerformed(evt);
            }
        });

        ViewPatient.setBackground(new java.awt.Color(255, 255, 204));
        ViewPatient.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ViewPatient.setForeground(new java.awt.Color(102, 0, 0));
        ViewPatient.setText("View Patient");
        ViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPatientActionPerformed(evt);
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

        back.setBackground(new java.awt.Color(255, 255, 204));
        back.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(102, 0, 0));
        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        AddDoctor.setBackground(new java.awt.Color(255, 255, 204));
        AddDoctor.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        AddDoctor.setForeground(new java.awt.Color(102, 0, 0));
        AddDoctor.setText("Add Doctor");
        AddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDoctorActionPerformed(evt);
            }
        });

        ViewDoctor.setBackground(new java.awt.Color(255, 255, 204));
        ViewDoctor.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ViewDoctor.setForeground(new java.awt.Color(102, 0, 0));
        ViewDoctor.setText("View Doctor");
        ViewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back)
                        .addGap(95, 95, 95)
                        .addComponent(title2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Image2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Image2, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(AddPatient)
                        .addGap(43, 43, 43)
                        .addComponent(ViewPatient)
                        .addGap(43, 43, 43)
                        .addComponent(AddDoctor)
                        .addGap(43, 43, 43)
                        .addComponent(ViewDoctor)
                        .addGap(46, 46, 46)
                        .addComponent(exit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPatientActionPerformed
        this.dispose();
        new AddPatient().setVisible(true);
    }//GEN-LAST:event_AddPatientActionPerformed

    private void ViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPatientActionPerformed
        this.dispose();
        new ViewPatient().setVisible(true);
    }//GEN-LAST:event_ViewPatientActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        new MenuPanel().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void AddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDoctorActionPerformed
        this.dispose();
        new AddDoctor().setVisible(true);
    }//GEN-LAST:event_AddDoctorActionPerformed

    private void ViewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDoctorActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ViewDoctor().setVisible(true);


    }//GEN-LAST:event_ViewDoctorActionPerformed

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
            java.util.logging.Logger.getLogger(Hospital_Management_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital_Management_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital_Management_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital_Management_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital_Management_System().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDoctor;
    private javax.swing.JButton AddPatient;
    private javax.swing.JLabel Image2;
    private javax.swing.JButton ViewDoctor;
    private javax.swing.JButton ViewPatient;
    private javax.swing.JButton back;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
