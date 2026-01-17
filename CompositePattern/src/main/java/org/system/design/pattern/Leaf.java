package org.system.design.pattern;

public class Leaf implements Component{

    int price;
    String name;

    public Leaf(int price, String name) {
        super();
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrices() {
        System.out.println(name+ " : "+price);

    }
}
