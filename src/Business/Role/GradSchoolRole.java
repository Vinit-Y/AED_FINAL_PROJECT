/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
//import Business.Organization.DoctorOrganization;
import Business.Organization.GradSchoolOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Citizen.CitizenDirectory;
import javax.swing.JPanel;
import  Business.userinterface.GradSchoolRole.GradSchoolWorkAreaJPanel;

/**
 *
 * @author HP
 */
public class GradSchoolRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,CitizenDirectory vd,UserAccountDirectory user_Dir) {
        return new GradSchoolWorkAreaJPanel(userProcessContainer, account, (GradSchoolOrganization)organization, enterprise, vd, business);
    }


    
}
