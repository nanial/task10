package by.training.textfile.controller;

import by.training.textfile.apiDao.FSDao;
import by.training.textfile.apibusiness.FileManager;
import by.training.textfile.bean.Directory;
import by.training.textfile.bean.FS;
import by.training.textfile.bean.Text;
import by.training.textfile.bean.TextFile;
import by.training.textfile.business.FSFactory;
import by.training.textfile.business.FileManagerFactory;
import by.training.textfile.business.FileManagerImpl;
import by.training.textfile.business.MenuFactory;
import by.training.textfile.dao.FSDaoImpl;
import by.training.textfile.view.View;

//Создать объект класса Текстовый файл, используя классы Файл, Директория.
//Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить

public class Runner {

    public static void main(String[] args) {

        FS fs = new FSFactory().getFSBuilder().getFS();

        FileManager fm = new FileManagerFactory().getFileManagerBuilder().getFileManager();

        fm.writeInFS(fs.fillFS());
        fm.files();

        View view = new MenuFactory().getMenuBuilder().getMenu();
        view.userService();

    }
}
