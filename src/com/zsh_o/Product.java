package com.zsh_o;

import com.zsh_o.rule.Rule;

/**
 * Created by zsh_o on 2016/11/9.
 */

public class Product {
    private double price;
    private int id;
    private Rule rule;

    public Product(double price, int id, Rule rule) {
        this.price = price;
        this.id = id;
        this.rule = rule;
    }

    @Override
    public String toString() {
        return new Integer(id).toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Product))  return false;
        Product o=(Product)obj;
        return id==o.id;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTruePrice(){
        return rule.calculate(price);
    }
}
