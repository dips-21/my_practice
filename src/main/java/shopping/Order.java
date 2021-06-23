package shopping;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    List<Product> productList;

    public Order(int id) {
        this.id = id;
        this.productList = new ArrayList<>();
    }

    void addProduct(Product product){
        productList.add(product);
    }

    void removeProduct(Product product){
        productList.remove(product);
    }

    double orderPrice(){
        double total=0;
        for (Product product:productList) {
            total+= product.getPrice();
        }
         return total;
    }

    void printOrder(){
        for (Product product:productList) {
            System.out.println(product);
        }
    }
}

