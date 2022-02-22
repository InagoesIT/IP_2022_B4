package com.company;

public class Product {
    protected int id;
    protected double price;
    protected String name;
    protected String expiratesOn;

    public boolean isExpired(){
        String today = java.time.LocalDate.now().toString();
        //if (today.charAt(0) >)
        return false;
    }

    public Product(int id, String name, double price) {
        if (name == null || name.equals("")){
            System.out.println("Please give a valid name!");
            return;
        }
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
