package com.zsh_o.Command;

import com.zsh_o.pos.PosInterface;

import java.util.ArrayList;

/**
 * Created by zsh_o on 2016/11/9.
 */
public class ClearPriceCommandConsole extends PosCommand {
    PosCommand posCommand;

    public ClearPriceCommandConsole(PosCommand posCommand) {
        super(posCommand.getId(),posCommand.getParaN(),posCommand.getPos());
        this.posCommand = posCommand;
    }

    public ClearPriceCommandConsole(PosInterface pos) {
        super("c",0, pos);
        posCommand=new ClearPriceCommand(pos);
    }

    @Override
    public void execute() {
        posCommand.execute();
        System.out.println("已清空总价格");
        System.out.println("总价格："+posCommand.getPos().getTotalPrice());
    }

    @Override
    public void setCommand(ArrayList<Object> paraList) {
        posCommand.setCommand(paraList);
    }
}
