package com.zsh_o.Command;

import com.zsh_o.pos.PosInterface;

import java.util.ArrayList;

/**
 * Created by zsh_o on 2016/11/9.
 */
public class ClearPriceCommand extends PosCommand {

    public ClearPriceCommand(PosInterface pos) {
        super("c",0, pos);
    }

    @Override
    public void execute() {
        pos.clearProduct();
    }

    @Override
    public void setCommand(ArrayList<Object> paraList) {
    }
}
