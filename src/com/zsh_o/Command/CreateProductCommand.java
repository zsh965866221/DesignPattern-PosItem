package com.zsh_o.Command;

import com.zsh_o.manager.ManagerInterface;

import java.util.ArrayList;

/**
 * Created by zsh_o on 2016/11/9.
 */
public class CreateProductCommand extends ManagerCommand {
    private int pid;
    private double price;
    private String srule;

    public CreateProductCommand(ManagerInterface manager) {
        super("p",3, manager);
    }

    @Override
    public void execute() {
        manager.registProduct(pid,price,srule);
    }

    @Override
    public void setCommand(ArrayList<Object> paraList) {
        id((Integer) paraList.get(0)).price((Double) paraList.get(1)).rule((String) paraList.get(2));
    }

    public CreateProductCommand id(int id){
        this.pid=id;
        return this;
    }
    public CreateProductCommand price(double price){
        this.price=price;
        return this;
    }
    public CreateProductCommand rule(String srule){
        this.srule=srule;
        return this;
    }

    public int getProductId() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public String getSrule() {
        return srule;
    }
}
