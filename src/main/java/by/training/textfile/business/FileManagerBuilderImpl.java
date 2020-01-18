package by.training.textfile.business;

import by.training.textfile.apiDao.FSDao;
import by.training.textfile.apibusiness.FileManagerBuilder;
import by.training.textfile.dao.FSDaoImpl;

public class FileManagerBuilderImpl implements FileManagerBuilder {

    private FileManagerImpl fm;
    private static FileManagerBuilderImpl instance;
    FSDao fsDao = new FSDaoImpl();

     private FileManagerBuilderImpl() {
        this.fm = new FileManagerImpl(fsDao);
    }

    synchronized public static FileManagerBuilderImpl getInstance(){

        if(instance == null){
            instance = new FileManagerBuilderImpl();
        }
        return instance;
    }

    @Override
    public FileManagerImpl getFileManager() {
        return fm;
    }
}
