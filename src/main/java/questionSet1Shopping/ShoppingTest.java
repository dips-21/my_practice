package questionSet1Shopping;

public class ShoppingTest {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart("Dips");
        /*shoppingCart.addProduct(new Item(1,"NoteBook",10),10);
        shoppingCart.addProduct(new Item(2,"Java Book",10),10);
        shoppingCart.addProduct(new Item(3,"Parker Pen",10),20);*/
        shoppingCart.addProduct(new Item(4,"Laptop",50000),1);
        shoppingCart.addProduct(new Item(4,"headphones",5000),2);

        System.out.println(shoppingCart.getCartPrice());


    }

}
