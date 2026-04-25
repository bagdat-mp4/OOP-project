package src.models;

import src.enums.Language;
import src.interfaces.Subscriber;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Objects;

public abstract class User implements Subscriber {

    private static long idIncrement = 0;

    public User() {
        this.id = ++idIncrement;
    }
    private long id;
    private boolean isLoggedIn = false;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private Language language;
    private String email;
    public long getId() {
        return this.id;
    }

    public String getLogin() {
        return this.login;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public Language getLanguage() {
        return this.language;
    }
    public String getEmail() {
        return this.email;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setLanguage(Language language) {
        this.language = language;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) throws NoSuchAlgorithmException {
        this.password = encodePassword(password);
    }

    public boolean equals(Object o) {
        if(o == this)
            return true;

        if(!(o instanceof User user))
            return false;

        return this.id == user.getId() && Objects.equals(user.getEmail(), this.email);
    }
    public int hashCode() {
        return Objects.hash(id, email);
    }

    public String toString() {
        return String.format("User[ id: %d, email: %s, firstName: %s, lastName: %s ]", this.id, this.email, this.firstName, this.lastName);
    }

    public boolean login(String password) throws NoSuchAlgorithmException {
        if(this.password.equals(encodePassword(password))) {
            isLoggedIn = true;
            return true;
        }
        return false;
    }

    public void update(String journalName, ResearchPaper paper) {
        // TODO implement Subscriber.update() here
    }

    private String encodePassword(String password) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(hash);
    }


}