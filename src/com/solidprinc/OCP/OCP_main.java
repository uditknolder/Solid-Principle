package com.solidprinc.OCP;

public class OCP_main {
    public static void main(String[] args) throws Exception {
        Calculator calci = new Calculator();
        Addition add = new Addition(100,500);
        Subtraction sub = new Subtraction(100,50);
        Multiplication mul = new Multiplication(20,25);
        calci.calculate(add);
        System.out.println("result: "+add.sum);
        calci.calculate(sub);
        System.out.println("result:  "+sub.difference);
        calci.calculate(mul);
        System.out.println("result:  "+mul.product);

    }
}
