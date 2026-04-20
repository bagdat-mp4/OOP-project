package models;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Journal {

    /**
     * Default constructor
     */
    public Journal() {
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private List<User> subscribers;

    /**
     * 
     */
    private List<ResearcherPaper> publishedPapers;



    /**
     * @param user 
     * @return
     */
    public void subscribe(User user) {
        // TODO implement here
        return null;
    }

    /**
     * @param user 
     * @return
     */
    public void unsubscribe(User user) {
        // TODO implement here
        return null;
    }

    /**
     * @param paper 
     * @return
     */
    public void publishPaper(ResearcherPaper paper) {
        // TODO implement here
        return null;
    }

    /**
     * @param paper 
     * @return
     */
    private void notifySubscribers(ResearcherPaper paper) {
        // TODO implement here
        return null;
    }

}