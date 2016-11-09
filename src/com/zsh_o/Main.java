package com.zsh_o;

import com.zsh_o.PosApp;

/**
 * Created by zsh_o on 2016/11/9.
 */
public class Main {
    public static void main(String[] args){
        PosApp app=PosApp.getInstance();
        app.registCommands();
        app.run();
    }
}
