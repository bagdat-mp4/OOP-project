package src.models.students;

import src.models.User;
import src.models.employees.Teacher;

import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Student extends User {

    private int yearOfStudy;
    private String major;
    private int currentCredits;
    private int failCount;
    private Map<Course, Mark> transcript = new HashMap<>();
    private boolean isBlocked = false;

    public Student() {
        super();
        this.failCount = 0;
        this.currentCredits = 0;
    }

    public int getYearOfStudy() { return this.yearOfStudy; }
    public String getMajor() { return this.major; }
    public int getCurrentCredits() { return this.currentCredits; }
    public int getFailCount() { return this.failCount; }
    public Map<Course, Mark> getTranscript() { return this.transcript; }
    public boolean isBlocked() { return this.isBlocked; }

    public void setYearOfStudy(int yearOfStudy) { this.yearOfStudy = yearOfStudy; }
    public void setMajor(String major) { this.major = major; }

    public double getGpa() {
        if (transcript.isEmpty()) return 0.0;
        double totalMark = 0;
        for (Mark mark : transcript.values()) {
            totalMark += mark.getTotal();
        }
        return totalMark / transcript.size();
    }

    public void addCredits(int credits) {
        this.currentCredits += credits;
    }

    public void addFailCount() {
        this.failCount++;
        if (this.failCount >= 3) {
            this.setBlocked();
        }
    }

    public void setBlocked() {
        this.isBlocked = true;
    }


    public void rateTeacher(Teacher teacher, int rating) {
        if (rating < 1 || rating > 5) {
            System.out.println("Rating must be between 1 and 5");
            return;
        }
        teacher.addRating(rating);
        System.out.println("Rating " + rating + " given to: " + teacher.getFirstName());
    }


    public void registerForCourse(Course course) {
        if (isBlocked) {
            System.out.println("Access denied: Your account is blocked.");
            return;
        }
        if (currentCredits + course.getCredits() > 21) {
            System.out.println("Credit limit exceeded! Max: 21, Current: " + currentCredits);
            return;
        }
        if (transcript.containsKey(course)) {
            System.out.println("Already registered for: " + course.getName());
            return;
        }
        transcript.put(course, new Mark());
        currentCredits += course.getCredits();
        course.enrollStudent(this);
        System.out.println("Successfully registered for: " + course.getName());
    }


    public void addMark(Course course, Mark mark) {
        transcript.put(course, mark);
        if (!mark.isPassed()) {
            addFailCount();
        }
    }


    public void printTranscript() {
        System.out.println("===== Transcript: " + getFirstName() + " " + getLastName() + " =====");
        for (Map.Entry<Course, Mark> entry : transcript.entrySet()) {
            System.out.println(entry.getKey().getName() + " -> " + entry.getValue());
        }
        System.out.println("GPA: " + String.format("%.2f", getGpa()));
    }

    @Override
    public boolean login(String password) throws NoSuchAlgorithmException {
        if (this.isBlocked) {
            System.out.println("Access denied: Your account is blocked.");
            return false;
        }
        return super.login(password);
    }

    @Override
    public String toString() {
        return String.format("Student[ %s %s | Major: %s | Year: %d | Credits: %d | GPA: %.2f ]",
                getFirstName(), getLastName(), major, yearOfStudy, currentCredits, getGpa());
    }
}