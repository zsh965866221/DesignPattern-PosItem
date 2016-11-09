package com.zsh_o.Command;

import com.zsh_o.manager.Manager;
import com.zsh_o.manager.ManagerInterface;
import com.zsh_o.pos.PosInterface;

import java.util.ArrayList;

/**
 * Created by zsh_o on 2016/11/9.
 */
public class CreateProductCommandConsole extends ManagerCommand {
    ManagerCommand managerCommand;

    public CreateProductCommandConsole(ManagerCommand managerCommand) {
        super(managerCommand.getId(),managerCommand.getParaN(),managerCommand.getManager());
        this.managerCommand = managerCommand;
    }

    public CreateProductCommandConsole(ManagerInterface manager) {
        super("p",3, manager);
        managerCommand=new CreateProductCommand(manager);
    }

    @Override
    public void execute() {
        managerCommand.execute();
        //System.out.println("新增商品："+((CreateProductCommand)managerCommand).getProductId());
    }

    @Override
    public void setCommand(ArrayList<Object> paraList) {
        paraList.set(0,Integer.parseInt((String) paraList.get(0)));
        paraList.set(1,Double.parseDouble((String) paraList.get(1)));
        paraList.set(2,(String) paraList.get(2));
        managerCommand.setCommand(paraList);
    }
}
