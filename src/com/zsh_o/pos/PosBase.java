package com.zsh_o.pos;

import com.zsh_o.Command.CommandManager;
import com.zsh_o.Product;
import com.zsh_o.manager.Manager;
import com.zsh_o.manager.ManagerInterface;

import java.util.HashMap;

/**
 * Created by zsh_o on 2016/11/9.
 * Pos的原始功能
 */
public class PosBase implements PosInterface{
    private ManagerInterface manager;
    private HashMap<Product,Integer> productList;
    private double total=0;

    public PosBase(ManagerInterface manager) {
        this.manager = manager;
        productList=new HashMap<>();
    }

    @Override
    public boolean addProduct(int id, int n) {
        Product product=manager.getProduct(id);
        if(product==null){
            return false;
        }
        Integer integer=productList.get(product);
        if(integer!=null){//该商品已经刷过
            integer++;
        }
        integer=new Integer(n);
        productList.put(product,integer);
        total+=(product.getTruePrice()*n);
        return true;
    }

    @Override
    public double getTotalPrice() {
        return total;
    }

    @Override
    public void clearProduct() {
        total=0;
        productList.clear();
    }

    public ManagerInterface getManager() {
        return manager;
    }
}
