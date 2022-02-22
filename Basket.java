package com.company;

import java.util.ArrayList;

public class Basket {
    ArrayList<SelectedProduct> listOfProducts = new ArrayList<>();

    public void addProduct(Product product, double quantity) {
        SelectedProduct newProduct  = new SelectedProduct(product.id, product.name, product.price, quantity);
        listOfProducts.add(newProduct);
    }

    public int getBasketSize() {
        return listOfProducts.size();
    }

    public double getTotalPrice(){
        double sum = 0;
        for (int i = 0; i < listOfProducts.size(); i++){
            sum += listOfProducts.get(i).getPriceForSelectedProduct();
        }
        return sum;
    }

    public void deleteProduct(Product product) {
        for (int i = 0; i < listOfProducts.size(); i++) {
            if (product.getId() == listOfProducts.get(i).getId()) {
                listOfProducts.remove(i);
                break;
            }
        }
    }

    public void showBasketProducts(){
        for (int i = 0; i < listOfProducts.size(); i++){
            System.out.println("Product " + (i + 1) + ", with id: " +
                    listOfProducts.get(i).getId() + " is " + listOfProducts.get(i).getName());
        }
    }

}
