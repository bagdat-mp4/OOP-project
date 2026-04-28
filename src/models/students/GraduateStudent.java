package src.models.students;

import src.exceptions.LowHIndexException;
import src.interfaces.Researcher;

import java.util.*;

public class GraduateStudent extends Student {

    private Researcher supervisor;
    private List<ResearchPaper> diplomaProjects;

    public GraduateStudent() {
        super();
        this.diplomaProjects = new ArrayList<>();
    }

    // getters
    public Researcher getSupervisor() { return supervisor; }
    public List<ResearchPaper> getDiplomaProjects() { return diplomaProjects; }


    public void setSupervisor(Researcher supervisor) throws LowHIndexException {
        if (supervisor.calculateHIndex() < 3) {
            throw new LowHIndexException(
                    "Supervisor must have h-index >= 3. " +
                            "Current h-index: " + (int) supervisor.calculateHIndex()
            );
        }
        this.supervisor = supervisor;
        System.out.println("Supervisor assigned: " + supervisor.toString());
    }


    public void addDiplomaProject(ResearchPaper paper) {
        diplomaProjects.add(paper);
        System.out.println("Diploma project added: " + paper.getTitle());
    }

    @Override
    public String toString() {
        return String.format("GraduateStudent[ %s %s | GPA: %.2f | Papers: %d ]",
                getFirstName(), getLastName(),
                getGpa(), diplomaProjects.size());
    }
}