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

/**
 *
 * @author HP
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        VocationalSchool("Vocational School"), 
        GradSchool("Grad School"), 
        TempHousing("Temporary Housing"), 
        PermHousing("Permanent Housing"),
        Citizen("Citizen");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            CitizenDirectory vd,
            UserAccountDirectory user_Dir);
   
 

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}