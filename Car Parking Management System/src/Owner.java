/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Owner {
    private int OwnerId ;
    
    private String UserName,FirstName,LastName,Password,PhoneNumber,NIDNumber,Gender,ParkingSlots;

    public Owner(int OwnerId ,String UserName,String FirstName,String LastName,String Password ,String PhoneNumber,String NIDNumber,String Gender,String ParkingSlots) {
    this.OwnerId = OwnerId;
    this.UserName = UserName;
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.Password = Password;
    this.PhoneNumber = PhoneNumber;
    this.NIDNumber = NIDNumber;
    this.Gender = Gender;
    this.ParkingSlots = ParkingSlots;
    }
    
    
    //alt + insert
    public  int getOwnerId(){
    return OwnerId; 
}
     public String getUserName() {
        return UserName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPassword() {
        return Password;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getNIDNumber() {
        return NIDNumber;
    }

    public String getGender() {
        return Gender;
    }

    public String getParkingSlots() {
        return ParkingSlots;
    }
    
    
    
}