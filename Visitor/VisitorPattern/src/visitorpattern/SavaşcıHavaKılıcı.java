package visitorpattern;
//ConcreteElement
public class SavaşcıHavaKılıcı implements Karakter {

    public int level;
    
    public SavaşcıHavaKılıcı(int level){
        this.level = level; 
    }
            
    public int getlevel() {
        return level;
    }
    
    @Override
    public void yükle(KarakterVisitor karaktervisitor) {
        karaktervisitor.visit(this);
    }    
}
