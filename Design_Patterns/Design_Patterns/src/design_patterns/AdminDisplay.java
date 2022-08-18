package design_patterns;

public class AdminDisplay implements ObserverCost {
    
    public String UserName;
    public String PassWord;
    public String Email;
    public String Mob_Number;
    public String National_ID;
    public AdminDisplay(String Email,String PassWord,String UserName, String Mob_Number,String National_ID){
        this.Email= Email;
        this.PassWord= PassWord;
        this.UserName=UserName;
        this.Mob_Number= Mob_Number;
        this.National_ID=National_ID;
    }
    
     @Override
    public void update(float tripcost, float ticketcost, String offer) {
        System.out.println("I am now Changed Admin Display");
    }
}
