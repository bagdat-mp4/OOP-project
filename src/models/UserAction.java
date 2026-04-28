package src.models;

import java.io.Serializable;
import java.util.Date;

public class UserAction implements Serializable {

    private long id;
    private Date timestamp;
    private User actor;
    private String actionDetails;

    public UserAction() {}

    public UserAction(User actor, String actionDetails) {
        this.actor = actor;
        this.actionDetails = actionDetails;
        this.timestamp = new Date();
    }

    public long getId() { return id; }
    public Date getTimestamp() { return timestamp; }
    public User getActor() { return actor; }
    public String getActionDetails() { return actionDetails; }

    public String getDetails() {
        return String.format("[%s] %s %s: %s",
                timestamp,
                actor.getFirstName(),
                actor.getLastName(),
                actionDetails);
    }
}