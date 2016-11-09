package com.zsh_o.Command;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by zsh_o on 2016/11/9.
 */
public class CommandManager {
    HashMap<String,Command> commands;
    ArrayList<Object> paraList;

    public CommandManager() {
        commands=new HashMap<>();
        paraList=new ArrayList<>();
    }
    public void registCommand(Command command){
        commands.put(command.toString(),command);
    }
    public Command getCommand(String command){
        return commands.get(command);
    }
    public void deleteCommand(String command){
        commands.remove(command);
    }

    public Command setPara(String command,Object[] paras){
        paraList.clear();
        for(int i=0;i<paras.length;i++){
            paraList.add(paras[i]);
        }
        Command c=getCommand(command);
        if(c==null) return null;
        c.setCommand(paraList);
        return c;
    }
    public boolean execute(String command,Object[] paras){
        Command c=setPara(command,paras);
        if(c==null) return false;
        c.execute();
        return true;
    }
}
