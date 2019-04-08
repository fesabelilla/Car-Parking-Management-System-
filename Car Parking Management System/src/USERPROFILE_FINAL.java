
public class USERPROFILE_FINAL {
    String UserName;  
	String FirstName ;
	String LastName ;
	String Password ;
	String PhoneNumber;
	String LicenceNumber; 
	String NIDNumber ;
	String Gender ;
        int UserID;
        
        
        public USERPROFILE_FINAL(String UserName,String FirstName,String LastName,String Password ,String PhoneNumber,String LicenceNumber,String NIDNumber ,String Gender ,String UserType,byte[] img,int UserID){
        this.UserName = UserName;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Password = Password;
        this.PhoneNumber = PhoneNumber;
        this.LicenceNumber = LicenceNumber;
        this.NIDNumber = NIDNumber;
        this.Gender = Gender;
        this.UserType = UserType;
        this.img = img;
        this.UserID = UserID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }
        
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setLicenceNumber(String LicenceNumber) {
        this.LicenceNumber = LicenceNumber;
    }

    public void setNIDNumber(String NIDNumber) {
        this.NIDNumber = NIDNumber;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
	String UserType;
        byte[] img ;

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

    public byte[] getImg() {
        return img;
    }
        
    
    
    
    
}
