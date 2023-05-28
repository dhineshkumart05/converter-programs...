import java.util.*;

public class cm {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Inches:");
        double inches = read.nextDouble();

        double cm = (inches * 2.54);

        System.out.println(cm + " " + "cm");
    }
}