import java.util.*;

public class inches {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the cm:");
        double a = read.nextDouble();

        double b = (a / 2.54);

        System.out.println(b + " " + "Inches");
    }
}