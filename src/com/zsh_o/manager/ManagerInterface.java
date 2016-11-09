package com.zsh_o.manager;

import com.zsh_o.Product;
import com.zsh_o.rule.Rule;

/**
 * Created by zsh_o on 2016/11/9.
 */
public interface ManagerInterface {
    public void registRule(Rule rule);
    public void registRule(String id,double dot);
    public boolean registProduct(int id,double price,String srule);
    public Product getProduct(int id);
}
