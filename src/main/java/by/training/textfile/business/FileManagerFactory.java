package by.training.textfile.business;

import by.training.textfile.apibusiness.FileManagerBuilder;

public class FileManagerFactory {

    public static FileManagerBuilder getFileManagerBuilder(){

        return FileManagerBuilderImpl.getInstance();
    }
}
