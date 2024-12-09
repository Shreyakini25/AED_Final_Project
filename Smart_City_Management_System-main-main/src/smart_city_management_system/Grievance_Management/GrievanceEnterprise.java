/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smart_city_management_system.Grievance_Management;
import javax.swing.JOptionPane;
import smart_city_management_system.MenuPanel;
/**
 *
 * @author sakshitapkir
 */
public class GrievanceEnterprise extends javax.swing.JFrame {

    /**
     * Creates new form GrievanceEnterprise
     */
    public GrievanceEnterprise() {
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

        title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnStreetLight = new javax.swing.JButton();
        btnGarbageCollection = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("GRIEVANCE ENTERPRISE");

        btnStreetLight.setBackground(new java.awt.Color(255, 204, 204));
        btnStreetLight.setText("Street Light ");
        btnStreetLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStreetLightActionPerformed(evt);
            }
        });

        btnGarbageCollection.setBackground(new java.awt.Color(255, 204, 204));
        btnGarbageCollection.setText("Garbage Collection");
        btnGarbageCollection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGarbageCollectionActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 204, 204));
        exitButton.setText("exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 204, 204));
        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(titleLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitButton)
                            .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnGarbageCollection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnStreetLight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addComponent(btnStreetLight)
                .addGap(26, 26, 26)
                .addComponent(btnGarbageCollection)
                .addGap(32, 32, 32)
                .addComponent(exitButton)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStreetLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStreetLightActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JOptionPane.showMessageDialog(this, "Redirecting to Street Light Complaints...");
        new StreetLightUser().setVisible(true);
        // TODO: Add functionality to manage street light complaints
    }//GEN-LAST:event_btnStreetLightActionPerformed

    private void btnGarbageCollectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGarbageCollectionActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Redirecting to Garbage Collection Complaints...");
        this.dispose();
        new GarbageCollectionUser().setVisible(true);
        
    }//GEN-LAST:event_btnGarbageCollectionActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MenuPanel().setVisible(true);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new StreetMainLogin().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(GrievanceEnterprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrievanceEnterprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrievanceEnterprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrievanceEnterprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GrievanceEnterprise().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnGarbageCollection;
    private javax.swing.JButton btnStreetLight;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
