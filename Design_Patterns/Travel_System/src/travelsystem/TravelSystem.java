
package travelsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class TravelSystem {

    public static void main(String[] args) {
        
     
//        //User u = new User("karimkamel@gmail.com", "123456","Karim Kamel","13135153135","20200000");
////        
//        Scanner sc = new Scanner(System.in);
//        System.out.println(u.DataBaseUser[0][0]);
//        System.out.println(u.DataBaseUser[0][1]);
//        System.out.println("Enter Email");
//       
//        Email = sc.nextLine();
//        System.out.println(Email);
//        System.out.println("Enter Password");
//        PassWord = sc.nextLine();
//        System.out.println(u.LogIn(Email, PassWord));
        Survey S = new Survey();
        Reservation Res1;
        Booking B1;
        
        
        ArrayList <Reservation> Res = new ArrayList<>();
        Res1 = new Reservation (" Hilton ","20/12/2020","25/12/2020");
        Res.add(Res1);
        
        ArrayList <Booking>  B = new ArrayList<>();
        B1 = new Booking("Airplane","Egypt Air","12/10");
        B.add(B1);
       
        PayMeth PM= new PayMeth("Ahmed",4567,"0122518432","08/22");
      
        //Composition
//        if (!=null)
//        {
          //  if (S!=null)
            //Aggregation
            if (PM == null)
            {
               User u    = new User("Ahmed123","1234","ahmed@outlook.com","0122518432","30004560548295");
               Admin   A = new Admin(5000,"B12","Marwan 123","1234","Marwan@outlook.com","0122518432","30004560548295");

            }
            else
            {
                User u    = new User("Ahmed123","1234","ahmed@outlook.com","0122518432","30004560548295",PM,Res,B);
            }
        }
//        else
//        {
//            System.out.print("You Have To Login First !!");
//            System.out.println("3ady"+Res+B.size());
//        }
        
        //System.out.print(u.Get_User_info());
        //System.out.print(A.Get_Admin_Info());
       
        
    }
    
//}
