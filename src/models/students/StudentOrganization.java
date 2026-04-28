package src.models.students;

import java.io.Serializable;
import java.util.*;

public class StudentOrganization implements Serializable {

    private String name;
    private Student head;
    private List<Student> members;

    public StudentOrganization() {
        this.members = new ArrayList<>();
    }

    public StudentOrganization(String name, Student head) {
        this.name = name;
        this.head = head;
        this.members = new ArrayList<>();
        this.members.add(head);
    }

    public String getName() { return name; }
    public Student getHead() { return head; }
    public List<Student> getMembers() { return members; }

    public void setName(String name) { this.name = name; }
    public void setHead(Student head) { this.head = head; }

    public void addMember(Student student) {
        if (!members.contains(student)) {
            members.add(student);
            System.out.println("Student added: " + student.getFirstName());
        } else {
            System.out.println("Student is already a member.");
        }
    }

    public void removeMember(Student student) {
        members.remove(student);
        System.out.println("Student removed: " + student.getFirstName());
    }

    @Override
    public String toString() {
        return String.format("StudentOrganization[ %s | Head: %s | Members: %d ]",
                name, head.getFirstName(), members.size());
    }
}