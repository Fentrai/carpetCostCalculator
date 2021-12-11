package com.company;

public class Main {

    public static void main(String[] args) {
        Floor x = new Floor(5,10);
        Carpet price = new Carpet(3);
        Floor y = new Floor(15, 5);
        Carpet price2 = new Carpet(5);
        Calculator Ishan = new Calculator(x, price);
        System.out.println(Ishan.getTotalCost());
        Calculator Anakin = new Calculator(y, price2);
        System.out.println(Anakin.getTotalCost());
    }
}
