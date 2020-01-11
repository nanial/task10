package by.training.textfile.controller;

import by.training.textfile.bean.Directory;
import by.training.textfile.bean.Text;
import by.training.textfile.bean.TextFile;
import by.training.textfile.business.MenuFactory;
import by.training.textfile.logic.DirectoryUtils;
import by.training.textfile.logic.DirectoryUtilsImpl;
import by.training.textfile.view.View;

import java.util.ArrayList;

//Создать объект класса Текстовый файл, используя классы Файл, Директория.
//Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить

public class Runner {

    public static void main(String[] args) {

        View view = new MenuFactory().getMenuBuilder().getMenu();
        view.setUserService();


        DirectoryUtils dir = new DirectoryUtilsImpl(new Directory
                ("D:\\study\\directory", new ArrayList<>()));
        System.out.println(dir.toString());
        TextFile tf1 = dir.createNewFile("newFile.txt");
        dir.addNewFile(tf1);
        System.out.println(dir.toString());
        tf1.setText(new Text("The title of new file",  new StringBuffer("Initial text")));
        System.out.println("Initial name of file is " + tf1.getNameOfFile());
        tf1.renameFile("newRenameFile.txt");
        System.out.println("Name of file after rename is " + tf1.getNameOfFile());
        tf1.printText();
        tf1.getText().supplyText(" this snippet get in supply");
        tf1.printText();
        System.out.println(dir.toString());
        dir.deleteFile(tf1);
        System.out.println(dir.toString());
    }
}
