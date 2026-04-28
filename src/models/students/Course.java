package src.models.students;

import src.enums.CourseType;
import src.models.employees.Teacher;

import java.io.Serializable;
import java.util.*;

public class Course implements Serializable {

    private static long idIncrement = 0;

    private Long id;
    private String courseCode;
    private String name;
    private int credits;
    private CourseType type;
    private int targetYear;
    private List<Teacher> lectureInstructors;
    private List<Teacher> practiceInstructors;
    private List<Student> enrolledStudents;

    public Course() {
        this.id = ++idIncrement;
        this.lectureInstructors = new ArrayList<>();
        this.practiceInstructors = new ArrayList<>();
        this.enrolledStudents = new ArrayList<>();
    }

    public Course(String courseCode, String name, int credits,
                  CourseType type, int targetYear) {
        this.id = ++idIncrement;
        this.courseCode = courseCode;
        this.name = name;
        this.credits = credits;
        this.type = type;
        this.targetYear = targetYear;
        this.lectureInstructors = new ArrayList<>();
        this.practiceInstructors = new ArrayList<>();
        this.enrolledStudents = new ArrayList<>();
    }

    public Long getId() { return id; }
    public String getCourseCode() { return courseCode; }
    public String getName() { return name; }
    public int getCredits() { return credits; }
    public CourseType getType() { return type; }
    public int getTargetYear() { return targetYear; }
    public List<Teacher> getLectureInstructors() { return lectureInstructors; }
    public List<Teacher> getPracticeInstructors() { return practiceInstructors; }
    public List<Student> getEnrolledStudents() { return enrolledStudents; }

    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    public void setName(String name) { this.name = name; }
    public void setCredits(int credits) { this.credits = credits; }
    public void setType(CourseType type) { this.type = type; }
    public void setTargetYear(int targetYear) { this.targetYear = targetYear; }

    public void addLectureInstructor(Teacher teacher) {
        if (!lectureInstructors.contains(teacher))
            lectureInstructors.add(teacher);
    }

    public void removeLectureInstructor(Teacher teacher) {
        lectureInstructors.remove(teacher);
    }

    public void addPracticeInstructor(Teacher teacher) {
        if (!practiceInstructors.contains(teacher))
            practiceInstructors.add(teacher);
    }

    public void removePracticeInstructor(Teacher teacher) {
        practiceInstructors.remove(teacher);
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student))
            enrolledStudents.add(student);
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;
        return Objects.equals(id, course.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return String.format("Course[ %s | %s | %d credits | Type: %s | Year: %d ]",
                courseCode, name, credits, type, targetYear);
    }
}