package compositepattern;
//Client
public class CompositePattern {

    public static void main(String[] args) {
        Kategori kitaplar = new Kategori("Kitaplar");
        Kategori bilimKurgu = new Kategori("Bilim Kurgu");
        Kategori fantastik = new Kategori("Fantastik");
        Kategori korku = new Kategori("Korku");

        Kitap bilimKurgu1 = new Kitap("Olasılıksız","Adam Fawer",2005);
        Kitap bilimKurgu2 = new Kitap("Cesur Yeni Dünya","Aldous Huxley",1932);
            
        Kitap fantastik1 = new Kitap("Hobbit","J.R.R. Tolkien",1937);
        Kitap fantastik2 = new Kitap("Harry Potter ve Felsefe Taşı","J.K. Rowling",1997);
        Kitap fantastik3 = new Kitap("Taht Oyunları","Georfe R.R. Martin",1996);
        
        Kitap korku1 = new Kitap("Son Av","Jean-Christophe Grange",2020);
        Kitap korku2 = new Kitap("Hayvan Mezarlığı","Stephen King",1983);
                
        kitaplar.Ekle(bilimKurgu);
        kitaplar.Ekle(fantastik);
        kitaplar.Ekle(korku);    
        
        bilimKurgu.Ekle(bilimKurgu1);
        bilimKurgu.Ekle(bilimKurgu2);
        fantastik.Ekle(fantastik1);
        fantastik.Ekle(fantastik2);
        fantastik.Ekle(fantastik3);
        korku.Ekle(korku1);
        korku.Ekle(korku2);
        
        korku.Çıkar(korku1);
        
        kitaplar.Goster(1);
    }
    
}
