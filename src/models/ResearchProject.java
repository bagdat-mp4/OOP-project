package src.models;

import src.exceptions.NotAResearcherException;
import src.interfaces.Researcher;

import java.io.Serializable;
import java.util.*;

public class ResearchProject implements Serializable {

    private String topic;
    private List<Researcher> participants;
    private List<ResearchPaper> publishedPapers;

    public ResearchProject() {
        this.participants = new ArrayList<>();
        this.publishedPapers = new ArrayList<>();
    }

    public ResearchProject(String topic) {
        this.topic = topic;
        this.participants = new ArrayList<>();
        this.publishedPapers = new ArrayList<>();
    }

    // getters
    public String getTopic() { return topic; }
    public List<Researcher> getParticipants() { return participants; }
    public List<ResearchPaper> getPublishedPapers() { return publishedPapers; }

    // setters
    public void setTopic(String topic) { this.topic = topic; }

    // only Researcher can join — otherwise throw exception
    public void addParticipant(User user) throws NotAResearcherException {
        if (!(user instanceof Researcher)) {
            throw new NotAResearcherException(
                    user.getFirstName() + " " + user.getLastName() +
                            " is not a researcher and cannot join the project."
            );
        }
        Researcher researcher = (Researcher) user;
        if (!participants.contains(researcher)) {
            participants.add(researcher);
            System.out.println("Participant added: " +
                    user.getFirstName() + " -> " + topic);
        }
    }

    // add published paper to project
    public void addPaper(ResearchPaper paper) {
        if (!publishedPapers.contains(paper)) {
            publishedPapers.add(paper);
            System.out.println("Paper added to project: " + paper.getTitle());
        }
    }

    @Override
    public String toString() {
        return String.format("ResearchProject[ Topic: %s | Participants: %d | Papers: %d ]",
                topic, participants.size(), publishedPapers.size());
    }
}