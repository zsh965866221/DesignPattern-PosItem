package com.zsh_o.rule;

import com.zsh_o.rule.Rule;

/**
 * Created by zsh_o on 2016/11/9.
 */
public class DefaultRule extends Rule {

    public DefaultRule(String id, double dot) {
        super(id, dot);
    }

    @Override
    public double calculate(double price) {
        return dot*price;
    }
}
