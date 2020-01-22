package by.training.textfile.business;

import by.training.textfile.apibusiness.FileManager;
import by.training.textfile.exception.FileException;

//from command

public class Receiver {

    FileManager fm = Factory.getInstance().getFileManagerBuilder().getFileManager();

    public void create() throws FileException { fm.create(); }
    public void rename() throws FileException {
        fm.rename();
    }
    public void printConsole() throws FileException {
        fm.printConsole();
    }
    public void addInfo() throws FileException {
        fm.addInfo();
    }
    public void delete() throws FileException {
       fm.delete();
    }
}
