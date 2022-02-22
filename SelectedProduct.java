package com.company;

public class SelectedProduct extends Product {
    private double quantity;

    public SelectedProduct(int id, String name, double price, double quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setQuantity(double quantity){
        this.quantity = quantity;
    }

    public double getQuantity(){
        return quantity;
    }

    public double getPriceForSelectedProduct()
    {
        return price * quantity;
    }

}
