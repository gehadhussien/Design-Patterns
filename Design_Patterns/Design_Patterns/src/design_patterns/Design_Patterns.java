package design_patterns;

public class Design_Patterns {

    public static void main(String[] args) {
        
        //Singleton
        System.out.println("Singleton");
        Printer admin1= Printer.getInstance();

        System.out.println(admin1);
        admin1.print();
        admin1.leave(admin1);

        Printer admin2=Printer.getInstance();
        System.out.println(admin2);
        admin1.print();
        
        //Adapter
        System.out.println("Adapter");
        Location l= new Location();
        l.map(" ", " ");
        l.map("Home", " Hotel");
        
        //Observer
        System.out.println("Observer");
        CostData c= new CostData(16000, 500, " Buy 2 tickets get 50%");
	ObserverCost user= new UserDisplay("karimkamel@gmail.com", "123456","Karim Kamel","13135153135","20200000");
	ObserverCost admin= new AdminDisplay("ahmedali@gmail.com", "135135","Ahmed Ali","13513513513","20201111");
        
	c.AddObserver(user);
	c.AddObserver(admin);
	c.SetCostsData(18000, 550, "No offers");

        
        String Email;
        String PassWord;
        
    }
    }
    

