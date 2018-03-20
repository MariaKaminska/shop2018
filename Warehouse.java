package shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Warehouse {
    private List<Product> products=new ArrayList<Product>();
    
    
    public Collection<Product> productsAvailable(){ //Praca domowa! Zwraca produkty, kótrych jest więcej niż 0
        Collection <Product> p=new ArrayList<>();
    	return p;
    }
    
    public Warehouse()
    {
        products.add(new Product("chleb",new BigDecimal("2.2")));
        products.add(new Product("maslo",new BigDecimal("4.5")));
        products.add(new Product("mleko",new BigDecimal("1.3")));
        products.add(new Product("jogurt",new BigDecimal("0.95")));
        products.add(new Product("smietana",new BigDecimal("1.5")));
        
    } 
    
    public Collection<Product> productsSortedByName(){
        
        TreeSet set=new TreeSet();
        set.addAll(products);
        return set;
    }
    
    public Collection<Product> productsSortedByPrice(){
        PriceComparator c=new PriceComparator();
        TreeSet<Product> set=new TreeSet(c);
        set.addAll(products);
        return set;
    }   
    
    public void doOrder(Basket basket){
        
    }
    
    public String toString(){
        return products.toString();
    }
    
    public static void main(String args[]){
        
       Warehouse war=new Warehouse();
       
       System.out.println(war.productsSortedByName());
       System.out.println(war.productsSortedByPrice());
       
       
    }
}
