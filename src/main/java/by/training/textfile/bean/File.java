package by.training.textfile.bean;

import java.io.Serializable;

public class File implements Serializable {

    private String nameFile;
    private Directory dir;

    public File() {

    }

    public File(String nameFile) {
        this.nameFile = nameFile;
    }

    public File(String nameFile, Directory dir) {
        this.nameFile = nameFile;
        this.dir = dir;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public Directory getDir() {
        return dir;
    }

    public void setDir(Directory dir) {
        this.dir = dir;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof File)) return false;

        File file = (File) o;

        if (getNameFile() != null ? !getNameFile().equals(file.getNameFile()) : file.getNameFile() != null)
            return false;
        return getDir() != null ? getDir().equals(file.getDir()) : file.getDir() == null;
    }

    @Override
    public int hashCode() {
        int result = getNameFile() != null ? getNameFile().hashCode() : 0;
        result = 31 * result + (getDir() != null ? getDir().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "File{" +
                "nameFile='" + nameFile + '\'' +
                ", dir=" + dir +
                '}';
    }
}
