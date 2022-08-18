package design_patterns;

public class Location implements Map {
    
    Adapter d;
    @Override
    public void map(String CurLocation, String Destination) {

        if(CurLocation != " " && Destination != " "){
            System.out.println(" You Arrived !!");
        }
        else {
            d= new Adapter();
            d.map(CurLocation,Destination);
        }
    }
}
