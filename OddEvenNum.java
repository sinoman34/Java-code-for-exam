
import java.util.Scanner;

class Num{
    int i,n;

    Num(int starting, int Ending){
        i = starting;
        n = Ending;
    }
    void evenNum(){
        System.out.println("Even number:");
        for (int j = i; j <= n; j++){
            if (j % 2 == 0){
                System.out.println(j);
            }
        }
    }
    void oddNum(){
        System.out.println("Odd number:");
        for (int j = i; j <= n; j++){
            if (j % 2 != 0){
                System.out.println(j);
            }
        }
    }

}

public class OddEvenNum {
    public static void main(String[] args) {
        // Input number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting value: ");
        int i = input.nextInt();
        System.out.print("Enter Ending value: ");
        int n = input.nextInt();

        // display user input
        Num num = new Num(i, n);
        num.evenNum();
        num.oddNum();
        
        //dispaly caling
        Num nm = new Num(1, 20);
        nm.oddNum();

    }

    
}
