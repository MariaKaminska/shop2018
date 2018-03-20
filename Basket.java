package shop;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class Basket {
    private Map<Product, Integer> list = new HashMap<>();
    public void dodaj(Product p) {
        if(list.containsKey(p)) {
        int integ = list.get(p);
        list.put(p, integ+1);
        }
        else
        list.put(p, 1);
    }
    public BigDecimal toPay() {
        BigDecimal sum= new BigDecimal("0");
        for(Product p: list.keySet()){
            int integ = list.get(p);
            sum = sum.add(p.getPrice().multiply(BigDecimal.valueOf(integ)));
        }
        return sum;
    }
    public int getCount(Product p){
    	return list.get(p);
    }
    public Collection <Product> getItems(){
    	return list.keySet();
    }
    public void add(Product p) {
    	
    	if(list.containsKey(p)) {
    		int integ=list.get(p);
    		list.put(p, integ++);
    	}
    	else
    		list.put(p, 1);
    }
    
    @Override
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        for(Product p: list.keySet()){
            int integ = list.get(p);
             s.append(p.getName());
             s.append(", price: ");
             s.append(p.getPrice());
             s.append(" x ");
             s.append(integ);
             s.append(" = ");
             s.append(p.getPrice().multiply(BigDecimal.valueOf(integ)));
             s.append("\n");
        }
        s.append("Total: ");
        s.append(toPay());
        return s.toString();
    }
}
