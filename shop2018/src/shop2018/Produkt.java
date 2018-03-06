
package shop2018;

import java.math.BigDecimal;

public class Produkt {
    private String nazwa;
    private BigDecimal cena;
 
    public Produkt(String nazwa, BigDecimal cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
 
    public String getNazwa() {
        return nazwa;
    }
 
    public BigDecimal getCena() {
        return cena;
    }
    
    public String toString(){
        return nazwa;
    }
}
