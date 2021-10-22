import java.util.Random;
public class Needle {
    public static int numberOfNeedles; 
    private final double length;
    private final double position;
    private final double angle;
    private final Tarp tarp; 
    private double d; 
    private double min = -Math.PI;
    private double max = Math.PI/2.0;
    
    public Needle(double length, double position, double angle, Tarp tarp) {
        this.length = length;
        this.position = position;
        this.angle = angle;
        this.tarp = tarp; 
    }
    // Make a needle of length "length" randomly on the tarp, and create a random angle for that needle.
    public Needle(double length, Tarp tarp) {
        this.length = length;
        this.tarp = tarp;
        position = Math.random() * 400 + 1;
        angle = Math.random() * min + max;
    }
    // Return the location of the center.
    public double center() {
        return this.position;
    }
    // Return the left tip or point of the needle.
    public double leftTip() {
        d = (this.length / 2) / Math.cos(this.angle);
        return this.position - d; 
    }
    // Return the right tip or point of the needle. 
    public double rightTip() {
        d = (this.length / 2) / Math.cos(this.angle);
        return this.position + d;
    }
    // Return the random angle of this needle. 
    public double angle() {
        return this.angle;
    }
}
