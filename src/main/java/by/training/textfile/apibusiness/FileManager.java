package by.training.textfile.apibusiness;

import by.training.textfile.bean.File;
import by.training.textfile.exception.FileException;

import java.util.List;

public interface FileManager {

    void writeInFS(List<File> files);//dao
    List<File> files();//dao
    void create() throws FileException;
    void rename () throws FileException;
    void printConsole() throws FileException;
    void addInfo() throws FileException;
    void delete() throws FileException;

}
