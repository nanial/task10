package by.training.textfile.bean;

import java.util.ArrayList;

public class Directory {

    private String pathName;
    private ArrayList<File> files;

    public Directory(String pathName, ArrayList<File> files) {
        this.pathName = pathName;
        this.files = files;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Directory)) return false;

        Directory directory = (Directory) o;

        if (getPathName() != null ? !getPathName().equals(directory.getPathName()) : directory.getPathName() != null)
            return false;
        return getFiles() != null ? getFiles().equals(directory.getFiles()) : directory.getFiles() == null;
    }

    @Override
    public int hashCode() {
        int result = getPathName() != null ? getPathName().hashCode() : 0;
        result = 31 * result + (getFiles() != null ? getFiles().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "pathName='" + pathName + '\'' +
                ", files=" + files +
                '}';
    }
}
