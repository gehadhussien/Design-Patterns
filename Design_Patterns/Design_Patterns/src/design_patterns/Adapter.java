package design_patterns;

public class Adapter implements Map {
    
    GPS G;

    public Adapter( ){
        G= new GPS();
    }

    @Override
    public void map(String CurLocation, String Destination) {

        G.FindLocation();
    }
}
