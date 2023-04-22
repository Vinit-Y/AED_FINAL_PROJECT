/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.userinterface.GradSchoolRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.GradSchoolOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Citizen.CitizenDirectory;
import Business.WorkQueue.GradSchoolRequest;
import Business.WorkQueue.VocTrainingRequest;
import Business.WorkQueue.WorkRequest;
import Business.userinterface.SystemAdminWorkArea.ViewAllCitizen;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Lenovo
 */
public class GradSchoolWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GradSchoolWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private final Organization gradSchoolOrganization;
    private CitizenDirectory vd;
    private Enterprise enterprise;
//    private EcoSystem business;

    public GradSchoolWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization gradSchoolOrganization, Enterprise enterprise, CitizenDirectory vd, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.gradSchoolOrganization = (GradSchoolOrganization) gradSchoolOrganization;
        this.enterprise = enterprise;
        this.vd = vd;
        this.business = business;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
//        System.out.println("Inside PopulateTable");

        int totalRequests = 0;
        int acceptedRequests = 0;
        int rejectedRequests = 0;
        int pendingRequests = 0;
        int totalRequestsUser = 0;
        int acceptedRequestsUser = 0;
        int rejectedRequestsUser = 0;
        int pendingRequestsUser = 0;
        int unassignedReq = 0;

        for (WorkRequest request : gradSchoolOrganization.getWorkQueue().getWorkRequestList()) {
            if (request instanceof GradSchoolRequest) {
                totalRequests = totalRequests + 1;
                Object[] row = new Object[8];
                row[0] = request;
//                System.out.println(request);

                row[1] = request.getSender();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[3] = request.getStatus();
                row[4] = ((GradSchoolRequest) request).getDesUni();
                row[5] = ((GradSchoolRequest) request).getDesProgram();
                row[6] = ((GradSchoolRequest) request).getBachUni();
                row[7] = ((GradSchoolRequest) request).getBachGrade();

                if (request.getReceiver() == null) {
                    unassignedReq = unassignedReq + 1;
                } else if (request.getReceiver().getEmployee().equals(userAccount.getEmployee())) {
                    totalRequestsUser = totalRequestsUser + 1;
                    if (request.getStatus().equals("Accepted")) {
                        acceptedRequestsUser = acceptedRequestsUser + 1;
                    } else if (request.getStatus().equals("Rejected")) {
                        rejectedRequestsUser = rejectedRequestsUser + 1;
                    } else {
                        pendingRequestsUser = pendingRequestsUser + 1;
                    }

                }

                if (request.getStatus().equals("Accepted")) {
                    acceptedRequests = acceptedRequests + 1;
                } else if (request.getStatus().equals("Rejected")) {
                    rejectedRequests = rejectedRequests + 1;
                } else {
                    pendingRequests = pendingRequests + 1;
                }

                model.addRow(row);
            }

            txtTotalRequests1.setText(Integer.toString(totalRequests));
            txtAcc.setText(Integer.toString(acceptedRequests));
            txtRej.setText(Integer.toString(rejectedRequests));
            txtPend.setText(Integer.toString(pendingRequests));

            txtTotalRequests2.setText(Integer.toString(totalRequestsUser));
            txtAcc1.setText(Integer.toString(acceptedRequestsUser));
            txtRej1.setText(Integer.toString(rejectedRequestsUser));
            txtPend1.setText(Integer.toString(pendingRequestsUser));

            txtWelcome.setText("Welcome back, " + userAccount.getEmployee().getName() + ". There are " + (Integer.toString(unassignedReq)) + " unassigned request(s) for review & " + (Integer.toString(pendingRequests)) + " in your queue.");

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAcc = new javax.swing.JLabel();
        txtWelcome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotalRequests1 = new javax.swing.JLabel();
        txtRej = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotalRequests2 = new javax.swing.JLabel();
        txtAcc1 = new javax.swing.JLabel();
        txtRej1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPend = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPend1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        btnViewAllCitizen = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAcc.setBackground(new java.awt.Color(204, 204, 255));
        txtAcc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAcc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAcc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAcc.setFocusable(false);
        txtAcc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 88, 34));

        txtWelcome.setBackground(new java.awt.Color(204, 204, 255));
        txtWelcome.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtWelcome.setFocusable(false);
        add(txtWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 580, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Total Requests");
        jLabel3.setFocusable(false);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        txtTotalRequests1.setBackground(new java.awt.Color(204, 204, 255));
        txtTotalRequests1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTotalRequests1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalRequests1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTotalRequests1.setFocusable(false);
        txtTotalRequests1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtTotalRequests1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 88, 34));

        txtRej.setBackground(new java.awt.Color(204, 204, 255));
        txtRej.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtRej.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRej.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtRej.setFocusable(false);
        txtRej.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtRej, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 88, 34));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Overall - Across Organization");
        jLabel4.setFocusable(false);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Total Accepted");
        jLabel5.setFocusable(false);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Total Rejected");
        jLabel6.setFocusable(false);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        txtTotalRequests2.setBackground(new java.awt.Color(204, 204, 255));
        txtTotalRequests2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTotalRequests2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalRequests2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTotalRequests2.setFocusable(false);
        txtTotalRequests2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtTotalRequests2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 88, 34));

        txtAcc1.setBackground(new java.awt.Color(204, 204, 255));
        txtAcc1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAcc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAcc1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAcc1.setFocusable(false);
        txtAcc1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtAcc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 88, 34));

        txtRej1.setBackground(new java.awt.Color(204, 204, 255));
        txtRej1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtRej1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRej1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtRej1.setFocusable(false);
        txtRej1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtRej1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 88, 34));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Total Rejected");
        jLabel7.setFocusable(false);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Total Accepted");
        jLabel8.setFocusable(false);
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Total Requests");
        jLabel9.setFocusable(false);
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("My Requests");
        jLabel10.setFocusable(false);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txtPend.setBackground(new java.awt.Color(204, 204, 255));
        txtPend.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPend.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPend.setFocusable(false);
        txtPend.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtPend, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 88, 34));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Total Pending");
        jLabel11.setFocusable(false);
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        txtPend1.setBackground(new java.awt.Color(204, 204, 255));
        txtPend1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPend1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPend1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPend1.setFocusable(false);
        txtPend1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtPend1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 88, 34));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Total Pending");
        jLabel12.setFocusable(false);
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 390, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setText("Graduate Education - Admin Area");
        jLabel13.setFocusable(false);
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Bachelor's University", "Sender", "Receiver", "Status", "University", "Program", "Bachelor's University", "GPA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 690, 132));

        refreshJButton.setBackground(new java.awt.Color(102, 102, 255));
        refreshJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        refreshJButton.setText("REFRESH");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, -1));

        assignJButton.setBackground(new java.awt.Color(102, 102, 255));
        assignJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        assignJButton.setText("ASSIGN TO ME");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 162, -1));

        processJButton.setBackground(new java.awt.Color(102, 102, 255));
        processJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        processJButton.setText("PROCESS");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 150, -1));

        btnViewAllCitizen.setBackground(new java.awt.Color(102, 102, 255));
        btnViewAllCitizen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewAllCitizen.setText("VIEW AND TRACK CITIZEN");
        btnViewAllCitizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllCitizenActionPerformed(evt);
            }
        });
        add(btnViewAllCitizen, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {

            JOptionPane.showMessageDialog(null, "Please select a record to proceed", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a record to Process", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        GradSchoolRequest request = (GradSchoolRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getStatus().equalsIgnoreCase("Pending") || request.getStatus().equals(null)) {
            request.setStatus("Processing");
        }
        ProcessGradReqJPanel processGradReqJPanel = new ProcessGradReqJPanel(userProcessContainer, request, vd, business);
        userProcessContainer.add("processGradReqJPanel", processGradReqJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void btnViewAllCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllCitizenActionPerformed
        // TODO add your handling code here:
        ViewAllCitizen rg = new ViewAllCitizen(userProcessContainer, business, vd);
        userProcessContainer.add("ViewAllCitizen", rg);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewAllCitizenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnViewAllCitizen;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JLabel txtAcc;
    private javax.swing.JLabel txtAcc1;
    private javax.swing.JLabel txtPend;
    private javax.swing.JLabel txtPend1;
    private javax.swing.JLabel txtRej;
    private javax.swing.JLabel txtRej1;
    private javax.swing.JLabel txtTotalRequests1;
    private javax.swing.JLabel txtTotalRequests2;
    private javax.swing.JLabel txtWelcome;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
