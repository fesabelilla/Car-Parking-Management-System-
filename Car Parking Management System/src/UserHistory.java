public class UserHistory {
 String FirstName ;
 String StartingTime; 
 String EndingTime;
 int Duration;
 Double TotalBill;
 
    public UserHistory(String FirstName,String StartingTime ,String EndingTime,int Duration,Double TotalBill){
        this.FirstName = FirstName;
        this.StartingTime = StartingTime;
        this.EndingTime = EndingTime;
        this.Duration = Duration;
        this.TotalBill = TotalBill;
        
    }   

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
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

    public Double getTotalBill() {
        return TotalBill;
    }

    public void setTotalBill(Double TotalBill) {
        this.TotalBill = TotalBill;
    }
    
}
