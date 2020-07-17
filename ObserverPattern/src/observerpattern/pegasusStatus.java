package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class pegasusStatus implements bourseSubject{
    private List<pegasusObserver> pegasusList;
    private double price;
    private double change;
    private double hold;

    public pegasusStatus(double price) {
        pegasusList = new ArrayList<>();
        this.price = price;
    }    
    
    public void setPrice(double price) {
        hold = this.price;
        this.price = price;
        change = price-hold;
        doNotify();
    }
    
    @Override
    public void addObserver(pegasusObserver observer) {
       pegasusList.add(observer);
    }

    @Override
    public void removeObserver(pegasusObserver observer) {
        pegasusList.remove(observer);
    }

    @Override
    public void doNotify() {
        for (pegasusObserver observer : pegasusList) {
            observer.update(change);
        }
    }
        
}
