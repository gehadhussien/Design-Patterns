package travelsystem;

public class Reservation {
    
    public String Hotel_name;
    public String Arr_date;
    public String Dep_date;
    User U;
    
    public Reservation(String Hotel_name, String Arr_date, String Dep_date) {
        this.Hotel_name = Hotel_name;
        this.Arr_date = Arr_date;
        this.Dep_date = Dep_date;
    }

    public String getHotel_name() {
        return Hotel_name;
    }

    public void setHotel_name(String Hotel_name) {
        this.Hotel_name = Hotel_name;
    }
    
      
    public boolean CheckAvail(String Hotel_name,String Room_Num){
        if(Room_Num!=null&&Hotel_name!=null){
            return true; 
        }
        else 
            return false;
    }
    
    public String Reserve(String Hotel_name,String Room_Num){
        
        if (CheckAvail(Hotel_name, Room_Num) == true)
        {
            return "Reservation Success"; 
        }
        return "Reservation Failed";
    }
}
