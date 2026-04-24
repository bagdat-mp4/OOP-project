package models;

import enums.ManagerType;
import GlobalMessage;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Manager extends Employee {

    /**
     * Default constructor
     */
    public Manager() {
    }

    /**
     * 
     */
    private ManagerType type;





    /**
     * @param course 
     * @param teacher 
     * @return
     */
    public void assignCourse(Course course, Teacher teacher) {
        // TODO implement here
        return null;
    }

    /**
     * @param student 
     * @param course 
     * @return
     */
    public void approveRegistration(Student student, Course course) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void createStatisticalRecord() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void viewRequests() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void generateTopResearcherNews() {
        // TODO implement here
        return null;
    }

    /**
     * @param message 
     * @return
     */
    public void sendGlobalMessage(GlobalMessage message) {
        // TODO implement here
        return null;
    }

    /**
     * @param user 
     * @return
     */
    public ResearcherDecorator makeResearcher(User user) {
        // TODO implement here
        return null;
    }

}