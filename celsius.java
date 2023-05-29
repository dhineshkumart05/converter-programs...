import java.util.*;

public class celsius {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the celsius:");
        double faherenhit = read.nextDouble();

        double celsius = ((faherenhit-32)*5)/9;

        System.out.println(celsius + " " + "celsius");
    }
}