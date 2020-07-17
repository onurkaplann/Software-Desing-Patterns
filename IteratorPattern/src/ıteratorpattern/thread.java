package ıteratorpattern;

public class thread extends Thread {

    Iterator<ArabaMarkaları> iterator;

    thread(Iterator<ArabaMarkaları> iterator) {
        this.iterator = iterator;
    }

    @Override
    public void run() {
        while (iterator.hasNext()) {
            ArabaMarkaları currentTopic = iterator.next();
            System.out.println(currentTopic.getName());
        }

    }

}
