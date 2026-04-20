
import models.Researcher;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class DataStore {

    /**
     * Default constructor
     */
    public DataStore() {
    }

    /**
     * 
     */
    private static DataStore instance;

    /**
     * 
     */
    private List<User> users;

    /**
     * 
     */
    private List<Course> courses;

    /**
     * 
     */
    private List<Journal> journals;

    /**
     * 
     */
    private List<News> news;

    /**
     * @return
     */
    public DataStore getInstance() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void save() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void load() {
        // TODO implement here
        return null;
    }

    /**
     * @param year 
     * @return
     */
    public Researcher getTopCitiedResearcher(int year) {
        // TODO implement here
        return null;
    }

    /**
     * @param school 
     * @return
     */
    public Researcher getTopCitiedResearcher(String school) {
        // TODO implement here
        return null;
    }

}