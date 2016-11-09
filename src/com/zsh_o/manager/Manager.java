package com.zsh_o.manager;

import com.zsh_o.rule.DefaultRule;
import com.zsh_o.Product;
import com.zsh_o.rule.Rule;

import java.util.HashMap;

/**
 * Created by zsh_o on 2016/11/9.
 */
public class Manager implements ManagerInterface{
    HashMap<Integer,Product> products;
    HashMap<String,Rule> rules;

    public Manager() {
        products=new HashMap<>();
        rules=new HashMap<>();
    }

    public void registRule(Rule rule){
        rules.put(rule.toString(),rule);
    }
    public void registRule(String id,double dot){
        Rule rule=rules.get(id);
        if(rule==null){
            rule=new DefaultRule(id,dot);
        }
        rules.put(rule.toString(),rule);
    }
    public boolean registProduct(int id,double price,String srule){
        Rule rule=rules.get(srule);
        if(rule==null){
            return false;
        }
        Product product;
        if(products.get(id)==null) {
            product = new Product(price, id, rule);
            products.put(id, product);
        }
        product=products.get(id);
        product.setRule(rule);
        return true;
    }

    public Product getProduct(int id){
        return products.get(id);
    }
    public Rule getRule(String srule){
        return rules.get(srule);
    }
}
