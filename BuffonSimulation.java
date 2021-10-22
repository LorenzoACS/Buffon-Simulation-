import java.util.ArrayList;

public class BuffonSimulation {
    public static Tarp tarp = new Tarp(400.0, 100.0);
    public static ArrayList<Needle> needles;
    public static Needle test = new Needle(100.0, tarp);
    
    public static void main(String[] args) {
        System.out.println(test.angle());
        System.out.println(test.center());
        System.out.println(test.leftTip());
        System.out.println(test.rightTip());
    }
}
