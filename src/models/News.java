package src.models;

import src.models.employees.Comment;

import java.io.Serializable;
import java.util.*;

public class News implements Serializable {

    private String topic;
    private String content;
    private boolean isPinned;
    private List<Comment> comments;
    private Date dateCreated;

    public News() {
        this.comments = new ArrayList<>();
        this.dateCreated = new Date();
    }

    public News(String topic, String content, boolean isPinned) {
        this.topic = topic;
        this.content = content;
        this.isPinned = isPinned || topic.equalsIgnoreCase("Research");
        this.comments = new ArrayList<>();
        this.dateCreated = new Date();
    }

    public String getTopic() { return topic; }
    public String getContent() { return content; }
    public boolean isPinned() { return isPinned; }
    public List<Comment> getComments() { return comments; }
    public Date getDateCreated() { return dateCreated; }

    public void setTopic(String topic) { this.topic = topic; }
    public void setContent(String content) { this.content = content; }
    public void setPinned(boolean pinned) { isPinned = pinned; }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        return String.format("News[ %s%s | %s ]",
                isPinned ? "[PINNED] " : "", topic, content);
    }
}