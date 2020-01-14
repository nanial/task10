package by.training.textfile.apibusiness;

import by.training.textfile.bean.File;
import java.util.List;

public interface FileManager {

    void writeInFS(List<File> files);//dao
    List<File> files();//dao
    void create();
    void rename ();
    void printConsole();
    void addInfo();
    void delete();

}
