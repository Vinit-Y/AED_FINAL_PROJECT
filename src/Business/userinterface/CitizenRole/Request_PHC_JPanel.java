/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.userinterface.CitizenRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Email.SendMail;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PhysicalHealthCareOrganization;
import Business.UserAccount.UserAccount;
import Business.Citizen.CitizenDirectory;
import Business.WorkQueue.PhysicalHealthCareRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class Request_PHC_JPanel extends javax.swing.JPanel {

     private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private CitizenDirectory vd;
    private EcoSystem system;
//    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    private DB4OUtil dB4OUtil;
    /**
     * Creates new form Request_PHC_JPanel
     */
    public Request_PHC_JPanel(JPanel userProcessContainer, UserAccount userAccount, CitizenDirectory vd, EcoSystem system) {
        initComponents();
        initComponents();
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.vd = vd;
         this.system = system;
           txt_Prosthesis.setEnabled(false);  
             txt_heartDisease.setEnabled(false);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valueLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        txt_mainConcern = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        c_before_PHC = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c_physicalInjury = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c_lSymptoms = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDetails = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txt_MedicalHistory = new javax.swing.JTextField();
        requestTestJButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        c_prosthesis = new javax.swing.JCheckBox();
        c_BP = new javax.swing.JCheckBox();
        c_heartDisease = new javax.swing.JCheckBox();
        c_diabetic = new javax.swing.JCheckBox();
        txt_Prosthesis = new javax.swing.JTextField();
        txt_heartDisease = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(967, 6, 130, -1));

        backJButton.setBackground(new java.awt.Color(102, 102, 255));
        backJButton.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        backJButton.setText("<<BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));
        add(txt_mainConcern, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 120, 50));

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel5.setText("Were you ever diagonized for Mental Healthcare before?");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 108, -1, -1));

        c_before_PHC.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        c_before_PHC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        add(c_before_PHC, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 120, -1));

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel7.setText("State your concern:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 130, -1));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setText("Did you have any physical injury previously?");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 307, -1));

        c_physicalInjury.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        c_physicalInjury.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        c_physicalInjury.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_physicalInjuryActionPerformed(evt);
            }
        });
        add(c_physicalInjury, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 120, -1));

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel6.setText("Please Describe your Concern: ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 216, 27));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel3.setText("Do you think you have any of listed Symptoms:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        c_lSymptoms.setEditable(true);
        c_lSymptoms.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        c_lSymptoms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Fever", "BodyAche", "Flu", "Rash", "Body Ache", "Chest Pain", "Cough", "Diarrhea", "Fatigue", "Faintness", "Headache", "Nausea" }));
        add(c_lSymptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 120, -1));

        txtDetails.setColumns(20);
        txtDetails.setRows(5);
        jScrollPane2.setViewportView(txtDetails);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 231, 130));

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel4.setText(" Medical History or condition affected previously");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));
        add(txt_MedicalHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 120, -1));

        requestTestJButton1.setBackground(new java.awt.Color(102, 102, 255));
        requestTestJButton1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        requestTestJButton1.setText("REQUEST MEDICAL ASSISTANCE");
        requestTestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButton1ActionPerformed(evt);
            }
        });
        add(requestTestJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 290, 30));

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel8.setText("Please Check the below which are relevant and enter the Details:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 88, 492, 41));

        c_prosthesis.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        c_prosthesis.setText("Prosthesis Requirement");
        c_prosthesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_prosthesisActionPerformed(evt);
            }
        });
        add(c_prosthesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));

        c_BP.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        c_BP.setText("Blood Pressure");
        c_BP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_BPActionPerformed(evt);
            }
        });
        add(c_BP, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));

        c_heartDisease.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        c_heartDisease.setText("Radiation Exposure");
        c_heartDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_heartDiseaseActionPerformed(evt);
            }
        });
        add(c_heartDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        c_diabetic.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        c_diabetic.setText("Diabetic");
        add(c_diabetic, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 77, -1));
        add(txt_Prosthesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 189, -1));
        add(txt_heartDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 189, -1));

        jLabel9.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel9.setText("REQUEST FOR MEDICAL ASSISTANCE");
        jLabel9.setFocusable(false);
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CitizenWorkAreaJPanel dwjp = (CitizenWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestTestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButton1ActionPerformed

        String message = " Hello Doctor,\n"
        + "Please consider the following patient with details has reqyested for PHC: \n "
        + userAccount.getUsername()+ " with description:  \n"
        + " Main concern: "+  txt_mainConcern.getText() + "  \n"+
        " Detailed concern: " + String.valueOf(txtDetails.getText()) +"  \n"
                +" Symptoms : "+ String.valueOf(c_lSymptoms.getSelectedItem()) +"  \n"
        + " Blood Pressure status : " +String.valueOf(c_BP.isSelected())  +"  \n" +
                 " Diabetic status : " +String.valueOf(c_diabetic.isSelected())  +"  \n"+
                 " prosthesis requirement: " + txt_Prosthesis.getText()  +"  \n" +
         "Heart Problem : "+ txt_heartDisease.getText()
                +"  \n" +
                "  \n" +
                "  \n" +
                " Regards"
                ;
        String concern=txt_mainConcern.getText();
        PhysicalHealthCareRequest request = new PhysicalHealthCareRequest();
        request.setMessage(concern);
        request.setSender(userAccount);
        request.setStatus("Sent");
        ///////////////////////////////////////////////
        request.setPhysical_injury(String.valueOf(c_physicalInjury.getSelectedItem()));
        request.setMain_Concern(txt_mainConcern.getText());
        request.setDetails_concern(String.valueOf(txtDetails.getText()));
        request.setSymptons(String.valueOf(c_lSymptoms.getSelectedItem()));
        request.setMedicalHistory_phyical(txt_MedicalHistory.getText());
       // request.setPhysical_injury();
       
       if(c_heartDisease.isSelected()){
        request.setProsthesis_req(txt_Prosthesis.getText());
       }
        //request.setNeural_DisOrders();
        request.setDiabetic(String.valueOf(c_diabetic.isSelected()));
        if(c_prosthesis.isSelected()){
        request.setHeartDisease(txt_heartDisease.getText());
        }
        request.setBloodPressure(String.valueOf(c_BP.isSelected()));

        Organization org = null;

        for (Network network : system.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                //                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);

                //Step 3:check against each organization for each enterprise
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof PhysicalHealthCareOrganization) {
                        org = organization;
                        break;
                    }

                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            System.out.println("Added Reqyesr to Org ");
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            System.out.println("Added Reqyesr to UserAccount ");

            String to ="vinityadav566@gmail.com";
            String subject = "Request from Citizen for PHC : with following details : " + String.valueOf(c_lSymptoms.getSelectedItem()) +"  and concern : "+  txt_mainConcern.getText();
            String user = "vinityadav566@gmail.com";
            String pass = "ntyrgkptgzbpgios";

            SendMail.send(to,subject, message, user, pass);
            //            dB4OUtil.storeSystem(system);
            //            System.out.println("Stored Inside System");
        }
    }//GEN-LAST:event_requestTestJButton1ActionPerformed

    private void c_BPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_BPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_BPActionPerformed

    private void c_prosthesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_prosthesisActionPerformed
        // TODO add your handling code here:
        if(c_prosthesis.isSelected()){
           txt_Prosthesis.setEnabled(true);  
        }
        else{
              txt_Prosthesis.setEnabled(false);  
        }
    }//GEN-LAST:event_c_prosthesisActionPerformed

    private void c_heartDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_heartDiseaseActionPerformed
        // TODO add your handling code here:
         if(c_heartDisease.isSelected()){
        txt_heartDisease.setEnabled(true);
       }
         else{
         txt_heartDisease.setEnabled(false);
         }
    }//GEN-LAST:event_c_heartDiseaseActionPerformed

    private void c_physicalInjuryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_physicalInjuryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_physicalInjuryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JCheckBox c_BP;
    private javax.swing.JComboBox<String> c_before_PHC;
    private javax.swing.JCheckBox c_diabetic;
    private javax.swing.JCheckBox c_heartDisease;
    private javax.swing.JComboBox<String> c_lSymptoms;
    private javax.swing.JComboBox<String> c_physicalInjury;
    private javax.swing.JCheckBox c_prosthesis;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton requestTestJButton1;
    private javax.swing.JTextArea txtDetails;
    private javax.swing.JTextField txt_MedicalHistory;
    private javax.swing.JTextField txt_Prosthesis;
    private javax.swing.JTextField txt_heartDisease;
    private javax.swing.JTextField txt_mainConcern;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
