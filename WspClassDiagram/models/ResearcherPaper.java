package models;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class ResearcherPaper {

    /**
     * Default constructor
     */
    public ResearcherPaper() {
    }

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private String journal;

    /**
     * 
     */
    private String doi;

    /**
     * 
     */
    private int pages;

    /**
     * 
     */
    private int citations;

    /**
     * 
     */
    private Date datePublished;

    /**
     * 
     */
    private List<Researcher> authors;





    /**
     * @param format 
     * @return
     */
    public String getCitation(CitationFormat format) {
        // TODO implement here
        return "";
    }

}