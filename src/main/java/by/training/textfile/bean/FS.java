package by.training.textfile.bean;

import java.util.ArrayList;
import java.util.List;

public class FS {

    List<File> files = new ArrayList<>();

    public List<File> fillFS(){

        files.add(new File("file # one", new Directory(), new Text()));
        files.add(new File("file # two"));
        files.add(new File("file # three",
                new Text("title", "initial content")));
        return files;
    }
    public List<File> addFS(File file){
        files.add(file);
        return files;
    }
}
