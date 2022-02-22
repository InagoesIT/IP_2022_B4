package com.company;

public class Main {

    public static void main(String[] args) {
        Product produtto1 = new Product(1, "piece of paper", 200);
        Product produtto2 = new Product(2, "mingiuta", 500);
        Product produtto3 = new Product(3, "creion", 2);
	    Basket basketto = new Basket();
        basketto.addProduct(produtto1, 50);
        basketto.addProduct(produtto3, 20);
        basketto.addProduct(produtto2, 5);
        basketto.showBasketProducts();
        System.out.println("The size of the basket is: " + basketto.getBasketSize());
        System.out.println("The price of the basket is: " + basketto.getTotalPrice());
        basketto.deleteProduct(produtto3);
        basketto.showBasketProducts();
        System.out.println("The size of the basket is: " + basketto.getBasketSize());
        System.out.println("The price of the basket is: " + basketto.getTotalPrice());
    }
}
