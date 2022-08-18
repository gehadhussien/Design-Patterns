package travelsystem;

public class PayMeth {
    
    private String Card_holder_name;
    private int Security_Code;
    private String Mobile_Number;
    private String Expire_Date;
    Reservation R;
    Booking Book;
    
    public static int noOfObjects = 0; 
    { 
        noOfObjects += 1; 
    }
    public PayMeth(String Card_holder_name, int Security_Code, String Mobile_Number, String Expire_Date, Reservation R,Booking Book) {
       this.Card_holder_name = Card_holder_name;
        this.Security_Code = Security_Code;
        this.Mobile_Number = Mobile_Number;
        this.Expire_Date = Expire_Date;
        this.R = R;
        this.Book = Book;
    }
     public PayMeth(String Card_holder_name, int Security_Code, String Mobile_Number, String Expire_Date) {

        this.Card_holder_name = Card_holder_name;
        this.Security_Code = Security_Code;
        this.Mobile_Number = Mobile_Number;
        this.Expire_Date = Expire_Date;
        
    }

    public String getCard_holder_name() {
        return Card_holder_name;
    }

    public void setCard_holder_name(String Card_holder_name) {
        this.Card_holder_name = Card_holder_name;
    }

    public int getSecurity_Code() {
        return Security_Code;
    }

    public void setSecurity_Code(int Security_Code) {
        this.Security_Code = Security_Code;
    }

    public String getMobile_Number() {
        return Mobile_Number;
    }

    public void setMobile_Number(String Mobile_Number) {
        this.Mobile_Number = Mobile_Number;
    }

    public String getExpire_Date() {
        return Expire_Date;
    }

    public void setExpire_Date(String Expire_Date) {
        this.Expire_Date = Expire_Date;
    }

     
    public Boolean VerifyPayment(String Card_holder_name, int Security_Code, String Mobile_Number, String Expire_Date)
    {   if (Security_Code!=0){
            return true;
        }  
        else
            return false;
    }
}
