package by.training.textfile.logic;

import by.training.textfile.bean.File;
import by.training.textfile.bean.TextFile;

public interface DirectoryUtils {

    TextFile createNewFile(String nameOfFile);
    void addNewFile(File file);
    void deleteFile(File file);
}
