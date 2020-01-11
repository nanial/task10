package by.training.textfile.business;

import by.training.textfile.apibusiness.MenuBuilder;

public class MenuFactory {

    public static MenuBuilder getMenuBuilder(){

        return MenuBuilderImpl.getInstance();
    }
}
