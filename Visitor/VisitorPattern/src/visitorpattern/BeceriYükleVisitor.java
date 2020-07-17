package visitorpattern;
//ConcreteVisitor
public class BeceriYükleVisitor implements KarakterVisitor{

    @Override
    public void visit(SavaşcıGüçlüBeden savaşcıgb) {
        System.out.println("Savaşcı Güçlü Beden Hesabınıza " + savaşcıgb.getlevel() + " Beceri Puanı Yüklenmiştir.");
    }

    @Override
    public void visit(SavaşcıHavaKılıcı savaşcıhk) {
        System.out.println("Savaşcı Hava Kılıcı Hesabınıza " + savaşcıhk.getlevel() + " Beceri Puanı Yüklenmiştir.");
    }
    
}
