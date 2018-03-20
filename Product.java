/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.math.*;
public class Product implements Comparable<Product>{
    private String name;
    private BigDecimal price;
    private int count = 100;
    public Product(String n, BigDecimal c) {
        name = n;
        price = c;
    }
    public String getName () {
        return name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int i) {
        count=i;
    }
    
    public void addStock(int c) {
        count=count+c;
    }
    @Override
    public int compareTo(Product o) {
        return name.compareTo(o.name);
    }
    
    @Override
    public String toString() {
        return name+"("+count+"x"+price+"zl)";
    }
  
}