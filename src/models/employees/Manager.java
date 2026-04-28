package src.models.employees;

import src.DataStore;
import src.GlobalMessage;
import src.enums.ManagerType;
import src.models.*;
import src.models.students.Course;
import src.models.students.Student;

import java.util.*;

public class Manager extends Employee {

    private ManagerType type;

    public Manager() {
        super();
    }

    // getters
    public ManagerType getType() { return type; }

    // setters
    public void setType(ManagerType type) { this.type = type; }


    public void assignCourse(Course course, Teacher teacher) {
        teacher.addCourse(course);
        course.addLectureInstructor(teacher);
        System.out.println("Course assigned: " + teacher.getFirstName() +
                " -> " + course.getName());
    }


    public void approveRegistration(Student student, Course course) {
        if (!course.getEnrolledStudents().contains(student)) {
            course.enrollStudent(student);
            System.out.println("Registration approved: " +
                    student.getFirstName() + " -> " + course.getName());
        } else {
            System.out.println("Student already enrolled in this course.");
        }
    }


    public void createStatisticalRecord() {
        List<User> users = DataStore.getInstance().getUsers();
        System.out.println("===== Academic Performance Statistics =====");
        for (User user : users) {
            if (user instanceof Student student) {
                System.out.printf("Student: %s %s | GPA: %.2f | Credits: %d%n",
                        student.getFirstName(),
                        student.getLastName(),
                        student.getGpa(),
                        student.getCurrentCredits());
            }
        }
    }


    public void viewRequests() {
        System.out.println("===== Tech Support Requests =====");
        var requests = DataStore.getInstance().getTechSupportRequests();
        if (requests.isEmpty()) {
            System.out.println("No requests.");
            return;
        }
        for (var request : requests) {
            System.out.println(request);
        }
    }


    public void generateTopResearcherNews() {
        List<ResearchProject> projects = DataStore.getInstance().getResearchProjects();
        ResearcherDecorator topResearcher = null;
        int maxHIndex = 0;

        for (ResearchProject project : projects) {
            for (src.interfaces.Researcher researcher : project.getParticipants()) {
                if (researcher instanceof ResearcherDecorator rd) {
                    if (rd.getHIndex() > maxHIndex) {
                        maxHIndex = rd.getHIndex();
                        topResearcher = rd;
                    }
                }
            }
        }

        if (topResearcher != null) {
            News news = new News(
                    "Research",
                    "Top researcher: " + topResearcher.getFirstName() +
                            " " + topResearcher.getLastName() +
                            " | H-index: " + topResearcher.getHIndex(),
                    true
            );
            DataStore.getInstance().addNews(news);
            System.out.println("News created: " + news);
        } else {
            System.out.println("No researchers found.");
        }
    }


    public void sendGlobalMessage(GlobalMessage message) {
        System.out.println("Global message from manager: " + message);
    }


    public ResearcherDecorator makeResearcher(User user) {
        ResearcherDecorator researcher = new ResearcherDecorator(user);
        System.out.println("User is now a researcher: " + user.getFirstName());
        return researcher;
    }

    @Override
    public String toString() {
        return String.format("Manager[ %s %s | Type: %s ]",
                getFirstName(), getLastName(), type);
    }
}