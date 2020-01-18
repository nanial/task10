package by.training.textfile.controller;

import by.training.textfile.apibusiness.FileManager;
import by.training.textfile.bean.FS;
import by.training.textfile.business.Factory;
import by.training.textfile.exception.FileException;
import by.training.textfile.view.View;

//Создать объект класса Текстовый файл, используя классы Файл, Директория.
//Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить

public class Runner {

    public static void main(String[] args) {

        Factory factory = new Factory();
        FS fs = factory.getFSBuilder().getFS();
        FileManager fm = factory.getFileManagerBuilder().getFileManager();

        fm.writeInFS(fs.fillFS());
        System.out.println(fm.files());

        View view = factory.getMenuBuilder().getMenu();
        try {
            view.userService();
        } catch (FileException e) {
            e.getMessage();
        }
        System.out.println(fm.files());
    }
}
