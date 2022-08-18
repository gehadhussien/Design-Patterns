
package design_patterns;

import java.util.ArrayList;

public class CostData implements Subject {
    
    float tripcost, ticketcost;
    String offer;
    ArrayList<ObserverCost> observers;

    public CostData( float tripcost, float ticketcost,  String offer){
        this.ticketcost=ticketcost;
        this.tripcost=tripcost;
        this.offer=offer;
        this.observers= new ArrayList<>();
    }


    @Override
    public void AddObserver(ObserverCost ob) {
        this.observers.add(ob);
    }

    @Override
    public void RemoveObserver(ObserverCost ob) {
        this.observers.remove(ob);
    }

    @Override
    public void notifyObserver() {
        for(int i=0; i< observers.size(); i++){
            this.observers.get(i).update(tripcost,ticketcost,offer);

        }

    }
    public void SetCostsData(float tripcost, float ticketcost,  String offer){
        this.ticketcost=ticketcost;
        this.tripcost=tripcost;
        this.offer=offer;
        notifyObserver();
    }
}
