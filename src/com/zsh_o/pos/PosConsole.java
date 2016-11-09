package com.zsh_o.pos;

import com.zsh_o.manager.Manager;
import com.zsh_o.manager.ManagerInterface;

/**
 * Created by zsh_o on 2016/11/9.
 * 为原始Pos添加终端功能
 */
public class PosConsole implements PosInterface{
    private PosInterface pos;

    public PosConsole(ManagerInterface manager) {
        pos=new PosBase(manager);
    }

    @Override
    public boolean addProduct(int id, int n) {
        return pos.addProduct(id,n);
    }

    @Override
    public double getTotalPrice() {
        return pos.getTotalPrice();
    }

    @Override
    public void clearProduct() {
        pos.clearProduct();
    }
}
