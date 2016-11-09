package com.zsh_o.Command;

import com.zsh_o.manager.ManagerInterface;

/**
 * Created by zsh_o on 2016/11/9.
 */
public abstract class ManagerCommand extends Command {
    ManagerInterface manager;

    public ManagerCommand(String id,int paraN,ManagerInterface manager) {
        super(id,paraN);
        this.manager = manager;
    }
    public String getId(){
        return super.id;
    }

    public ManagerInterface getManager() {
        return manager;
    }
}
