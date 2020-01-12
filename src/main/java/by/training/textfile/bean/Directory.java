package by.training.textfile.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class Directory implements Serializable {

    private String pathName;
   // private ArrayList<File> files;

    public Directory(String pathName) {
        this.pathName = pathName;
     //   this.files = files;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Directory)) return false;

        Directory directory = (Directory) o;

        return getPathName() != null ? getPathName().equals(directory.getPathName()) : directory.getPathName() == null;
    }

    @Override
    public int hashCode() {
        return getPathName() != null ? getPathName().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "pathName='" + pathName + '\'' +
                '}';
    }
}
