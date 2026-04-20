package models;

import enums.Language;

import java.io.*;
import java.util.*;

public abstract class User implements Subsriber {

    public User(long id, String login, String firstName, String lastName, Language language, boolean isLogged) {
        this.id = id;
        this.login = login;
        this.password =
    }

    private long id;

    private String login;

    private String password;

    private String firstName;

    private String lastName;

    private Language language;

    private boolean isLogged;

    private String encryptPassword(String password) {

    }



    public boolean equals(Object o) {
        return false;
    }


    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "";
    }

    public boolean login(String login, String Password) {
        return false;
    }

    public void update(String journalName, ResearcherPaper paper) {
    }

    public void update(String journalName, ResearcherPaper paper) {
        return null;
    }

}