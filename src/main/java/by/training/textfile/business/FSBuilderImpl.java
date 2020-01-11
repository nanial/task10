package by.training.textfile.business;

import by.training.textfile.apibusiness.FSBuilder;
import by.training.textfile.bean.FS;

public class FSBuilderImpl implements FSBuilder {

    private FS fs;
    private static FSBuilderImpl instance;

    public FSBuilderImpl() {
        this.fs = fs;
    }
    synchronized public static FSBuilderImpl getInstance(){

        if(instance == null){
            instance = new FSBuilderImpl();
        }
        return instance;
    }

    @Override
    public FS getFS() {
        return fs;
    }
}
