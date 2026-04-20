package models;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Student extends User {

    /**
     * Default constructor
     */
    public Student() {
    }

    /**
     * 
     */
    private int yearOfStudy;

    /**
     * 
     */
    private String major;

    /**
     * 
     */
    private int currentCredits;

    /**
     * 
     */
    private int failCount;

    /**
     * 
     */
    private Map<Course, Mark> transcript;



    /**
     * 
     */
    public void rateTeacher() {
        // TODO implement here
    }

}