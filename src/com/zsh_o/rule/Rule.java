package com.zsh_o.rule;

/**
 * Created by zsh_o on 2016/11/9.
 */
public abstract class Rule {
    private String id;
    public abstract double calculate(double price);
    double dot;

    public Rule(String id) {
        this.id = id;
    }

    public Rule(String id, double dot) {
        this.id = id;
        this.dot = dot;
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        obj=(Rule)obj;
        return ((Rule) obj).id.equals(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getDot() {
        return dot;
    }
}
