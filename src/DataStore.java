package src;

import src.models.*;
import src.models.employees.Message;
import src.models.employees.TechSupportRequest;
import src.models.students.Course;

import java.io.*;
import java.util.*;

public class DataStore implements Serializable {

    private static final String FILE_PATH = "datastore.ser";
    private static DataStore instance;

    private List<User> users;
    private List<Course> courses;
    private List<Journal> journals;
    private List<News> news;
    private List<UserAction> logs;
    private List<TechSupportRequest> techSupportRequests;
    private List<ResearchProject> researchProjects;
    private List<Message> messages;

    private DataStore() {
        this.users = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.journals = new ArrayList<>();
        this.news = new ArrayList<>();
        this.logs = new ArrayList<>();
        this.techSupportRequests = new ArrayList<>();
        this.researchProjects = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public static DataStore getInstance() {
        if (instance == null) {
            instance = new DataStore();
        }
        return instance;
    }

    public List<User> getUsers() { return users; }
    public List<Course> getCourses() { return courses; }
    public List<Journal> getJournals() { return journals; }
    public List<News> getNews() { return news; }
    public List<UserAction> getLogs() { return logs; }
    public List<TechSupportRequest> getTechSupportRequests() { return techSupportRequests; }
    public List<ResearchProject> getResearchProjects() { return researchProjects; }
    public List<Message> getMessages() { return messages; }

    public void addUser(User user) { users.add(user); }
    public void removeUser(User user) { users.remove(user); }
    public void addCourse(Course course) { courses.add(course); }
    public void removeCourse(Course course) { courses.remove(course); }
    public void addNews(News n) { news.add(n); }
    public void addLog(UserAction action) { logs.add(action); }
    public void addTechSupportRequest(TechSupportRequest request) { techSupportRequests.add(request); }
    public void addResearchProject(ResearchProject project) { researchProjects.add(project); }

    public void save() {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(FILE_PATH))) {
            oos.writeObject(this);
            System.out.println("Data saved.");
        } catch (IOException e) {
            System.out.println("Error saving: " + e.getMessage());
        }
    }

    public void load() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            System.out.println("No saved data. Starting fresh.");
            return;
        }
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(FILE_PATH))) {
            DataStore loaded = (DataStore) ois.readObject();
            this.users = loaded.users;
            this.courses = loaded.courses;
            this.journals = loaded.journals;
            this.news = loaded.news;
            this.logs = loaded.logs;
            this.techSupportRequests = loaded.techSupportRequests;
            this.researchProjects = loaded.researchProjects;
            this.messages = loaded.messages;
            System.out.println("Data loaded.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading: " + e.getMessage());
        }
    }

    public void addLog(UserAction action) { logs.add(action); }

    public void printAllUniversityPapers() {
        System.out.println("===== All University Papers =====");
        for (ResearchProject project : researchProjects) {
            for (ResearchPaper paper : project.getPublishedPapers()) {
                System.out.println(paper);
            }
        }
    }
}