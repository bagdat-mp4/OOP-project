package src.models.employees;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {

    private Employee sender;
    private Employee receiver;
    private String text;
    private Date date;

    public Message() {}

    public Message(Employee sender, Employee receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public Employee getSender() { return sender; }
    public Employee getReceiver() { return receiver; }
    public String getText() { return text; }
    public Date getDate() { return date; }

    public void setSender(Employee sender) { this.sender = sender; }
    public void setReceiver(Employee receiver) { this.receiver = receiver; }
    public void setText(String text) { this.text = text; }

    @Override
    public String toString() {
        return String.format("[%s] From: %s -> To: %s | %s",
                date, sender.getFirstName(), receiver.getFirstName(), text);
    }
}