package observerpattern;

import java.text.DecimalFormat;

public class pegasusCustomer1 implements pegasusObserver{
    DecimalFormat df = new DecimalFormat("#.###");
    @Override
    public void update(double change) {
        if(change < 0.35){
            System.out.println("Artış Miktarı Customer1 : " +df.format(change));
        }
    }
    
}
