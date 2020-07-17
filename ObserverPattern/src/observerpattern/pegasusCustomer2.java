package observerpattern;

import java.text.DecimalFormat;

public class pegasusCustomer2 implements pegasusObserver{
    DecimalFormat df = new DecimalFormat("#.###");
    @Override
    public void update(double change) {
        if(change > 0.35){
            System.out.println("Artış Miktarı Customer2 : " +df.format(change));
        }
    }
    
}
