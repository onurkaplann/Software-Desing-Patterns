package observerpattern;

import java.text.DecimalFormat;

public class thread extends Thread {

    DecimalFormat df = new DecimalFormat("#.###");
    pegasusStatus pegasus;

    thread(pegasusStatus pegasus) {
        this.pegasus = pegasus;
    }

    @Override
    public void run() {
        double price = 50;
        double change;
        for (int i = 0; i < 10; i++) {
            change = ((Math.random()*10)-5)%3;
            price = price+change;
            System.out.println("Değişen Fiyat : " +df.format(price));
            pegasus.setPrice(price);
        }
    }
    
}
