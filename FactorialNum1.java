
import java.util.Scanner;

public class FactorialNum1 {
    public static void main(String[] args) {
        int i,num;
        int fact = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Integer Number: ");
        num = input.nextInt();

        for (i = num; i >= 1; i--){
            fact = fact*i;
        }
        System.out.println("Factorial value of "+num+" is :"+fact);
    }
}
