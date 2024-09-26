import java.util.Scanner;
public class TringleArea {
    public static void main(String[] args) {
        double s, a, b, c;

        Scanner input = new Scanner(System.in);
        // take 3 input from user-->
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.print("c = ");
        c = input.nextInt();
        
        s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The Area of Tringle is : "+area);
    }   
}
