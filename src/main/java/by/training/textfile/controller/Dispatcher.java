package by.training.textfile.controller;

import by.training.textfile.bean.File;
import by.training.textfile.command.Command;

public class Dispatcher {

    Command create;
    Command rename;
    Command addInfo;
    Command delete;
    Command print;

    public Dispatcher(Command create, Command rename, Command addInfo, Command delete, Command print) {
        this.create = create;
        this.rename = rename;
        this.addInfo = addInfo;
        this.delete = delete;
        this.print = print;
    }
    File create(){
        create.execute();
        return new File();
    }

    public void rename(){
        rename.execute();
    }
    public void printConsole(){
        print.execute();
    }
    public void addInfo(String s){
        addInfo.execute();
    }
    public void delete(){
        delete.execute();
    }
}
