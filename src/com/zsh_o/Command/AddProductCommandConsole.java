package com.zsh_o.Command;

import com.zsh_o.pos.PosInterface;

import java.util.ArrayList;

/**
 * Created by zsh_o on 2016/11/9.
 */
public class AddProductCommandConsole extends PosCommand{
    PosCommand posCommand;

    public AddProductCommandConsole(PosCommand posCommand) {
        super(posCommand.getId(),posCommand.getParaN(),posCommand.getPos());
        this.posCommand = posCommand;
    }

    public AddProductCommandConsole(PosInterface pos) {
        super("n",2, pos);
        posCommand=new AddProductCommand(pos);
    }

    @Override
    public void execute() {
        posCommand.execute();
        System.out.println("总价格："+posCommand.getPos().getTotalPrice());
    }

    @Override
    public void setCommand(ArrayList<Object> paraList) {
        paraList.set(0,Integer.parseInt((String) paraList.get(0)));
        paraList.set(1,Integer.parseInt((String) paraList.get(1)));
        posCommand.setCommand(paraList);
    }
}
