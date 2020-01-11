package by.training.textfile.bean;

public class File {

    private String nameOfFile;
    private Directory dir;


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

    public void renameFile(String newNameOfFile){
        this.setNameOfFile(newNameOfFile);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof File)) return false;

        File file = (File) o;

        if (getNameOfFile() != null ? !getNameOfFile().equals(file.getNameOfFile()) : file.getNameOfFile() != null)
            return false;
        return dir != null ? dir.equals(file.dir) : file.dir == null;
    }

    @Override
    public int hashCode() {
        int result = getNameOfFile() != null ? getNameOfFile().hashCode() : 0;
        result = 31 * result + (dir != null ? dir.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return nameOfFile;
    }
}
