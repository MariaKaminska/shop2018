
package shop2018;

import java.math.BigDecimal;

public class Shop2018 {

    public static void main(String[] args) {
        
        Produkt p1=new Produkt("telewizor",new BigDecimal("2500.99"));
        Produkt p2=new Produkt("szafa",new BigDecimal("300.50"));
        Produkt p3=new Produkt("obraz",new BigDecimal("200.39"));
        Produkt p4=new Produkt("komoda",new BigDecimal("200.99"));
        Produkt p5=new Produkt("telewizor",new BigDecimal("3500"));
        Produkt p6=new Produkt("szafa",new BigDecimal("190.50"));
        Produkt p7=new Produkt("obraz",new BigDecimal("3200.99"));
        Produkt p8=new Produkt("komoda",new BigDecimal("500"));
        
        Koszyk k=new Koszyk();
        k.dodaj(p2);
        k.dodaj(p3);
        k.dodaj(p2);
        
        System.out.println(k.doZaplaty());
        
        System.out.println(k.toString());
        
    }
    
}
