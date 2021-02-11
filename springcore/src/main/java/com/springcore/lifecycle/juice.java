package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class juice implements InitializingBean,DisposableBean{
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("seting price properities...");
        this.price = price;
    }

    public juice() {
    }

    public juice(int price) {
        System.out.println("in constructor  seting price properities...");
        this.price = price;
    }

    public void destroy() throws Exception {
        // TODO Auto-generated method stub
         System.out.println("Destroying !");

    }

    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("intialization....");
         

    }

    @Override
    public String toString() {
        return "juice [price=" + price + "]";
    }
    
}
