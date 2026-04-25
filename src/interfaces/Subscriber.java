package src.interfaces;

import src.models.ResearchPaper;

import java.io.*;
import java.util.*;

/**
 * 
 */
public interface Subscriber {

    /**
     * @param journalName 
     * @param paper 
     * @return
     */
    public void update(String journalName, ResearchPaper paper);

}