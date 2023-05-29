import java.util.*;

public class faherenhit {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the celsius:");
        double celsius = read.nextDouble();

        double faherenhit = ((celsius * 9) / 5) + 32;

        System.out.println(faherenhit + " " + "faherenhit");
    }
}