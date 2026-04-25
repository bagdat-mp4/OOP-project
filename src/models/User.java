package src.models;

import src.enums.Language;
import src.interfaces.Subscriber;

/**
 * 
 */
public abstract class User implements Subscriber {

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
    private String email;





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
     * @return
     */
    public void update(String journalName, ResearchPaper paper) {
        // TODO implement here
        return null;
    }

    /**
     * @param journalName 
     * @param paper 
     * @return
     */
    public void update(String journalName, ResearchPaper paper) {
        // TODO implement Subscriber.update() here
        return null;
    }

}