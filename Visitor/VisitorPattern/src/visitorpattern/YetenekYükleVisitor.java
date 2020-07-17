package visitorpattern;
//ConcreteVisitor
public class YetenekYükleVisitor implements KarakterVisitor{

    @Override
    public void visit(SavaşcıGüçlüBeden savaşcıgb) {
         if(savaşcıgb.getlevel() >= 30){
            System.out.println(savaşcıgb.getlevel() + " Level Güçlü Beden Hesabınızın Yetenekleri Açılmıştır.");
            System.out.println("Ruh Vuruşu Açıldı.");
            System.out.println("Güçlü Vuruş Açıldı.");
            System.out.println("Kılıç Darbesi Açıldı.");
            System.out.println("Güçlü Beden Açıldı.");
            System.out.println("Kılıç çemberi Açıldı.");
            System.out.println("Şiddetli Vuruş Açıldı.");
        }else{
            System.out.println("Güçlü Beden Hesabınızın Levelini Yetenekleri Açmaya Yetmemektedir.");
        }
    }

    @Override
    public void visit(SavaşcıHavaKılıcı savaşcıhk) {
        if(savaşcıhk.getlevel() >= 30){
            System.out.println(savaşcıhk.getlevel() + "Level Hava Kılıcı Hesabınızın Yetenekleri Açılmıştır.");
            System.out.println("Hava Kılıcı Açıldı.");
            System.out.println("Öfke Açıldı.");
            System.out.println("Üç Yönlü Kesme Açıldı.");
            System.out.println("Hamle Açıldı.");
            System.out.println("Kılıç çevirme Açıldı.");
            System.out.println("Yaşama İsteği Açıldı.");
        }else{
            System.out.println("Hava Kılıcı Hesabınızın Leveli Yetenekleri Açmaya Yetmemektedir.");
        }
    }
    
}
