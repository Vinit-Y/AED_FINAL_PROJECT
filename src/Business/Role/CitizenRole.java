/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.CitizenOrganization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Citizen.CitizenDirectory;
import javax.swing.JPanel;
import Business.userinterface.CitizenRole.CitizenWorkAreaJPanel;

/**
 *
 * @author HP
 */
public class CitizenRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, CitizenDirectory vd, UserAccountDirectory user_Dir) {
        return new CitizenWorkAreaJPanel(userProcessContainer, account, (CitizenOrganization) organization, enterprise, vd);
    }
}
