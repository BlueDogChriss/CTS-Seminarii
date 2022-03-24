package ro.ase.cts.g1088;

import java.util.ArrayList;

public class User {
    private int id; //(minim 1)
    private String username; // minim 5 caractere
    private String name; //(minim 10 c)
    private ArrayList<Order> orderHistory;
   // private Cart shoppingCart;


    public User(int id, String username, String name) {
        this.id = id;
        this.username = username;
        this.name = name;
    }

//    public void addOrderToHistory(Order order)
//    {
//        this.order.add(order);
//    }
//
//    public void addProductToCart(Product product)
//    {
//        this.product.add(product);
//    }
}

//Identifier Value Exception

//intlts github