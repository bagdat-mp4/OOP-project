package src.models;

import src.interfaces.Researcher;

import java.io.Serializable;
import java.util.*;


public class ResearcherDecorator implements Researcher, Serializable {

    private User originalUser;
    private List<ResearchPaper> papers;
    private List<ResearchProject> projects;

    public ResearcherDecorator() {
        this.papers = new ArrayList<>();
        this.projects = new ArrayList<>();
    }

    public ResearcherDecorator(User originalUser) {
        this.originalUser = originalUser;
        this.papers = new ArrayList<>();
        this.projects = new ArrayList<>();
    }


    public String getFirstName() { return originalUser.getFirstName(); }
    public String getLastName() { return originalUser.getLastName(); }
    public int getHIndex() { return (int) calculateHIndex(); }


    public User getOriginalUser() { return originalUser; }
    public List<ResearchPaper> getPapers() { return papers; }
    public List<ResearchProject> getProjects() { return projects; }


    public void addPaper(ResearchPaper paper) {
        papers.add(paper);
    }


    public void addProject(ResearchProject project) {
        projects.add(project);
    }


    @Override
    public double calculateHIndex() {
        if (papers.isEmpty()) return 0;


        List<Integer> citations = new ArrayList<>();
        for (ResearchPaper paper : papers) {
            citations.add(paper.getCitations());
        }
        citations.sort(Collections.reverseOrder());

        int h = 0;
        for (int i = 0; i < citations.size(); i++) {
            if (citations.get(i) >= i + 1) {
                h = i + 1;
            } else {
                break;
            }
        }
        return h;
    }


    @Override
    public void printPapers(Comparator<ResearchPaper> comparator) {
        List<ResearchPaper> sorted = new ArrayList<>(papers);
        sorted.sort(comparator);

        System.out.println("===== Papers: " + getFirstName() + " " + getLastName() + " =====");
        for (ResearchPaper paper : sorted) {
            System.out.println(paper);
        }
    }

    @Override
    public String toString() {
        return String.format("Researcher[ %s %s | H-index: %.0f | Papers: %d ]",
                getFirstName(), getLastName(), calculateHIndex(), papers.size());
    }
}