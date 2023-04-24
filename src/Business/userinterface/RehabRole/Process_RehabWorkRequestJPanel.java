/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.userinterface.RehabRole;

import Business.EcoSystem;
import Business.Email.SendMail;
import Business.UserAccount.UserAccount;
import Business.Citizen.Citizen;
import Business.Citizen.CitizenDirectory;
import Business.WorkQueue.PhysicalHealthCareRequest;
import Business.WorkQueue.RehabWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Vinit
 */
public class Process_RehabWorkRequestJPanel extends javax.swing.JPanel {
   EcoSystem system;
     JPanel userProcessContainer;
   RehabWorkRequest request;
     UserAccount userAccount;
    /**
     * Creates new form Process_RehabWorkRequestJPanel
     */
   

    Process_RehabWorkRequestJPanel(JPanel userProcessContainer, RehabWorkRequest request, EcoSystem system) {
        initComponents();
        this.request = request;
        this.userAccount = userAccount;
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        
           
           lblMainConcern.setText(String.valueOf(request));
           lbl_patientName.setText(String.valueOf(request.getCitizenName()));
           lbl_doctorAnalysis.setText(((RehabWorkRequest) request).getRehabConcern());
           lbl_doc_Comments.setText(request.getComments());
           
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lbl_patientName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMainConcern = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_PatientAge = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_doctorAnalysis = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_doc_Comments = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        txtArea_analysis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_Comments = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        txt_EmailID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Patient Name: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lbl_patientName.setText("jLabel5");
        add(lbl_patientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 100, 98, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Main Concern:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 141, -1, -1));

        lblMainConcern.setText("jLabel2");
        add(lblMainConcern, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 132, 140, 33));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Patient Age:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 183, -1, -1));

        lbl_PatientAge.setText("jLabel6");
        add(lbl_PatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 183, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Doctor Analysis");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 231, -1, -1));

        lbl_doctorAnalysis.setText("jLabel6");
        add(lbl_doctorAnalysis, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 231, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Doctor Comments");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 278, -1, -1));

        lbl_doc_Comments.setText("jLabel6");
        add(lbl_doc_Comments, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 278, -1, -1));

        lbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl.setText("Rehab Analysis");
        add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 97, -1));
        add(txtArea_analysis, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 218, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Rehab  Notes and Comments");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, 29));

        txtArea_Comments.setColumns(20);
        txtArea_Comments.setRows(5);
        jScrollPane1.setViewportView(txtArea_Comments);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 218, 126));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 218, 40));

        txt_EmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailIDActionPerformed(evt);
            }
        });
        add(txt_EmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 280, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Email ID");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        backJButton.setBackground(new java.awt.Color(204, 204, 255));
        backJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backJButton.setText("<<BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setText("Process a Rehabilitation Request");
        jLabel9.setFocusable(false);
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private boolean usernamePatternCorrect() {
       Pattern p = Pattern.compile("^[a-zA-Z0-9]+[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
       Matcher m = p.matcher(txt_EmailID.getText());
       boolean b = m.matches();
       return b;
   }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          //  phc_request.setPhc_workRequest(resultJTextField.getText());
            //request.setStatus("Completed");
            request.setStatus("Completed");
            request.setReturn_Result(txtArea_analysis.getText());
              if(txtArea_analysis.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Rehab Analysis can't be empty");
             return;
         }
            request.setReturn_Comment(txtArea_Comments.getText());
              if(txtArea_Comments.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Rehab Comments can't be empty");
             return;
         }
if(!usernamePatternCorrect()){
        JOptionPane.showConfirmDialog(null,"Email ID should be the form of xxx@xxx.xxx");
        return;
        }
             String to = String.valueOf(txt_EmailID.getText());
             String subject = "Report for the Rehab : "+ ((RehabWorkRequest) request).getRehabConcern();
             String user = "vinityadav566@gmail.com";
             String pass = "ntyrgkptgzbpgios";  
             String message = " Hello "+ String.valueOf(request.getCitizenName())
                         + "Please Look into the report provide by your Rehab Employee : " + String.valueOf(((RehabWorkRequest) request).getRehabConcern())
                         + " Rehab Therapist Name: "+  request.getReceiver() + "  \n"+ 
                     "According to the reports generated by your Therapist, You are facing :  " + txtArea_analysis.getText()+
                          "\n with comments  : " + txtArea_Comments.getText()+"\n\n"+" Please contact your Therapist for more details. "
                     +"\n\n "
                     + "Regards "+
                     request.getReceiver();

                SendMail.send(to,subject, message, user, pass);
                txtArea_analysis.setText("");
         txtArea_Comments.setText("");
                 txt_EmailID.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_EmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailIDActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RehabWorkAreaJPanel dwjp = (RehabWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblMainConcern;
    private javax.swing.JLabel lbl_PatientAge;
    private javax.swing.JLabel lbl_doc_Comments;
    private javax.swing.JLabel lbl_doctorAnalysis;
    private javax.swing.JLabel lbl_patientName;
    private javax.swing.JTextArea txtArea_Comments;
    private javax.swing.JTextField txtArea_analysis;
    private javax.swing.JTextField txt_EmailID;
    // End of variables declaration//GEN-END:variables
}
