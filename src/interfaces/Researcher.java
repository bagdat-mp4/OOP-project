package src.interfaces;

import src.models.ResearchPaper;
import java.util.*;

public interface Researcher {
    double calculateHIndex();
    void printPapers(Comparator<ResearchPaper> comparator);
    List<ResearchPaper> getPapers();
}