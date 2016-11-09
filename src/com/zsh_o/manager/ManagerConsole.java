package com.zsh_o.manager;

import com.zsh_o.Product;
import com.zsh_o.rule.Rule;

/**
 * Created by zsh_o on 2016/11/9.
 * 为原始manager添加终端功能
 */
public class ManagerConsole implements ManagerInterface{
    private ManagerInterface manager;

    public ManagerConsole(ManagerInterface manager) {
        this.manager = manager;
    }

    public ManagerConsole() {
        manager=new Manager();
    }

    @Override
    public void registRule(Rule rule) {
        manager.registRule(rule);
        System.out.println("注册计算规则："+rule.getId()+"-"+rule.getDot());
    }

    @Override
    public void registRule(String id, double dot) {
        manager.registRule(id,dot);
        System.out.println("注册计算规则："+id+"-"+dot);
    }

    @Override
    public boolean registProduct(int id, double price, String srule) {
        boolean b=manager.registProduct(id,price,srule);
        if(b){
            System.out.println("注册商品："+id+"-"+price+"-"+srule);
            return true;
        }else{
            System.out.println("注册商品失败");
            return false;
        }

    }

    @Override
    public Product getProduct(int id) {
        return manager.getProduct(id);
    }

    public ManagerInterface getManager() {
        return manager;
    }
}
