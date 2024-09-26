import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int fibo;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of you want fibo series: ");
        int n = input.nextInt();

        int frist_num = 0;
        int secound_num = 1;
        System.out.print(frist_num +" "+ secound_num);

        for (int i = 3; i <= n; i++){
            fibo = frist_num + secound_num;
            System.out.print(" "+fibo);
            frist_num = secound_num;
            secound_num = fibo;
        }
    }

}
