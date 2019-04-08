
public class SlotBooked {
 int  SloatId;
 int UserID;
 int OwnerId;
 String StartingTime;
 String EndingTime;
 int Duration;
 double TotalBill;
 
 public SlotBooked(int  SloatId,int UserID,int OwnerId,String StartingTime,String EndingTime,int Duration,double TotalBill){
     this.SloatId = SloatId;
     this.UserID = UserID;
     this.OwnerId = OwnerId;
     this.StartingTime = StartingTime;
     this.EndingTime = EndingTime;
     this.Duration = Duration;
     this.TotalBill = TotalBill;
 }

    public int getSloatId() {
        return SloatId;
    }

    public void setSloatId(int SloatId) {
        this.SloatId = SloatId;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public int getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(int OwnerId) {
        this.OwnerId = OwnerId;
    }

    public String getStartingTime() {
        return StartingTime;
    }

    public void setStartingTime(String StartingTime) {
        this.StartingTime = StartingTime;
    }

    public String getEndingTime() {
        return EndingTime;
    }

    public void setEndingTime(String EndingTime) {
        this.EndingTime = EndingTime;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int Duration) {
        this.Duration = Duration;
    }

    public double getTotalBill() {
        return TotalBill;
    }

    public void setTotalBill(double TotalBill) {
        this.TotalBill = TotalBill;
    }
    
}
