package src.comparators;

import src.models.ResearchPaper;
import java.util.Comparator;

public class DateComparator implements Comparator<ResearchPaper> {

    @Override
    public int compare(ResearchPaper p1, ResearchPaper p2) {
        return p2.getDatePublished().compareTo(p1.getDatePublished());
    }
}