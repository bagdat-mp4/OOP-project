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
    private Long id;

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


    /**
     * 
     */
    public Teacher 1;

    /**
     * 
     */
    public Student 1;



    /**
     * @param teacher 
     * @return
     */
    public void addLectureInstructor(Teacher teacher) {
        // TODO implement here
        return null;
    }

    /**
     * @param teacher 
     * @return
     */
    public void removeLectureInstructor(Teacher teacher) {
        // TODO implement here
        return null;
    }

    /**
     * @param teacher 
     * @return
     */
    public void addPracticeInstructor(Teacher teacher) {
        // TODO implement here
        return null;
    }

    /**
     * @param teacher 
     * @return
     */
    public void removePracticeInstructor(Teacher teacher) {
        // TODO implement here
        return null;
    }

}