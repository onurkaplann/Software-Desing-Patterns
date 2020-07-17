package visitorpattern;
//ConcreteElement
public class SavaşcıGüçlüBeden implements Karakter{

    public int level;
    
    public SavaşcıGüçlüBeden(int level){
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
