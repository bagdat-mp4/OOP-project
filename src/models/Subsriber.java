package models;

import java.io.*;
import java.util.*;

/**
 * 
 */
public interface Subsriber {

    /**
     * @param journalName 
     * @param paper 
     * @return
     */
    public void update(String journalName, ResearcherPaper paper);

}