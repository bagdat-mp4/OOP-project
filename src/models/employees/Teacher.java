package src.models.employees;

import src.enums.TeacherTitle;
import src.enums.UrgencyLevel;
import src.models.students.Course;
import src.models.students.Mark;
import src.models.students.Student;

import java.util.*;

public class Teacher extends Employee {

    private TeacherTitle title;
    private List<Course> activeCourses;
    private List<Double> ratings; // Double — үлкен әріппен!

    public Teacher() {
        super();
        this.activeCourses = new ArrayList<>();
        this.ratings = new ArrayList<>();
    }


    public TeacherTitle getTitle() { return title; }
    public List<Course> getActiveCourses() { return activeCourses; }
    public List<Double> getRatings() { return ratings; }


    public void setTitle(TeacherTitle title) { this.title = title; }


    public void addCourse(Course course) {
        if (!activeCourses.contains(course))
            activeCourses.add(course);
    }

    public void removeCourse(Course course) {
        activeCourses.remove(course);
    }


    public void addRating(double rating) {
        ratings.add(rating);
    }


    public double calculateRating() {
        if (ratings.isEmpty()) return 0.0;
        double sum = 0;
        for (double r : ratings) sum += r;
        return sum / ratings.size();
    }


    public void putMark(Student student, Course course, Mark mark) {
        if (!course.getEnrolledStudents().contains(student)) {
            System.out.println("Student is not enrolled in this course.");
            return;
        }
        student.addMark(course, mark);
        System.out.println("Mark set: " + student.getFirstName() +
                " -> " + course.getName() + " -> " + mark);
    }


    public void setComplaint(Student student, UrgencyLevel level) {
        System.out.printf("[COMPLAINT] Teacher: %s | Student: %s | Level: %s%n",
                getFirstName(), student.getFirstName(), level);
    }

    @Override
    public String toString() {
        return String.format("Teacher[ %s %s | Title: %s | Courses: %d | Rating: %.1f ]",
                getFirstName(), getLastName(), title,
                activeCourses.size(), calculateRating());
    }
}