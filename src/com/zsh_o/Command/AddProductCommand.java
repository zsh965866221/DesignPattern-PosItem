package com.zsh_o.Command;

import com.zsh_o.pos.PosInterface;

import java.util.ArrayList;

/**
 * Created by zsh_o on 2016/11/9.
 */
public class AddProductCommand extends PosCommand{
    private int pid;
    private int number;

    public AddProductCommand(PosInterface pos) {
        super("n",2, pos);
    }

    @Override
    public void execute() {
        pos.addProduct(pid,number);
    }

    @Override
    public void setCommand(ArrayList<Object> paraList) {
        id((Integer) paraList.get(0)).number((Integer) paraList.get(1));
    }

    public AddProductCommand id(int id){
        this.pid=id;
        return this;
    }
    public AddProductCommand number(int number){
        this.number=number;
        return this;
    }

    public int getProductId() {
        return this.pid;
    }

    public int getNumber() {
        return number;
    }
}
