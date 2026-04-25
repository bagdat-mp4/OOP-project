package src.interfaces;

import src.models.ResearchPaper;
import src.models.ResearchProject;

import java.io.*;
import java.util.*;

/**
 * 
 */
public interface Researcher {


    /**
     * 
     */
    public ResearchPaper many;

    /**
     * 
     */
    public ResearchProject 1;

    /**
     * @return
     */
    public double calculateHIndex();

    /**
     * @param comparator 
     * @return
     */
    public void printPapers(Comparator comparator);

    /**
     * @return
     */
    public List<ResearcherPaper> getPapers();

}