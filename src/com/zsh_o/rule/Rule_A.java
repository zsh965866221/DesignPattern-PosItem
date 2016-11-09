package com.zsh_o.rule;

/**
 * Created by zsh_o on 2016/11/9.
 */
public class Rule_A extends Rule {
    public Rule_A(String id) {
        super(id);
        dot=0.9;
    }
    public Rule_A(String id,double dot){
        super(id,dot);
    }

    @Override
    public double calculate(double price) {
        return dot*price;
    }
}
