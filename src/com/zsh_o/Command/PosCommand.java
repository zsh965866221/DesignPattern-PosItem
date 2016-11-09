package com.zsh_o.Command;

import com.zsh_o.pos.PosInterface;

/**
 * Created by zsh_o on 2016/11/9.
 */
public abstract class PosCommand extends Command {
    public PosInterface pos;

    public PosCommand(String id,int paraN,PosInterface pos) {
        super(id,paraN);
        this.pos = pos;
    }

    public PosInterface getPos() {
        return pos;
    }
    public String getId(){
        return super.id;
    }
}
