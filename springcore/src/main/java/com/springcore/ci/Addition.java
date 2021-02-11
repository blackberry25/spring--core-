package com.springcore.ci;

public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("this is int , int");
    }
    public Addition(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("this is double , double");
    }
    public Addition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("this is string , string");
    }
    public void DoSum(){
        System.out.println("sum of a " + this.a + " + sum of b " + this.b+ " = " + (this.a+this.b));
    }
    
}
