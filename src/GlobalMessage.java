package src;

import src.models.employees.Employee;

import java.io.Serializable;
import java.util.Date;

public class GlobalMessage implements Serializable {

    private Employee sender;
    private String text;
    private Date date;

    public GlobalMessage() {}

    public GlobalMessage(Employee sender, String text) {
        this.sender = sender;
        this.text = text;
        this.date = new Date();
    }

    public Employee getSender() { return sender; }
    public String getText() { return text; }
    public Date getDate() { return date; }

    @Override
    public String toString() {
        return String.format("[GLOBAL | %s] %s: %s",
                date, sender.getFirstName(), text);
    }
}