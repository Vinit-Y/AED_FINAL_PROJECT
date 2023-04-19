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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Business.userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class SystemAdminRole extends Role{
   
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,CitizenDirectory vd, UserAccountDirectory user_Dir) {
        try {
            return new SystemAdminWorkAreaJPanel(userProcessContainer, system,vd, user_Dir);
        } catch (IOException ex) {
            Logger.getLogger(SystemAdminRole.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    
}
