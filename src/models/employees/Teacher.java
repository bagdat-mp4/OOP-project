package src.models.employees;

import src.enums.TeacherTitle;
import src.models.students.Course;
import src.models.students.Mark;
import src.models.students.Student;

import java.util.*;

/**
 * 
 */
public class Teacher extends Employee {

    /**
     * Default constructor
     */
    public Teacher() {
    }

    /**
     * 
     */
    private TeacherTitle title;

    /**
     * 
     */
    private List<Course> activeCourses;

    /**
     * 
     */
    private List<double> ratings;



    /**
     * 
     */
    public Course many;

    /**
     * @param student 
     * @param course 
     * @param mark 
     * @return
     */
    public void putMark(Student student, Course course, Mark mark) {
        // TODO implement here
        return null;
    }

    /**
     * @param student 
     * @param level 
     * @return
     */
    public void setComplaint(Student student, UrgencyLevel level) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void calculateRating() {
        // TODO implement here
        return null;
    }

}