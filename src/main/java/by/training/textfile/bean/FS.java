package by.training.textfile.bean;

import java.util.ArrayList;
import java.util.List;

public class FS {

    List<File> files = new ArrayList<>();

    public List<File> fillFS(){

        files.add(new File("file # one "));
        return files;
    }
}
