package by.training.textfile.command;

import by.training.textfile.bean.File;

public class Receiver {

    File create(){
        return new File();
    }
    void rename(){
        System.out.println("This is rename method");
    }
    void printConsole(){}
    void addInfo(String s){}
    void delete(){}
}
