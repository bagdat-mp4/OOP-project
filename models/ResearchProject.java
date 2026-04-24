package models;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class ResearchProject {

    /**
     * Default constructor
     */
    public ResearchProject() {
    }

    /**
     * 
     */
    private String topic;

    /**
     * 
     */
    private List<Researcher> participants;

    /**
     * 
     */
    private List<ResearchPaper> publishedPapers;

    /**
     * 
     */
    public ResearcherDecorator many;

    /**
     * 
     */
    public Researcher many;


    /**
     * 
     */
    public ResearchPaper many;


    /**
     * @param user 
     * @return
     */
    public void throws NotAResearcherException addParticipant(User user) {
        // TODO implement here
        return null;
    }

}