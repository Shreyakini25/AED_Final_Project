package smart_city_management_system.Education_Management;

import smart_city_management_system.MenuPanel;

/**
 *
 * @author HP
 */
public class Education_Management_System extends javax.swing.JFrame {

    /**
     * Creates new form Education_Management_System
     */
    public Education_Management_System() {
        initComponents();
        setSize(800, 600); // Set specific size
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        Image2 = new javax.swing.JLabel();
        schools = new javax.swing.JButton();
        HighSchools = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Universities = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        title2.setBackground(new java.awt.Color(255, 255, 255));
        title2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        title2.setForeground(new java.awt.Color(255, 102, 102));
        title2.setText("WELCOME TO EDUCATION  MANAGEMENT SYSTEM");

        Image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart_city_management_system/Education Management.png"))); // NOI18N

        schools.setBackground(new java.awt.Color(255, 204, 204));
        schools.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        schools.setForeground(new java.awt.Color(102, 0, 0));
        schools.setText("View Schools");
        schools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolsActionPerformed(evt);
            }
        });

        HighSchools.setBackground(new java.awt.Color(255, 204, 204));
        HighSchools.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        HighSchools.setForeground(new java.awt.Color(102, 0, 0));
        HighSchools.setText("View High Schools");
        HighSchools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HighSchoolsActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 204, 204));
        exit.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 0, 0));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 204, 204));
        back.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(102, 0, 0));
        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        Universities.setBackground(new java.awt.Color(255, 204, 204));
        Universities.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Universities.setForeground(new java.awt.Color(102, 0, 0));
        Universities.setText("View Universities");
        Universities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UniversitiesActionPerformed(evt);
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
                            .addComponent(schools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HighSchools, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Universities, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
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
                        .addComponent(Image2, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(schools)
                        .addGap(43, 43, 43)
                        .addComponent(HighSchools)
                        .addGap(43, 43, 43)
                        .addComponent(Universities)
                        .addGap(54, 54, 54)
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

    private void schoolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolsActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ViewSchools().setVisible(true);
    }//GEN-LAST:event_schoolsActionPerformed

    private void HighSchoolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HighSchoolsActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ViewHighSchools().setVisible(true);

    }//GEN-LAST:event_HighSchoolsActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MenuPanel().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void UniversitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UniversitiesActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ViewUniversities().setVisible(true);
    }//GEN-LAST:event_UniversitiesActionPerformed

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
            java.util.logging.Logger.getLogger(Education_Management_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Education_Management_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Education_Management_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Education_Management_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Education_Management_System().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HighSchools;
    private javax.swing.JLabel Image2;
    private javax.swing.JButton Universities;
    private javax.swing.JButton back;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton schools;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}