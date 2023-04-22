/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
package Business.userinterface.TempHousingRole;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Listings.HouseListingDirectory;
import Business.Listings.TempHouseListing;
import Business.Listings.TempHouseListingDirectory;
import Business.Organization.Organization;
import Business.Organization.PermHousingOrganization;
import Business.Organization.TempHousingOrganization;
import Business.UserAccount.UserAccount;
import Business.Citizen.CitizenDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class AddTempListingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddTempListingJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private final TempHousingOrganization tempHousingOrganization;
    private CitizenDirectory vd;
    private Enterprise enterprise;
    //private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public AddTempListingJPanel(JPanel userProcessContainer, UserAccount account, Organization tempHousingOrganization, Enterprise enterprise, CitizenDirectory vd,EcoSystem business) 
 {
        initComponents();
        //hsd = new HouseListingDirectory();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.tempHousingOrganization = (TempHousingOrganization) tempHousingOrganization;
        this.enterprise = enterprise;
        this.vd = vd;
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
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        BtnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD TEMP LISTING ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 28, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Housing Society Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 88, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 84, 315, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Number Of People :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));
        add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 156, 315, -1));

        BtnAdd.setBackground(new java.awt.Color(204, 204, 255));
        BtnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnAdd.setText("ADD");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });
        add(BtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 130, -1));

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // TODO add your handling code here:
        if(txtName.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Please add a society name");
             return;
         }
        if(txtNumber.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Please enter number of people");
             return;
         }
        try{
                      if(!txtNumber.getText().equals(""))
         Integer.parseInt(txtNumber.getText());
         }
         catch(NumberFormatException ex){
          JOptionPane.showMessageDialog(null,"Number of people cannot be string");
           return;
         }
        TempHouseListing th = business.getThsd().addTempHouseListing();
        th.setHousingSociety(txtName.getText());
        th.setNumberOfPeople(Integer.valueOf(txtNumber.getText()));
        txtName.setText("");
        txtNumber.setText("");
        JOptionPane.showMessageDialog(null, "Listing has been added. Citizen can view it.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        
        
        
        
        
        
    }//GEN-LAST:event_BtnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TempHousingWorkAreaJPanel dwjp = (TempHousingWorkAreaJPanel) component;
        dwjp.populateTempTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}
