package ıteratorpattern;

public class ArabaMarkalarıList implements List<ArabaMarkaları> {

    private ArabaMarkaları[] arabalar;

    public ArabaMarkalarıList(ArabaMarkaları[] arabalar) {
        this.arabalar = arabalar;
    }

    @Override
    public Iterator<ArabaMarkaları> iterator() {
        return new ArabaMarkalarıIterator(arabalar);
    }
}
