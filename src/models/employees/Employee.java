package src.models.employees;

import src.models.User;

import java.io.Serializable;
import java.util.*;

public abstract class Employee extends User {

    private double salary;
    private Date hireDate;
    private List<Message> inbox;

    public Employee() {
        super();
        this.inbox = new ArrayList<>();
        this.hireDate = new Date();
    }

    // getters
    public double getSalary() { return salary; }
    public Date getHireDate() { return hireDate; }
    public List<Message> getInbox() { return inbox; }

    // setters
    public void setSalary(double salary) { this.salary = salary; }
    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }

    // send message to another employee
    public void sendMessage(Employee receiver, Message message) {
        receiver.inbox.add(message);
        System.out.println("Message sent: " + getFirstName() +
                " -> " + receiver.getFirstName());
    }


    public void getMessages() {
        if (inbox.isEmpty()) {
            System.out.println("No new messages.");
            return;
        }
        System.out.println("===== Inbox: " + getFirstName() + " =====");
        for (Message m : inbox) {
            System.out.println(m);
        }
    }

    // send tech support request
    public void callSupport(TechSupportRequest request) {
        System.out.println("Support request sent: " + request);
    }

    @Override
    public String toString() {
        return String.format("Employee[ %s %s | Salary: %.1f ]",
                getFirstName(), getLastName(), salary);
    }
}