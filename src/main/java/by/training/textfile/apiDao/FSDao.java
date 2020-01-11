package by.training.textfile.apiDao;

import by.training.textfile.bean.File;

import java.util.List;

public interface FSDao {

    void writeInFS(List<File> files);
    List<File> files();
}
