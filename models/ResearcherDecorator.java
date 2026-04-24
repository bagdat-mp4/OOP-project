package models;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class ResearcherDecorator implements Researcher {

    /**
     * Default constructor
     */
    public ResearcherDecorator() {
    }

    /**
     * 
     */
    private User originalUser;

    /**
     * 
     */
    private List<ResearchPaper> papers;

    /**
     * 
     */
    private List<ResearchProject> projects;



    /**
     * 
     */
    public ResearchProject 1;

    /**
     * @return
     */
    public double calculateHIndex() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param comparator 
     * @return
     */
    public void printPapers(Comparator comparator) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<ResearcherPaper> getPapers() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public double calculateHIndex() {
        // TODO implement Researcher.calculateHIndex() here
        return 0.0d;
    }

    /**
     * @param comparator 
     * @return
     */
    public void printPapers(Comparator comparator) {
        // TODO implement Researcher.printPapers() here
        return null;
    }

    /**
     * @return
     */
    public List<ResearcherPaper> getPapers() {
        // TODO implement Researcher.getPapers() here
        return null;
    }

}