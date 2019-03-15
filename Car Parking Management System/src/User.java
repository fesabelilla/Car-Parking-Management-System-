
public class User {
   private int UserId;
   private String UserName,FirstName,LastName,Password,PhoneNumber,LicenceNumber,NIDNumber,Gender,UserType; 
    
    public User(int UserId,String UserName,String FirstName,String LastName,String Password ,String PhoneNumber,String LicenceNumber,String NIDNumber,String Gender,String UserType){
        this.UserId = UserId;
        this.UserName = UserName;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Password = Password;
        this.PhoneNumber = PhoneNumber;
        this.LicenceNumber = LicenceNumber;
        this.NIDNumber = NIDNumber;
        this.Gender = Gender;
        this.UserType = UserType;
    }

    public int getUserId() {
        return UserId;
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

    public String getLicenceNumber() {
        return LicenceNumber;
    }

    public String getNIDNumber() {
        return NIDNumber;
    }

    public String getGender() {
        return Gender;
    }

    public String getUserType() {
        return UserType;
    }
    
    
}
