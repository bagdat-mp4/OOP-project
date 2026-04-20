package models;

import enums.Language;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class User implements Subsriber {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    private long id;

    /**
     * 
     */
    private String login;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String firstName;

    /**
     * 
     */
    private String lastName;

    /**
     * 
     */
    private Language language;

    /**
     * 
     */
    private boolean isLogged;





    /**
     * @param o 
     * @return
     */
    public boolean equals(Object o) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public int hashCode() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

    /**
     * @param login 
     * @param Password 
     * @return
     */
    public boolean login(String login, String Password) {
        // TODO implement here
        return false;
    }

    /**
     * @param journalName 
     * @param paper
     */
    public void update(String journalName, ResearcherPaper paper) {
        // TODO implement here
    }

    /**
     * @param journalName 
     * @param paper 
     * @return
     */
    public void update(String journalName, ResearcherPaper paper) {
        // TODO implement Subsriber.update() here
        return null;
    }

}