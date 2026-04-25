package src.models;

import src.interfaces.Subscriber;

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
    private List<Subscriber> subscribers;

    /**
     * 
     */
    private List<ResearchPaper> publishedPapers;

    /**
     * 
     */
    public ResearchPaper many;


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
    public void publishPaper(ResearchPaper paper) {
        // TODO implement here
        return null;
    }

    /**
     * @param paper 
     * @return
     */
    private void notifySubscribers(ResearchPaper paper) {
        // TODO implement here
        return null;
    }

}