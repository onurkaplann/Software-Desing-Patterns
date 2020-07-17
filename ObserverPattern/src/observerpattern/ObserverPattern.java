package observerpattern;

public class ObserverPattern {

    public static void main(String[] args) {
        pegasusStatus pegasus = new pegasusStatus(50);
        pegasusCustomer1 pc1 = new pegasusCustomer1();
        pegasusCustomer1 pc2 = new pegasusCustomer1();
        pegasusCustomer2 pc3 = new pegasusCustomer2();
        
        pegasus.addObserver(pc1);
        pegasus.addObserver(pc2);
        pegasus.addObserver(pc3);
        
        thread thread = new thread(pegasus);
        thread.start();

    }
    
}
