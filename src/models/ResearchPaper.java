package src.models;

import src.enums.CitationFormat;
import src.interfaces.Researcher;

import java.io.Serializable;
import java.util.*;

public class ResearchPaper implements Serializable {

    private String title;
    private String journal;
    private String doi;
    private int pages;
    private int citations;
    private Date datePublished;
    private List<Researcher> authors;

    public ResearchPaper() {
        this.authors = new ArrayList<>();
    }

    public ResearchPaper(String title, String journal, String doi,
                         int pages, Date datePublished) {
        this.title = title;
        this.journal = journal;
        this.doi = doi;
        this.pages = pages;
        this.datePublished = datePublished;
        this.citations = 0;
        this.authors = new ArrayList<>();
    }

    // getters
    public String getTitle() { return title; }
    public String getName() { return title; }
    public String getJournal() { return journal; }
    public String getDoi() { return doi; }
    public int getPages() { return pages; }
    public int getCitations() { return citations; }
    public Date getDatePublished() { return datePublished; }
    public List<Researcher> getAuthors() { return authors; }

    // setters
    public void setTitle(String title) { this.title = title; }
    public void setJournal(String journal) { this.journal = journal; }
    public void setDoi(String doi) { this.doi = doi; }
    public void setPages(int pages) { this.pages = pages; }
    public void setCitations(int citations) { this.citations = citations; }
    public void setDatePublished(Date datePublished) { this.datePublished = datePublished; }


    public void addAuthor(Researcher researcher) {
        if (!authors.contains(researcher))
            authors.add(researcher);
    }


    public void addCitation() {
        this.citations++;
    }


    public String getCitation(CitationFormat format) {
        if (format == CitationFormat.PLAIN_TEXT) {
            return String.format("%s. \"%s\". %s. DOI: %s. Pages: %d.",
                    authorsToString(), title, journal, doi, pages);
        } else if (format == CitationFormat.BIBTEX) {
            return String.format(
                    "@article{%s,\n  title={%s},\n  journal={%s},\n  doi={%s},\n  pages={%d}\n}",
                    doi, title, journal, doi, pages);
        }
        return "";
    }

    private String authorsToString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < authors.size(); i++) {
            sb.append(authors.get(i).toString());
            if (i < authors.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("ResearchPaper[ \"%s\" | Journal: %s | Citations: %d | Pages: %d ]",
                title, journal, citations, pages);
    }
}