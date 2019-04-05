
public class UserSearchGetValue {
  
    
    public String PhoneNumber;
    int Price;
    public  String Area,Sector,RodeNumber,HouseNumber,FirstName;
    
    
    public UserSearchGetValue(String PhoneNumber,String FirstName,String Area,String Sector,String RodeNumber,String HouseNumber,int Price){
        
        this.PhoneNumber = PhoneNumber;
        this.Price = Price;
        this.Area = Area;
        this.Sector = Sector;
        this.RodeNumber = RodeNumber;
        this.HouseNumber = HouseNumber;
        this.FirstName = FirstName;
        
    }

    public String getFirstName() {
        return FirstName;
    }
    
    //alt + insert

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public int getPrice() {
        return Price;
    }

    public String getArea() {
        return Area;
    }

    public String getSector() {
        return Sector;
    }

    public String getRodeNumber() {
        return RodeNumber;
    }

    public String getHouseNumber() {
        return HouseNumber;
    }
    
    
    
}
