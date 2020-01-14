package by.training.textfile.business;

import by.training.textfile.apibusiness.FileManager;

//from command

public class Receiver {

    FileManager fm = new FileManagerFactory().getFileManagerBuilder().getFileManager();

    public void create(){ fm.create(); }
    public void rename(){
        fm.rename();
    }
    public void printConsole(){
        fm.printConsole();
    }
    public void addInfo(){
        fm.addInfo();
    }
    public void delete(){
       fm.delete();
    }
}
