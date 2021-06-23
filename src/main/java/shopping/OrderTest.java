package shopping;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order(1);
        Product[] products = {new Product(1, "Tshirt", 1000),
                new Product(2, "Kurta", 2000),
                new Product(3, "Jeans", 3000),
                new Product(4, "skirt", 2500),
                new Product(5, "mini skirt", 2500),
                new Product(6, "nano skirt", 2500),
                new Product(7, "Biscuits", 100)};
        for (Product product:products) {
            order.addProduct(product);
        }
        order.printOrder();
        System.out.println(order.orderPrice());
        order.removeProduct(products[4]);
        order.printOrder();
        System.out.println(order.orderPrice());
    }
}

