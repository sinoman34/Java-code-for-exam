
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input redius
        System.out.print("Enter radius : ");
        double r = input.nextInt();

        double area = Math.PI * r * r;
        //show output
        System.out.println("The area of circle is : "+area);

    }
}
