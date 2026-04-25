package src.models.students;

import src.models.User;
import src.models.employees.Teacher;

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
    public Course many;

    /**
     * 
     */
    public Mark many;

    /**
     * 
     */
    public StudentOrganization many;


    /**
     * @param teacher 
     * @param rating 
     * @return
     */
    public void rateTeacher(Teacher teacher, int rating) {
        // TODO implement here
        return null;
    }

    /**
     * @param course 
     * @return
     */
    public void registerForCourse(Course course) {
        // TODO implement here
        return null;
    }

}