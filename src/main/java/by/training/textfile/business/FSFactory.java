package by.training.textfile.business;

import by.training.textfile.apibusiness.FSBuilder;

public class FSFactory {

    public static FSBuilder getFSBuilder(){

        return FSBuilderImpl.getInstance();
    }
}
