package src.models;

import src.interfaces.Subscriber;

import java.io.Serializable;
import java.util.*;

public class Journal implements Serializable {

    private String name;
    private List<Subscriber> subscribers;
    private List<ResearchPaper> publishedPapers;

    public Journal() {
        this.subscribers = new ArrayList<>();
        this.publishedPapers = new ArrayList<>();
    }

    public Journal(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
        this.publishedPapers = new ArrayList<>();
    }

    public String getName() { return name; }
    public List<Subscriber> getSubscribers() { return subscribers; }
    public List<ResearchPaper> getPublishedPapers() { return publishedPapers; }

    public void setName(String name) { this.name = name; }

    public void subscribe(User user) {
        if (!subscribers.contains(user)) {
            subscribers.add(user);
            System.out.println(user.getFirstName() + " subscribed to: " + name);
        } else {
            System.out.println("Already subscribed to this journal.");
        }
    }

    public void unsubscribe(User user) {
        subscribers.remove(user);
        System.out.println(user.getFirstName() + " unsubscribed from: " + name);
    }

    public void publishPaper(ResearchPaper paper) {
        publishedPapers.add(paper);
        System.out.println("New paper in \"" + name + "\": " + paper.getTitle());
        notifySubscribers(paper);
    }

    private void notifySubscribers(ResearchPaper paper) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(name, paper);
        }
    }

    @Override
    public String toString() {
        return String.format("Journal[ %s | Papers: %d | Subscribers: %d ]",
                name, publishedPapers.size(), subscribers.size());
    }
}