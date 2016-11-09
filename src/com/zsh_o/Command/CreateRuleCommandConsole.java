package com.zsh_o.Command;

import com.zsh_o.manager.ManagerInterface;

import java.util.ArrayList;

/**
 * Created by zsh_o on 2016/11/9.
 */
public class CreateRuleCommandConsole extends ManagerCommand {
    ManagerCommand managerCommand;

    public CreateRuleCommandConsole(ManagerCommand managerCommand) {
        super(managerCommand.getId(),managerCommand.getParaN(),managerCommand.getManager());
        this.managerCommand = managerCommand;
    }

    public CreateRuleCommandConsole(ManagerInterface manager) {
        super("r",2, manager);
        managerCommand=new CreateRuleCommand(manager);
    }

    @Override
    public void execute() {
        managerCommand.execute();
        //System.out.println("新增计算规则："+((CreateRuleCommand)managerCommand).getRuleid());
    }

    @Override
    public void setCommand(ArrayList<Object> paraList) {
        paraList.set(0,(String) paraList.get(0));
        paraList.set(1,Double.parseDouble((String) paraList.get(1)));
        managerCommand.setCommand(paraList);
    }
}
