/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Citizen;

import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import Business.userinterface.MainJFrame;

/**
 *
 * @author Vinit
 */

public class CitizenDirectory {
    
    UserAccountDirectory useracc;
   private ArrayList<Citizen> Citizen_Dir; 
     private CitizenDirectory Citizen_Di;
 MainJFrame main;

      
 
    public CitizenDirectory(){
      Citizen_Dir = new ArrayList<Citizen>();
    }

    public ArrayList<Citizen> getCitizen_Dir() {
        return Citizen_Dir;
    }

    public void setCitizen_Dir(ArrayList<Citizen> Citizen_Dir) {
        this.Citizen_Dir = Citizen_Dir;
    }
    
     public Citizen addCitizen()
    {
        Citizen v = new Citizen();
        Citizen_Dir.add(v);
        return v;
    }
     public CitizenDirectory getCitizenDirectory() {
        CitizenDirectory vd = main.getDir();
        return vd;
    }

    
}
