package models;

import java.io.*;
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
     * @param receiver 
     * @param message 
     * @return
     */
    public void sendMessage(Employee receiver, Message message) {
        // TODO implement here
        return null;
    }

}