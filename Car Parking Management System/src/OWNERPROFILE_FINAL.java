
public class OWNERPROFILE_FINAL {
     String UserName;  
	String FirstName ;
	String LastName ;
	String Password ;
	String PhoneNumber; 
	String NIDNumber ;
	String Gender ;
	int ParkingSlots;
        byte[] img ;
        
        String Area ;
        String Sector; 
        String RodeNumber; 
        String HouseNumber;
        
        int sloatReserved;
        int Price;

 
        
        public OWNERPROFILE_FINAL(String UserName,String FirstName,String LastName,String Password ,String PhoneNumber,String NIDNumber ,String Gender ,int ParkingSlots,byte[]img,String Area,String Sector, String RodeNumber , String HouseNumber,int sloatReserved,int Price){

        this.UserName = UserName;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Password = Password;
        this.PhoneNumber = PhoneNumber;
        this.NIDNumber = NIDNumber;
        this.Gender = Gender;
        this.ParkingSlots = ParkingSlots;
        this.img = img;
        this.Area = Area;
        this.Sector = Sector;
        this.RodeNumber = RodeNumber;
        this.HouseNumber = HouseNumber;
        this.sloatReserved = sloatReserved;
        this.Price = Price;
        //System.out.println(this.sloatReserved+" OOOOO");
        }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getNIDNumber() {
        return NIDNumber;
    }

    public void setNIDNumber(String NIDNumber) {
        this.NIDNumber = NIDNumber;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getParkingSlots() {
        return ParkingSlots;
    }

    public void setParkingSlots(int ParkingSlots) {
        this.ParkingSlots = ParkingSlots;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getSector() {
        return Sector;
    }

    public void setSector(String Sector) {
        this.Sector = Sector;
    }

    public String getRodeNumber() {
        return RodeNumber;
    }

    public void setRodeNumber(String RodeNumber) {
        this.RodeNumber = RodeNumber;
    }

    public String getHouseNumber() {
        return HouseNumber;
    }

    public void setHouseNumber(String HouseNumber) {
        this.HouseNumber = HouseNumber;
    }
       public int getSloatReserved() {
        return sloatReserved;
    }

    public void setSloatReserved(int sloatReserved) {
        this.sloatReserved = sloatReserved;
    }
        
    
}
