
public class Owner {
    private int OwnerId ;
    
    private String UserName,FirstName,LastName,Password,PhoneNumber,NIDNumber,Gender,ParkingSlots;
    byte[] picture;
    public Owner(int OwnerId ,String UserName,String FirstName,String LastName,String Password ,String PhoneNumber,String NIDNumber,String Gender,String ParkingSlots,byte[] Images) {
    this.OwnerId = OwnerId;
    this.UserName = UserName;
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.Password = Password;
    this.PhoneNumber = PhoneNumber;
    this.NIDNumber = NIDNumber;
    this.Gender = Gender;
    this.ParkingSlots = ParkingSlots;
    this.picture = Images;
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

    public byte[] getImages() {
        return picture;
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
