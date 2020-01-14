package by.training.textfile.business;

import by.training.textfile.apibusiness.FileManagerBuilder;

public class FileManagerFactory {

    private static final FileManagerFactory instance = new FileManagerFactory();
    private final FileManagerBuilderImpl fileManagerBuilder =
            new FileManagerBuilderImpl();

    public FileManagerFactory() {
    }

    public static FileManagerBuilder getFileManagerBuilder(){

        return FileManagerBuilderImpl.getInstance();
    }
}
