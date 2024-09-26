import java.util.Scanner;

public class Quadratic 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // take 3 input from user-->
        System.out.print("a = ");
        double a = input.nextInt();
        System.out.print("b = ");
        double b = input.nextInt();
        System.out.print("c = ");
        double c = input.nextInt();

        double d = (b * b) - (4 * a * c);
        
        if (d > 0){
            double x1 = (-b + Math.sqrt(d)) / 2 * a;
            double x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("Roots are X1 = "+x1 + "  X2 = "+x2);
        }
        else if (d == 0){
            double x = -b / 2 * a;
            System.out.println("Root is X = "+x);
        }
        else {
            System.out.println("Roots are not possible");
        }
    }
}