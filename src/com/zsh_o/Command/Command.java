package com.zsh_o.Command;

import java.util.ArrayList;

/**
 * Created by zsh_o on 2016/11/9.
 */
public abstract class Command {
    String id;
    public abstract void execute();
    private int paraN;

    public Command(String id,int paraN) {
        this.id = id;
        this.paraN=paraN;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof  Command))  return false;
        Command o=(Command)obj;
        return o.id.equals(id);
    }

    @Override
    public String toString() {
        return id;
    }

    public int getParaN() {
        return paraN;
    }
    public abstract void setCommand(ArrayList<Object> paraList);
}
