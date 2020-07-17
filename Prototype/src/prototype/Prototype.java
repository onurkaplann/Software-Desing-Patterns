package prototype;

    class Arabalar{
        public String Brand;
        public String Model;
        public int Year;
        public String Color;
        public int engineCapacity;
        public int maxSpeed;  

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Arabalar araba = new Arabalar();
        araba.Brand = this.Brand;
        araba.Model = this.Model;
        araba.Year = this.Year;
        araba.Color = this.Color;
        araba.engineCapacity = this.engineCapacity;
        araba.maxSpeed = this.maxSpeed;
        
        return araba;
    }              
    }

public class Prototype {
    
    public static void main(String[] args) {
        Arabalar Suzuki = new Arabalar();
        Suzuki.Brand = "Suzuki";
        Suzuki.Model = "Auto";
        Suzuki.Year = 2006;
        Suzuki.Color = "Kırmızı";
        Suzuki.engineCapacity = 1100;
        Suzuki.maxSpeed = 180;
        
        //Shallow Copy
        Arabalar Toyota = Suzuki;
        System.out.println("Shallow Copy");
        System.out.println("\tBrand\tModel\tYear\tColor\tengineCapacity\tmaxSpeed HashCode");
        System.out.println("Suzuki :" +Suzuki.Brand+"\t"+Suzuki.Model+"\t"+Suzuki.Year+"\t"+Suzuki.Color+"\t"+Suzuki.engineCapacity+"\t\t"+Suzuki.maxSpeed+"\t"+Suzuki.hashCode());
        System.out.println("Toyota :" +Toyota.Brand+"\t"+Toyota.Model+"\t"+Toyota.Year+"\t"+Toyota.Color+"\t"+Toyota.engineCapacity+"\t\t"+Toyota.maxSpeed+"\t"+Toyota.hashCode());
        Suzuki.Color = "Sarı";
        System.out.println("Toyota :" +Toyota.Brand+"\t"+Toyota.Model+"\t"+Toyota.Year+"\t"+Toyota.Color+"\t"+Toyota.engineCapacity+"\t\t"+Toyota.maxSpeed+"\t"+Toyota.hashCode());
       
        //Deep Copy
        Arabalar BMW =  new Arabalar();
        try{
            BMW = (Arabalar) Suzuki.clone();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Deep Copy");
        System.out.println("\tBrand\tModel\tYear\tColor\tengineCapacity\tmaxSpeed HashCode");
        System.out.println("Suzuki :" +Suzuki.Brand+"\t"+Suzuki.Model+"\t"+Suzuki.Year+"\t"+Suzuki.Color+"\t"+Suzuki.engineCapacity+"\t\t"+Suzuki.maxSpeed+"\t"+Suzuki.hashCode());
        System.out.println("BMW    :" +BMW.Brand+"\t"+BMW.Model+"\t"+BMW.Year+"\t"+BMW.Color+"\t"+BMW.engineCapacity+"\t\t"+BMW.maxSpeed+"\t"+BMW.hashCode());
        Suzuki.Color = "Sarı";
        BMW.Brand = "BMW";
        BMW.engineCapacity = 1600;
        BMW.maxSpeed = 240;
        BMW.Model = "m3";
        BMW.Year = 2018;
        System.out.println("BMW    :" +BMW.Brand+"\t"+BMW.Model+"\t"+BMW.Year+"\t"+BMW.Color+"\t"+BMW.engineCapacity+"\t\t"+BMW.maxSpeed+"\t"+BMW.hashCode());
    }
    
}
