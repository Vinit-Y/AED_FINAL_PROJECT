/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.userinterface.GradSchoolRole;

import Business.EcoSystem;
import Business.Citizen.Citizen;
import Business.Citizen.CitizenDirectory;
import Business.WorkQueue.GradSchoolRequest;
import Business.WorkQueue.VocTrainingRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @@author Lenovo
 */
public class ProcessGradReqJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessGradReqJPanel
     */
    JPanel userProcessContainer;
    GradSchoolRequest request;
    CitizenDirectory vd;
    EcoSystem business;

    ProcessGradReqJPanel(JPanel userProcessContainer, GradSchoolRequest request, CitizenDirectory vd, EcoSystem business) {
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.vd = vd;
        this.business = business;
        

        initComponents();
        populateData();

    }

    void populateData() {
        txtHeader.setText("Review Applicant: " + request.getSender().getUsername());

        ArrayList<Business.Citizen.Citizen> CitizenDir = business.getVd().getCitizen_Dir();
        
        
        System.out.println(CitizenDir);

        for (Citizen v : CitizenDir) {
            System.out.println(v);
            if (v.getUsername().equals(request.getSender().getUsername())) {
                txtCitizenID.setText("Citizen ID: " + v.getCitizen_ID());
                txtAddress.setText("Address: " + v.getResidentAddress());
                txtGender.setText("Gender: " + v.getGender());
                txtMilType.setText("Military Branch: " + v.getCommunity());
                break;

            }
        }

        txtHS.setText(request.getHighSchool());
        txtHS1.setText(request.getHsGrade());
        txtHS2.setText(request.getBachUni());
        txtHS3.setText(request.getBachGrade());
        txtHS4.setText(request.getBachDegree());
        txtHS5.setText(request.getDesUni());
        txtHS6.setText(request.getDesProgram());
        txtHS7.setText(request.getDesIntake());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHeader = new javax.swing.JLabel();
        txtCitizenID = new javax.swing.JLabel();
        txtGender = new javax.swing.JLabel();
        txtMilType = new javax.swing.JLabel();
        txtAddress = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtHS = new javax.swing.JLabel();
        txtHS1 = new javax.swing.JLabel();
        txtHS2 = new javax.swing.JLabel();
        txtHS3 = new javax.swing.JLabel();
        txtHS4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHS5 = new javax.swing.JLabel();
        txtHS6 = new javax.swing.JLabel();
        txtHS7 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        rejectJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHeader.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtHeader.setFocusable(false);
        add(txtHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 357, 32));

        txtCitizenID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtCitizenID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, 23));

        txtGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 23));

        txtMilType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtMilType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 190, 23));

        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 190, 23));

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 100, -1));

        txtHS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtHS, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 272, 26));

        txtHS1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtHS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 272, 26));

        txtHS2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtHS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 272, 26));

        txtHS3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtHS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 272, 26));

        txtHS4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtHS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 272, 26));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("APPLICANT DETAILS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("SEEKING ADMISSION FOR");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("BACHELOR'S DEGREE INFORMATION");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        txtHS5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtHS5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 272, 26));

        txtHS6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtHS6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 272, 26));

        txtHS7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtHS7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 272, 26));

        submitJButton.setBackground(new java.awt.Color(204, 204, 255));
        submitJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        submitJButton.setText("ACCEPT");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 120, -1));

        rejectJButton.setBackground(new java.awt.Color(204, 204, 255));
        rejectJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rejectJButton.setText("REJECT");
        rejectJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectJButtonActionPerformed(evt);
            }
        });
        add(rejectJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("HIGH SCHOOL INFORMATION");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        GradSchoolWorkAreaJPanel dwjp = (GradSchoolWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        request.setStatus("Accepted");
        JOptionPane.showMessageDialog(null, "Candidate: " + request.getSender().getUsername() + " Accepted. Status will be updated accordingly.", "Information", JOptionPane.INFORMATION_MESSAGE);
        submitJButton.setEnabled(false);
        rejectJButton.setEnabled(false);

        String message = "User: " + request.getSender().getUsername() + "'s Application at " + request.getDesUni() + " for " + request.getDesProgram() + " was Accepted by Admin: " + request.getReceiver().getUsername();
        try {
            URL yahoo = new URL("https://api.telegram.org/bot886367737:AAE0-wbD4ww50nkPy7M-6KKrMtN2sg70z_Q/sendMessage?chat_id=@AED_Helper&text=" + message);
            URLConnection yc = yahoo.openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            yc.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Oops Something went wrong.");

        }

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void rejectJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectJButtonActionPerformed
        // TODO add your handling code here:
        request.setStatus("Rejected");
        JOptionPane.showMessageDialog(null, "Candidate: " + request.getSender().getUsername() + " Rejected. Status will be updated accordingly.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        rejectJButton.setEnabled(false);
        submitJButton.setEnabled(false);

        String message = "User: " + request.getSender().getUsername() + "'s Application at " + request.getDesUni() + " for " + request.getDesProgram() + " was rejected by: " + request.getReceiver().getUsername();
        try {
            URL yahoo = new URL("https://api.telegram.org/bot886367737:AAE0-wbD4ww50nkPy7M-6KKrMtN2sg70z_Q/sendMessage?chat_id=@AED_Helper&text=" + message);
            URLConnection yc = yahoo.openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            yc.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Oops Something went wrong.");

        }

    }//GEN-LAST:event_rejectJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton rejectJButton;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JLabel txtCitizenID;
    private javax.swing.JLabel txtGender;
    private javax.swing.JLabel txtHS;
    private javax.swing.JLabel txtHS1;
    private javax.swing.JLabel txtHS2;
    private javax.swing.JLabel txtHS3;
    private javax.swing.JLabel txtHS4;
    private javax.swing.JLabel txtHS5;
    private javax.swing.JLabel txtHS6;
    private javax.swing.JLabel txtHS7;
    private javax.swing.JLabel txtHeader;
    private javax.swing.JLabel txtMilType;
    // End of variables declaration//GEN-END:variables
}
