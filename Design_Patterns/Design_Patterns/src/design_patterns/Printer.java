package design_patterns;

public class Printer {
    
    private static Printer p;
    
    private Printer(){}

        public static Printer getInstance()
        {
            if(p == null){
                p=new Printer();
                System.out.println("Printer used Success");

            }
            else
            {
                System.out.println("Printer is used by other");
                return null;
            }
            return p;
        }
        public void print(){
            System.out.println("In Progress now");
        }
        
        public void leave(Printer pr){
            p=null;
            pr=null;
        }
}
