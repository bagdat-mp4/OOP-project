package src.models.employees;

import src.enums.RequestStatus;
import src.models.User;

import java.io.Serializable;
import java.util.Date;

public class TechSupportRequest implements Serializable {

    private User sender;
    private String issue;
    private RequestStatus status;
    private Date createdAt;

    public TechSupportRequest() {
        this.status = RequestStatus.NEW;
        this.createdAt = new Date();
    }

    public TechSupportRequest(User sender, String issue) {
        this.sender = sender;
        this.issue = issue;
        this.status = RequestStatus.NEW;
        this.createdAt = new Date();
    }

    public User getSender() { return sender; }
    public String getIssue() { return issue; }
    public RequestStatus getStatus() { return status; }
    public Date getCreatedAt() { return createdAt; }

    public void setSender(User sender) { this.sender = sender; }
    public void setIssue(String issue) { this.issue = issue; }

    public void setStatus(RequestStatus status) {
        this.status = status;
        System.out.println("Request status updated: " + status);
    }

    @Override
    public String toString() {
        return String.format("TechSupportRequest[ From: %s %s | Issue: %s | Status: %s ]",
                sender.getFirstName(), sender.getLastName(), issue, status);
    }
}