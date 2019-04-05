
public class Owner_Address_For_Owner_Profile {
        String Area ;
        String Sector; 
        String RodeNumber; 
        String HouseNumber;

    public Owner_Address_For_Owner_Profile() {
    
    }
    
    public Owner_Address_For_Owner_Profile(String Area,String Sector,String RodeNumber,String HouseNumber) {
     this.Area = Area;
        this.Sector = Sector;
        this.RodeNumber = RodeNumber;
        this.HouseNumber = HouseNumber; 
        
        System.out.println(this.Area +" "+ this.Sector+" " + this.RodeNumber +" "+this.HouseNumber+"  K" );

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
