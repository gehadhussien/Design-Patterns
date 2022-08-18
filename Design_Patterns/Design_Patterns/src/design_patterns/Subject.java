package design_patterns;

public interface Subject {
    
    public void AddObserver(ObserverCost ob);
    public void RemoveObserver(ObserverCost ob);
    public void notifyObserver();
}
