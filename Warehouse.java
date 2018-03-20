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
    
    
    public Collection<Product> productsAvailable(){ //Praca domowa! Zwraca produkty, kĂłtrych jest wiÄ™cej niĹĽ 0
    	
    	TreeSet<Product> set = new TreeSet<>();
        for(Product pr: products)
            if(pr.getCount()>0)
                set.add(pr);
        return set;
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
        
        TreeSet<Product> set=new TreeSet<>();
        set.addAll(products);
        return set;
    }
    
    public Collection<Product> productsSortedByPrice(){
    	
        TreeSet<Product> set=new TreeSet<>(new PriceComparator());
        set.addAll(products);
        return set;
    }   
    
    public void doOrder(Basket basket){
        
    	for(Product p:basket.getItems()) {
    		for(Product p1:products) {
    			if(p1.getName().equals(p.getName()))
    				p1.addStock(basket.getCount(p));
    		}
    	}
    }
    
    public Product getItems(String s) {
    	
    	for(Product p:products) {
    		if(p.getName().equals(s))
    			return p;
    	}
    	return new Product("/n",new BigDecimal("0"));
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
