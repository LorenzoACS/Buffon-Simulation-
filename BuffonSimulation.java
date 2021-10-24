import java.util.ArrayList;
import java.util.Scanner;

public class BuffonSimulation {
    public static Tarp tarp = new Tarp(400.0, 100.0);
    public static ArrayList<Needle> needles = new ArrayList<Needle>();
    public static boolean bool = true;
    public static int counter = 0;
    public static int max;
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        //System.out.println(test.angle());
        //System.out.println(test.center());
        //System.out.println(test.leftTip());
        //System.out.println(test.rightTip());
        System.out.println("Input how many needles you would like to drop.");
        max = scan.nextInt();
        for (int i = 0; i < max; i++) {
            needles.add(new Needle(100.0, tarp));
            //System.out.println(needles.size());
            //System.out.println(needles.get(i).leftTip() + " Left");
            //System.out.println(needles.get(i).rightTip() + " Right");
            if (needles.get(i).leftTip() == 0.0 || needles.get(i).leftTip() < 0.0) {
                counter++;
            } 
            if (needles.get(i).rightTip() == 0.0 || needles.get(i).rightTip() < 0.0) {
                counter++;
            } 
            if (needles.get(i).leftTip() == 400.0 || needles.get(i).leftTip() > 400.0) {
                counter++;
            } 
            if (needles.get(i).rightTip() == 400.0 || needles.get(i).rightTip() > 400.0) {
                counter++;
            }   
            if (needles.get(i).center() == 0.0 || needles.get(i).center() == 400.0){
                counter++;
            }
            if (i + 1 == max) {
                System.out.println("Number of needles crossing the line: " + counter);
                System.out.println("Total number of needles dropped: " + needles.size());
                System.out.print("Buffon Needle's Estimation of PI: " + needles.size() / (double) counter);
                //System.out.println(tarp.numberOfCrossings());
                //System.out.println(tarp.fractionOfCrossings());
                break;
            }
        }
    }
        //System.out.println(tarp.numberOfCrossings());
        //System.out.println(tarp.fractionOfCrossings());
              
}

