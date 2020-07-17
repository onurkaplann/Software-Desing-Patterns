package dependencypattern;

public class İmalat {
    KıyafetÜret kıyafet;

    İmalat(KıyafetÜret kıyafet) {
        this.kıyafet = kıyafet;
    }
    
    public void Yap(){
        kıyafet.üret();
    }
}
