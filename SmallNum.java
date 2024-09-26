import java.util.Scanner;

class SmallNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integer numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("a is the smallest");
        }
        else if (b < c && b < a) {
            System.out.println("b is the smallest");
        }
        else {
            System.out.println("c is the smallest");
        }
    }
}
