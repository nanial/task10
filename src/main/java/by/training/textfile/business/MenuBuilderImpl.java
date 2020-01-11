package by.training.textfile.business;


import by.training.textfile.apibusiness.MenuBuilder;
import by.training.textfile.view.Menu;

public class MenuBuilderImpl implements MenuBuilder {

    private Menu menu;
    private static MenuBuilderImpl instance;

    private MenuBuilderImpl() {
        this.menu = new Menu();
    }

    synchronized public static MenuBuilderImpl getInstance(){

        if(instance == null){
            instance = new MenuBuilderImpl();
        }
        return instance;
    }

    @Override
    public Menu getMenu() {
        return menu;
    }
}
