
public class Owner_address {
private int OwnerId,AddressId;
 private  String Area,Sector,RodeNumber,HouseNumber;
 
public Owner_address(int OwnerId,int AddressId ,String Area,String Sector,String RodeNumber,String HouseNumber){
this.OwnerId = OwnerId;
this.AddressId = AddressId;
this.Area = Area;
this.Sector = Sector;
this.RodeNumber = RodeNumber;
this.HouseNumber = HouseNumber;
}

    public int getOwnerId() {
        return OwnerId;
    }

    public int getAddressId() {
        return AddressId;
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
