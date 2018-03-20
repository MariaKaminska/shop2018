package shop;

import java.math.BigDecimal;


public class shop {
     public static void main(String[] args) {
        Basket k = new Basket();
        Product p1 = new Product("chleb", BigDecimal.valueOf(2.2));
        Product p2 = new Product("maslo", BigDecimal.valueOf(4.72));
        Product p3 = new Product("mleko", BigDecimal.valueOf(1.5));
        k.dodaj(p1);
        k.dodaj(p2);
        k.dodaj(p1);
        k.dodaj(p1);
        k.dodaj(p3);
        k.dodaj(p2);
        System.out.println(k.toPay());
        System.out.println(k);
        
        Warehouse w=new Warehouse();
        System.out.println(w);
        w.doOrder(k);
        System.out.println(w);
        w.getItems("sour cream").setCount(0);
        System.out.println(w.productsAvailable());
        System.out.println(w.getItems("gds"));
    }
}
