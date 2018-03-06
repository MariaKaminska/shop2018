package shop2018;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
 
 
 public class Koszyk {
    private Map<Produkt,Integer> lista = new HashMap<>();
     
    public void dodaj(Produkt p)
    {
        if(lista.containsKey(p)){
            Integer i=lista.get(p)+1;
            lista.put(p, i);
        }
        else{
            lista.put(p,1);
        }
    }
     
    public BigDecimal doZaplaty()
    {
        BigDecimal sum = new BigDecimal("0");
        for(Produkt p : lista.keySet())
        {
            int ilosc=lista.get(p);
            sum=sum.add(p.getCena().multiply(new BigDecimal(ilosc)));
        }
        return sum;
    }
    
    public String toString()
        {
            return lista.toString()+": "+doZaplaty(); 
        }
    }
 
