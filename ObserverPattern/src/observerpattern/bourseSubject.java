package observerpattern;

public interface bourseSubject {
    public void addObserver(pegasusObserver observer);
    public void removeObserver(pegasusObserver observer);
    public void doNotify();
}
