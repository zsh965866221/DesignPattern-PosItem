package com.zsh_o.Command;

import com.zsh_o.manager.Manager;
import com.zsh_o.manager.ManagerInterface;

import java.util.ArrayList;

/**
 * Created by zsh_o on 2016/11/9.
 */
public class CreateRuleCommand extends ManagerCommand{
    private String cid;
    private double rate;

    public CreateRuleCommand(ManagerInterface manager) {
        super("r", 2, manager);
    }

    @Override
    public void execute() {
        manager.registRule(cid,rate);
    }

    @Override
    public void setCommand(ArrayList<Object> paraList) {
        id((String) paraList.get(0)).rate((Double) paraList.get(1));
    }

    public CreateRuleCommand id(String id){
        this.cid=id;
        return this;
    }
    public CreateRuleCommand rate(double rate){
        this.rate=rate;
        return this;
    }

    public String getRuleid() {
        return cid;
    }
}
