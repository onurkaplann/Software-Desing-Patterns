package compositepattern;

import java.util.ArrayList;
import java.util.List;
//Composite 
public class Kategori implements Kütüphane{
    
    public String KitapTürü;
    
    public Kategori(String KitapTürü){
        this.KitapTürü = KitapTürü;
    }
    
    List<Kütüphane> altElemanlar = new ArrayList<Kütüphane>();  
    
    public void Ekle(Kütüphane kütüphane){
        altElemanlar.add(kütüphane);
    }
    public void Çıkar(Kütüphane kütüphane){
        altElemanlar.remove(kütüphane);
    }
    

    @Override
    public void Goster(int karakterSayisi) { 
        
        for (int i = 0; i < karakterSayisi; i++) {
            System.out.print("-");
        }
        System.out.println(KitapTürü+"("+altElemanlar.size()+")");
        karakterSayisi++;

        for(Kütüphane item : altElemanlar){
            item.Goster(karakterSayisi);
        }
    }
    
}
