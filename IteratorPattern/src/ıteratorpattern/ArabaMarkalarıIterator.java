package ıteratorpattern;

public class ArabaMarkalarıIterator implements Iterator<ArabaMarkaları> {

    private ArabaMarkaları[] arabalar;
    private int position;

    public ArabaMarkalarıIterator(ArabaMarkaları[] arabalar) {
        this.arabalar = arabalar;
        position = 0;
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public ArabaMarkaları next() {
        return arabalar[position++];
    }

    @Override
    public ArabaMarkaları currentItem() {
        return arabalar[position];
    }

    @Override
    public boolean hasNext() {
        if (position >= arabalar.length) {
            return false;
        }
        return true;
    }
}
