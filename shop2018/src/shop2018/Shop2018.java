
package shop2018;

import java.math.BigDecimal;

public class Shop2018 {

    public static void main(String[] args) {
        
        Produkt p1=new Produkt("telewizor1",new BigDecimal("2500.99"));
        Produkt p2=new Produkt("szafa1",new BigDecimal("300.50"));
        Produkt p3=new Produkt("obraz",new BigDecimal("200.39"));
        Produkt p4=new Produkt("komoda1",new BigDecimal("200.99"));
        Produkt p5=new Produkt("telewizor2",new BigDecimal("3500"));
        Produkt p6=new Produkt("szafa2",new BigDecimal("190.50"));
        Produkt p7=new Produkt("telewizor3",new BigDecimal("3200.99"));
        Produkt p8=new Produkt("komoda2",new BigDecimal("500"));
        
        Koszyk k=new Koszyk();
        k.dodaj(p7);
        k.dodaj(p7);
        k.dodaj(p7);
        k.dodaj(p5);
        k.dodaj(p5);
        k.dodaj(p4);
        
        System.out.println(k.doZaplaty());
        
        System.out.println(k.toString());
        
    }
    
}
