import java.util.Scanner;

public class ChackPrimeNum {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any integer number: ");
        int num = input.nextInt();

        int count = 0;
        if (num <= 2){
            System.out.println("Not prime number");
        }
        else {
            for (int i=2; i < num; i++){
                if (num % i ==0){
                    count++;
                    break;
                }
            }
            if (count ==0){
                System.out.println("Prime number.");
            }
            else{
                System.out.println("Not prime number.");
            }
        }
        
    }

}
