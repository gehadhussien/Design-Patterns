package travelsystem;

public class Booking {
    
    public String Transportation;
    public String Trans_company;
    public String Book_date;
    User U;
    
    public Booking(String Transportation,String Trans_company,String Book_date){
        this.Transportation=Transportation;
        this.Trans_company=Trans_company;
        this.Book_date= Book_date;
       
    }

    public String getTransportation() {
        return Transportation;
    }

    public void setTransportation(String Transportation) {
        this.Transportation = Transportation;
    }

    public String getTrans_company() {
        return Trans_company;
    }

    public void setTrans_company(String Trans_company) {
        this.Trans_company = Trans_company;
    }
    
    public String getRes_date() {
        return Transportation;
    }

    public void setRes_date(String Transportation) {
        this.Transportation = Transportation;
    }
  
   
    public Boolean CheckAvail(String Trans_Type,String Trans_company,String Res_date)
    { if(Trans_Type != null)
    {
        return true;
    }
    
     else 
    {
        return false;
    }
    }
    
     public String Book(String Trans_Type,String Trans_company, String Res_date){
        
        if (CheckAvail(Trans_Type, Trans_company,Res_date) == true)
        {
            return "Booking Success"; 
        }
        return "Booking Failed";
       
    }
}
