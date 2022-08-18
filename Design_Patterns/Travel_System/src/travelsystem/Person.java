package travelsystem;

public class Person {
    
    private String UserName;
    private String PassWord;
    private String Email;
    private String Mob_Number;
    private String National_ID;
    
    public Person(String Email,String PassWord,String UserName, String Mob_Number,String National_ID){
        this.Email= Email;
        this.PassWord= PassWord;
        this.UserName=UserName;
        this.Mob_Number= Mob_Number;
        this.National_ID=National_ID;
}
    public void setUserName(String UserName){
        this.UserName=UserName;
    }
    public String getUserName(){
       
        return UserName;
    }
    
//    public boolean LogIn(String Email,String PassWord){
//        if (Email==this.Email&&PassWord==this.PassWord) {
//            System.out.println("Log in Success");
//            return true;
//        }
//    else   {
//                System.out.println("Log in Failed");
//        return false;
//        }
//    
//    }
    
     public String getPassword(){
       
        return PassWord;
    }
    
    public void setPassword(String PassWord){
        this.PassWord=PassWord;
    }
    
     public String getEmail(){
       
        return UserName;
    }
    
    public void setEmail(String Email){
        this.Email=Email;
    }
    
     public String getMob_Number(){
       
        return Mob_Number;
    }
    
    public void setMob_Number(String Mob_Number){
        this.Mob_Number=Mob_Number;
    }
    
     public String getNational_ID(){
       
        return National_ID;
    }
    
    public void setNational_ID(String National_ID){
        this.National_ID=National_ID;
    }
}
