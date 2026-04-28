package src.models.employees;

import src.models.User;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {

    private User author;
    private String text;
    private Date date;

    public Comment() {}

    public Comment(User author, String text) {
        this.author = author;
        this.text = text;
        this.date = new Date();
    }

    public User getAuthor() { return author; }
    public String getText() { return text; }
    public Date getDate() { return date; }

    public void setText(String text) { this.text = text; }

    @Override
    public String toString() {
        return String.format("[%s] %s %s: %s",
                date, author.getFirstName(), author.getLastName(), text);
    }
}