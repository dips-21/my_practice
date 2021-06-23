package questionSet1Shopping;

import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    String name;
    Map<Item, Integer> itemMap;

    public ShoppingCart(String name) {
        this.name = name;
        this.itemMap = new HashMap<>();
    }

    void addProduct(Item product, int quantity) {
        itemMap.put(product, quantity);
    }

    void addProduct(Item product) {
        itemMap.put(product, 1);
    }

    void deleteProduct(Item product, int quantity) {
        itemMap.remove(product, quantity);
    }

    // Biscuit-->5   10
    //t-shirt-->1
    //skirt-->2
    public double getCartPrice() {
        double totalPrice = 0;

       /* Iterator<Map.Entry<Item, Integer>> mapIterator = itemMap.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<Item, Integer> entry = mapIterator.next();
            Item item = entry.getKey();
            int quantity = entry.getValue();
            double price = item.getCostPerUnit() * quantity;
        }*/
        for (Item item : itemMap.keySet()) {
            double price = item.getCostPerUnit() * itemMap.get(item);
            totalPrice += price;
        }
        if (totalPrice > 50000) {
            return totalPrice-0.05 * totalPrice;
        }
        if(totalPrice>100000){
            return totalPrice-0.10*totalPrice;
        }
        return totalPrice;
    }
}
