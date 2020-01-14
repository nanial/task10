package by.training.textfile.bean;


import java.io.Serializable;

public class TextFile extends File implements Serializable {

    private Text text;

    public TextFile(String nameFile) {
        super((nameFile));
    }

    public TextFile(Text text) {
        this.text = text;
    }

    public TextFile(String nameFile, Text text) {
        super(nameFile);
        this.text = text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Text getText() {
        return text;
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
        return "TextFile{" +
                "text=" + text +
                '}';
    }
}
