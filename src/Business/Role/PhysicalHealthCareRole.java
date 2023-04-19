/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Citizen.CitizenDirectory;
import javax.swing.JPanel;
import Business.userinterface.PermHousing.PermHousingWorkAreaJPanel;
import Business.userinterface.PhysicalHealthCare.PhysicalHealthCareWorkAreaJPanel;

/**
 *
 * @author HP
 */
public class PhysicalHealthCareRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, CitizenDirectory vd , UserAccountDirectory user_Dir) {
        return new PhysicalHealthCareWorkAreaJPanel(userProcessContainer, account, organization, enterprise, vd, business);
    }

}
