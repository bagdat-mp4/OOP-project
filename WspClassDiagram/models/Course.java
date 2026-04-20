package models;

import enums.CourseType;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Course {

    /**
     * Default constructor
     */
    public Course() {
    }

    /**
     * 
     */
    private String courseCode;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private int credits;

    /**
     * 
     */
    private CourseType type;

    /**
     * 
     */
    private int targetYear;

    /**
     * 
     */
    private List<Teacher> lectureInstructors;

    /**
     * 
     */
    private List<Teacher> practiceInstructors;







}