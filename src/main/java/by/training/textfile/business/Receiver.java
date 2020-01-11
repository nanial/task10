package by.training.textfile.business;

import by.training.textfile.bean.File;

public class Receiver {

    public File create(){
        return new File();
    }
    public void rename(){
        System.out.println("This is rename method");
    }
    public void printConsole(){}
    public void addInfo(String s){}
    public void delete(){}
}
