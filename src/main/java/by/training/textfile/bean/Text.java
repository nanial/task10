package by.training.textfile.bean;


import java.io.Serializable;

public class Text implements Serializable {

    private String title;
    private StringBuffer content;

    public Text(String title, StringBuffer content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StringBuffer getContent() {
        return content;
    }

    public void setContent(StringBuffer content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;

        Text text = (Text) o;

        if (title != null ? !title.equals(text.title) : text.title != null) return false;
        return getContent() != null ? getContent().equals(text.getContent()) : text.getContent() == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (getContent() != null ? getContent().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return title + "\n" + content;
    }
}
