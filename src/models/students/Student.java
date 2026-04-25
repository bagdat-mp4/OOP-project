package src.models.students;

import src.models.User;
import src.models.employees.Teacher;

import java.util.*;

public class Student extends User {

    public Student() {
        super();
        this.failCount = 0;
    }

    private int yearOfStudy;
    private String major;
    private int currentCredits;
    private int failCount;
    private Map<Course, Mark> transcript;

    public int getYearOfStudy() {
        return this.yearOfStudy;
    }

    public String getMajor() {
        return this.major;
    }

    public int getCurrentCredits() {
        return this.currentCredits;
    }

    public int getFailCount() {
        return this.failCount;
    }

    public double getGpa() {
        double totalMark = 0;
        int count = 0;
        for (Mark mark: transcript.values()) {
            totalMark += mark.getTotal();
            count++;
        }
        return totalMark / count;
    }

    public void setYearOfStudy(int yearOfStudy){
        this.yearOfStudy = yearOfStudy;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public void addCredits(int credits) {
        this.currentCredits += credits;
    }
    public void addFailCount() {
        this.failCount++;
    }

    public void rateTeacher(Teacher teacher, int rating) {
        // TODO implement here
        return null;
    }

    public void registerForCourse(Course course) {
        // TODO implement here
        return null;
    }

}