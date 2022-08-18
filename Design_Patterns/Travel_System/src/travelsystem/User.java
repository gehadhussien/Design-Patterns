package travelsystem;

import java.util.ArrayList;
public class User extends Person  {
    
    
    int Trips_counter=0;
    Survey S;
    private PayMeth PM;
    ArrayList <Reservation> Res;
    ArrayList <Booking> B;
    
    
    String [][] DataBaseUser = {{"samanasr@gmail.com", "123456","Sama Nasr","13135153135","20200000"},
                            {"gehadhussien@gmail.com", "654321","Gehad Hussien","12345678910","20200001"},
                            {"mahmoudkhaled@gmail.com", "000000","Mahmoud Khaled","13136663135","20200002"},
                            {"habibamostafa@gmail.com", "111111","Habiba Mostafa","11212153135","20200003"},
                            {"abdelruhmanayman@gmail.com", "666666","Abdelruhman Ayman","16565653135","20200004"}};
    
    public User(String Email, String PassWord, String UserName, String Mob_Number,String National_ID) {
        super(Email,PassWord,UserName,Mob_Number,National_ID);
      DataBaseUser[0][0]=Email;
      DataBaseUser[0][1]=PassWord;
      DataBaseUser[0][2]=UserName;
      DataBaseUser[0][3]=Mob_Number;
      DataBaseUser[0][4]=National_ID;
  
    }
    
   
    
   public String LogIn(String Email,String PassWord){
        if (DataBaseUser[0][0] == Email &&  DataBaseUser[0][1] == PassWord) {
            return "Log in Success";
        }
    else   {
            return "Log in Failed";
        }
    
    }
    
     public User(String Email,String PassWord, String UserName, String Mob_Number,String National_ID, PayMeth PM,ArrayList <Reservation> Res,ArrayList <Booking> B) {
        super(Email,PassWord,UserName,Mob_Number,National_ID);
       
        this.PM = PM;
        this.Res = Res;
        this.B = B;
    }
     
     //Survey
//    public User(int Trips_Counter,String UserName,String PassWord,String Email, String Mob_Number,String National_ID, Survey S) {
//        super(UserName,PassWord,Email,Mob_Number,National_ID,L);
//        this.Trips_Counter = Trips_Counter;
//        this.S = S;
//    }

    public int getTrips_Counter() {
        this.Trips_counter=PayMeth.noOfObjects;
        
        return Trips_counter;
    }

    
    
    public String Rank(int Trips_counter){
        if(Trips_counter>=10&&Trips_counter<20){
             
            return "You are Ranked as Bronze";
        }
        else if(Trips_counter>=20&&Trips_counter<30){
             
            return "You are Ranked as Silver";
        }
         
        else if(Trips_counter>=30&&Trips_counter<50){
             
            return "You are Ranked as Gold";
        }
        else 
        {
           return "Congrats you are Ranked as Diamond";
        }
    
    }
    public String Get_User_info(){
         
    return "Username : "+ this.getUserName()+"\n  Password :"+this.getPassword()+"\n Email : "+this.getEmail()+"\n Mobile phone : " +this.getMob_Number()+"\n National ID : "+this.getNational_ID();
        }
     
    public void Add_Payment_Method(String Card_holder_name, int Security_Code, String Mobile_Number, String Expire_Date){

        PM= new PayMeth(Card_holder_name, Security_Code, Mobile_Number,Expire_Date);
     
    }
}
