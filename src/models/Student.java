package models;

import java.io.*;
import java.util.*;

public class Student extends User {
    public Student() {

    }

    private int yearOfStudy;

    private String major;

    private int currentCredits;

    private int failCount;

    private Map<Course, Mark> transcript;

    public void rateTeacher() {

    }

}