
import java.util.Scanner;

public class SumOfDeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any Degite : ");
        int num = input.nextInt();

        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int reminder = temp % 10;
            sum = sum + reminder;
            temp = temp / 10;
        }
        System.out.println("Sum of degite is : "+sum);
    }
}
