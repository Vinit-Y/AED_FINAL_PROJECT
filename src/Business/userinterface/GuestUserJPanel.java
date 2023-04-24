/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.userinterface;
import Business.EcoSystem;
import Business.UserAccount.UserAccountDirectory;
import Business.Citizen.CitizenDirectory;
import Business.userinterface.SystemAdminWorkArea.RegisterCitizen;
import Business.userinterface.SystemAdminWorkArea.ViewAllCitizen;
import java.awt.CardLayout;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Lenovo
 */
public class GuestUserJPanel extends javax.swing.JPanel {
EcoSystem system;
JPanel container;
UserAccountDirectory user_Dir;
CitizenDirectory Citizen_Di;
    /**
     * Creates new form GuestUserJPanel
     */
    public GuestUserJPanel() {
        initComponents();
    }

   
    GuestUserJPanel(JPanel container, EcoSystem system, CitizenDirectory Citizen_Di, UserAccountDirectory user_Dir) {
         initComponents();
       this.system =  system;
       this.Citizen_Di =Citizen_Di;
       this.user_Dir= user_Dir;
       this.container=container;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRegisterCitizen = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("GUEST USER DASHBOARD");

        btnRegisterCitizen.setBackground(new java.awt.Color(204, 204, 255));
        btnRegisterCitizen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegisterCitizen.setText("REGISTER CITIZEN");
        btnRegisterCitizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCitizenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnRegisterCitizen, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addComponent(btnRegisterCitizen)
                .addContainerGap(211, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCitizenActionPerformed
        // TODO add your handling code here:
        RegisterCitizen rg = new RegisterCitizen(container,system, Citizen_Di, user_Dir);
        container.add("RegisterCitizen", rg);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnRegisterCitizenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegisterCitizen;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
