package com.zsh_o.pos;

/**
 * Created by zsh_o on 2016/11/9.
 */
public interface PosInterface {
    boolean addProduct(int id,int n);
    double getTotalPrice();
    void clearProduct();
}
