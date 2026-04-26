package src.models.students;

import src.models.User;
import src.models.employees.Teacher;

import java.security.NoSuchAlgorithmException;
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
    private Map<Course, Mark> transcript = new HashMap<>();
    private boolean isBlocked = false;

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
        if(transcript.isEmpty())
            return 0.0;

        double totalMark = 0;
        for (Mark mark: transcript.values()) {
            totalMark += mark.getTotal();
        }
        return totalMark / transcript.size();
    }
    public boolean isBlocked() {
        return this.isBlocked;
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
        if(this.failCount >= 3) {
            this.setBlocked();
        }
    }
    public void setBlocked() {
        this.isBlocked = true;
    }

    public void rateTeacher(Teacher teacher, int rating) {
        // TODO implement here
    }

    public void registerForCourse(Course course) {
        // TODO implement here
    }

    @Override
    public boolean login(String password) throws NoSuchAlgorithmException {
        if (this.isBlocked) {
            System.out.println("Access denied: Your account is blocked.");
            return false;
        }

        return super.login(password);
    }

}