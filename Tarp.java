import java.util.ArrayList;

public class Tarp {
    private final double t;
    private final double length; 
    private int counter = 0;
    private ArrayList<Needle> needles = new ArrayList<Needle>();
    private Tarp tarp;
    // A tarp takes a length for its t - its width, and for the length of the needles in the tarp. 
    public Tarp(double t, double length) {
        this.t = t;
        this.length = length;
    }
    // Returns to the user the number of crossings or overlaps of needles over the line. 
    public int numberOfCrossings() {
        for (int i = 0; i < needles.size(); i++) {
            if (needles.get(i).leftTip() == 0.0 || needles.get(i).leftTip() < 0.0) {
                counter++;
            } else if (needles.get(i).rightTip() == 0.0 || needles.get(i).rightTip() < 0.0) {
                counter++;
            } else if (needles.get(i).leftTip() == this.t || needles.get(i).leftTip() > this.t) {
                counter++;
            } else if (needles.get(i).rightTip() == this.t || needles.get(i).rightTip() > this.t) {
                counter++;
            }   
        }
        return counter;
    }
    // Returns to the user what fraction of the needles are crossing over the line. 
    public double fractionOfCrossings() {
        return needles.size() / numberOfCrossings() ;
    }
    // Adds a needle to the arraylist of a set length and on this tarp. 
    public void addNeedle() {
        needles.add(new Needle(this.length, tarp));
    }
}

