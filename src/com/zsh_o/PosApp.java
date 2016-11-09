package com.zsh_o;

import com.zsh_o.Command.*;
import com.zsh_o.manager.Manager;
import com.zsh_o.manager.ManagerConsole;
import com.zsh_o.pos.PosConsole;

import java.util.Scanner;

/**
 * Created by zsh_o on 2016/11/9.
 */
public class PosApp {
    private static PosApp m_posApp;

    CommandManager commandManager;
    PosConsole posConsole;
    ManagerConsole managerConsole;

    private PosApp() {
        managerConsole=new ManagerConsole();
        commandManager=new CommandManager();
        posConsole=new PosConsole(managerConsole);
    }

    public void registCommands(){
        commandManager.registCommand(new ClearPriceCommandConsole(posConsole));
        commandManager.registCommand(new CreateProductCommandConsole(managerConsole));
        commandManager.registCommand(new AddProductCommandConsole(posConsole));
        commandManager.registCommand(new CreateRuleCommandConsole(managerConsole));
    }
    public void run(){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String line=scanner.nextLine();
            String[] contents=line.split(" ");
            String scommand=contents[0];
            String[] paras=new String[contents.length-1];
            for(int i=1;i<contents.length;i++){
                paras[i-1]=contents[i];
            }
            commandManager.execute(scommand,paras);
        }
    }

    public static PosApp getInstance(){
        if(m_posApp==null)  m_posApp=new PosApp();
        return m_posApp;
    }
}
