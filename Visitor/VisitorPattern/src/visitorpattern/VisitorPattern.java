package visitorpattern;

public class VisitorPattern {

    public static void main(String[] args) {
        // TODO code application logic here
        Karakter savaşcıgb = new SavaşcıGüçlüBeden(35);
        Karakter savaşcıhk = new SavaşcıHavaKılıcı(25);
        
        KarakterVisitor yenetekvisitor = new YetenekYükleVisitor();
        KarakterVisitor becerivisitor = new BeceriYükleVisitor();
        
        savaşcıgb.yükle(yenetekvisitor);
        savaşcıgb.yükle(becerivisitor);
        System.out.println("");
        savaşcıhk.yükle(yenetekvisitor);
        savaşcıhk.yükle(becerivisitor);
               
    }
    
}
