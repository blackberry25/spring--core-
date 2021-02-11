package com.springcore.lifecycle;
public class mango {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("Setting price of mango");
        this.price = price;
    }

    public mango(int price) {
        System.out.println("Setting price of mango");
        this.price = price;
    }

    @Override
    public String toString() {
        return "mango [price=" + price + "]";
    }
    void init(){
        System.out.println("initialising object");
    }
    void destroy(){
        System.out.println("destroying object");
    }

    public mango() {
    }
}
