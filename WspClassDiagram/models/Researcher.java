package models;

import java.io.*;
import java.util.*;

/**
 * 
 */
public interface Researcher {




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