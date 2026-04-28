package src.models.students;

import java.io.Serializable;

public class Mark implements Serializable {

    private double firstAttestation;
    private double secondAttestation;
    private double finalExam;

    public Mark() {}

    public Mark(double firstAttestation, double secondAttestation, double finalExam) {
        this.firstAttestation = firstAttestation;
        this.secondAttestation = secondAttestation;
        this.finalExam = finalExam;
    }

    public double getFirstAttestation() { return firstAttestation; }
    public double getSecondAttestation() { return secondAttestation; }
    public double getFinalExam() { return finalExam; }

    public void setFirstAttestation(double v) { this.firstAttestation = v; }
    public void setSecondAttestation(double v) { this.secondAttestation = v; }
    public void setFinalExam(double v) { this.finalExam = v; }

    public double getTotal() {
        return firstAttestation + secondAttestation + finalExam;
    }

    public String getLetter() {
        double total = getTotal();
        if (total >= 95) return "A";
        else if (total >= 90) return "A-";
        else if (total >= 85) return "B+";
        else if (total >= 80) return "B";
        else if (total >= 75) return "B-";
        else if (total >= 70) return "C+";
        else if (total >= 65) return "C";
        else if (total >= 60) return "C-";
        else if (total >= 55) return "D+";
        else if (total >= 50) return "D";
        else return "F";
    }

    public boolean isPassed() {
        return getTotal() >= 50;
    }

    @Override
    public String toString() {
        return String.format("Mark[ 1st: %.1f | 2nd: %.1f | Final: %.1f | Total: %.1f | Grade: %s ]",
                firstAttestation, secondAttestation, finalExam, getTotal(), getLetter());
    }
}