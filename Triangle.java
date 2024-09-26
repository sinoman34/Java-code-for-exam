
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double area , a, b, c, s;

        Scanner input = new Scanner(System.in);
        //input tree tarms from user.
        System.out.print("Enter 1st tarms of triangle: ");
        a = input.nextDouble();
        System.out.print("Enter 2nd tarms of triangle: ");
        b = input.nextDouble();
        System.out.print("Enter 3rd tarms of triangle: ");
        c = input.nextDouble();

        if ((a + b) > c && (b + c) > a && (c + a) > b) {
            s = (a + b + c) / 2;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("The area of triangle is: "+area);
        }
        else {
            System.out.println("Triangle is not possible.");
        }
    }
}
