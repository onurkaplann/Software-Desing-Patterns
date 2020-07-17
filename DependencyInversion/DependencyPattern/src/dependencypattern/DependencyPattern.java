package dependencypattern;

public class DependencyPattern {

    public static void main(String[] args) {
        İmalat kazak = new İmalat(new Kazak());
        kazak.Yap();
        
        İmalat pantalon = new İmalat(new Pantolon());
        pantalon.Yap();
        
        İmalat mont = new İmalat(new Mont());
        mont.Yap();
    }
    
}
