package by.training.textfile.business;

import by.training.textfile.apibusiness.FSBuilder;
import by.training.textfile.apibusiness.FileManagerBuilder;
import by.training.textfile.apibusiness.MenuBuilder;

public class Factory {

 //   private static final Factory instance = new Factory();

    public Factory() {
    }

    public static FileManagerBuilder getFileManagerBuilder(){

        return FileManagerBuilderImpl.getInstance();
    }
    public static FSBuilder getFSBuilder(){

        return FSBuilderImpl.getInstance();
    }
    public static MenuBuilder getMenuBuilder(){

        return MenuBuilderImpl.getInstance();
    }
}
