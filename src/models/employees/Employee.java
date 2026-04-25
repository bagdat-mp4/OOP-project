package src.models.employees;

import src.models.User;

import java.util.*;

/**
 * 
 */
public abstract class Employee extends User {

    /**
     * Default constructor
     */
    public Employee() {
    }

    /**
     * 
     */
    private double salary;

    /**
     * 
     */
    private Date hireDate;

    /**
     * 
     */
    private List<Message> inbox;

    /**
     * 
     */
    public TechSupportRequest many;


    /**
     * @param receiver 
     * @param message 
     * @return
     */
    public void sendMessage(Employee receiver, Message message) {
        // TODO implement here
        return null;
    }

    /**
     * @param request 
     * @return
     */
    public void callSupport(TechSupportRequest request) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void getMessages() {
        // TODO implement here
        return null;
    }

}