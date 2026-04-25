package src;

import src.models.*;
import src.models.employees.Message;
import src.models.employees.TechSupportRequest;
import src.models.employees.TechSupportSpecialist;
import src.models.students.Course;

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
     * 
     */
    private List<UserAction> logs;

    /**
     * 
     */
    private List<TechSupportRequest> techSupportRequests;

    /**
     * 
     */
    private List<ResearchProject> researchProjects;

    /**
     * 
     */
    private List<Message> messages;

    /**
     * 
     */
    public TechSupportSpecialist many;

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
     * @param action 
     * @return
     */
    public void addLog(UserAction action) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void printAllUniversityPapers() {
        // TODO implement here
        return null;
    }

}