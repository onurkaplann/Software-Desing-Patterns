package ıteratorpattern;

public class IteratorPattern {

    public static void main(String[] args) {
        ArabaMarkaları[] arabalar = new ArabaMarkaları[5];
        arabalar[0] = new ArabaMarkaları("BMW");
        arabalar[1] = new ArabaMarkaları("Mercedes");
        arabalar[2] = new ArabaMarkaları("Toyota");
        arabalar[3] = new ArabaMarkaları("Suzuki");
        arabalar[4] = new ArabaMarkaları("Renault");

        List<ArabaMarkaları> list = new ArabaMarkalarıList(arabalar);

        Iterator<ArabaMarkaları> iterator = list.iterator();

        thread thread = new thread(iterator);
        thread.start();
    }

}
