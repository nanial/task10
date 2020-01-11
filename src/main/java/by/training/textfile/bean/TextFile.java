package by.training.textfile.bean;


public class TextFile extends File {

    private Text text;

    public TextFile(String nameOfFile, Directory dir) {
        super(nameOfFile, dir);
    }
    public void setText(Text text) {
        this.text = text;
    }

    public Text getText() {
        return text;
    }

    public void printText(){
        System.out.println(this.getText().toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TextFile)) return false;
        if (!super.equals(o)) return false;

        TextFile textFile = (TextFile) o;

        return getText() != null ? getText().equals(textFile.getText()) : textFile.getText() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getText() != null ? getText().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return getNameOfFile();
    }
}
