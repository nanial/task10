package by.training.textfile.bean;

public class File {

    private String nameOfFile;
    private Directory dir;
    private java.io.File file;

    public File() {

    }

    public File(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    public File(String nameOfFile, Directory dir) {
        this.nameOfFile = nameOfFile;
        this.dir = dir;
    }

    public String getNameOfFile() {
        return nameOfFile;
    }

    public void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    public Directory getDir() {
        return dir;
    }

    public void setDir(Directory dir) {
        this.dir = dir;
    }

    public java.io.File getFile() {
        return file;
    }

    public void setFile(java.io.File file) {
        this.file = file;
    }

    public void renameFile(String newNameOfFile){
        this.setNameOfFile(newNameOfFile);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof File)) return false;

        File file1 = (File) o;

        if (getNameOfFile() != null ? !getNameOfFile().equals(file1.getNameOfFile()) : file1.getNameOfFile() != null)
            return false;
        if (getDir() != null ? !getDir().equals(file1.getDir()) : file1.getDir() != null) return false;
        return getFile() != null ? getFile().equals(file1.getFile()) : file1.getFile() == null;
    }

    @Override
    public int hashCode() {
        int result = getNameOfFile() != null ? getNameOfFile().hashCode() : 0;
        result = 31 * result + (getDir() != null ? getDir().hashCode() : 0);
        result = 31 * result + (getFile() != null ? getFile().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "File{" +
                "nameOfFile='" + nameOfFile + '\'' +
                ", dir=" + dir +
                ", file=" + file +
                '}';
    }
}
