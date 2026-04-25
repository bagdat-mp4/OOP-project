package src.models.students;

import src.interfaces.Researcher;
import src.models.ResearchPaper;

import java.util.*;

/**
 * 
 */
public class GraduateStudent extends Student {

    /**
     * Default constructor
     */
    public GraduateStudent() {
    }

    /**
     * 
     */
    private Researcher supervisor;

    /**
     * 
     */
    private List<ResearchPaper> diplomaProjects;



    /**
     * @param supervisor 
     * @return
     */
    public void throws LowHIndexException setSupervisor(Researcher supervisor) {
        // TODO implement here
        return null;
    }

}