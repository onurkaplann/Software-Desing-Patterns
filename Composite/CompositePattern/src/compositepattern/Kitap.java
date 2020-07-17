package compositepattern;
//Leaf
public class Kitap implements Kütüphane{
    public String KitapAdı,YazarAdı;
    public int BasımYılı;
    
    public Kitap(String KitapAdı,String YazarAdı,int BasımYılı){
        this.KitapAdı = KitapAdı;
        this.YazarAdı = YazarAdı;
        this.BasımYılı = BasımYılı;
    }

    @Override
    public void Goster(int karakterSayisi) {
        for (int i = 0; i < karakterSayisi; i++) {
            System.out.print("-");
        } 
        System.out.println("Kitabın Adı : "+KitapAdı+", Kitabın Yazarı : "+YazarAdı+", Kitabın Yayın Tarihi : "+BasımYılı);

    }    
}
