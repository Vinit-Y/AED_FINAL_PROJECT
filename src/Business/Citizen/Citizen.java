/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Citizen;

/**
 *
 * @author Vinit
 */
public class Citizen {
    private String firstName;
    private String lastName;
    private String Citizen_ID;
    private String username;
    private String password;

    public String getCoordX() {
        return coordX;
    }

    public void setCoordX(String coordX) {
        this.coordX = coordX;
    }

    public String getCoordY() {
        return coordY;
    }

    public void setCoordY(String coordY) {
        this.coordY = coordY;
    }

    public String getCurrentConcern() {
        return currentConcern;
    }

    public void setCurrentConcern(String currentConcern) {
        this.currentConcern = currentConcern;
    }

    public String getCriticalityLevel() {
        return criticalityLevel;
    }

    public void setCriticalityLevel(String criticalityLevel) {
        this.criticalityLevel = criticalityLevel;
    }
    private String coordX;
    private String coordY;
    private String currentConcern;
    private String criticalityLevel;
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getCitizen_ID() {
        return Citizen_ID;
    }

    public void setCitizen_ID(String Citizen_ID) {
        this.Citizen_ID = Citizen_ID;
    }
    private String residentAddress;
    private String Community;
    private String gender;
    private String age;
    private String educationalDetails;
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getResidentAddress() {
        return residentAddress;
    }

    public void setResidentAddress(String residentAddress) {
        this.residentAddress = residentAddress;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEducationalDetails() {
        return educationalDetails;
    }

    public void setEducationalDetails(String educationalDetails) {
        this.educationalDetails = educationalDetails;
    }
    
    
    @Override
    public String toString() {
        return firstName;
    }
}
