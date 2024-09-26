class factorial {

    int fact(int n) {
        if (n < 0) {
            System.out.println("You entered a negative number");
            return 0;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}

public class FactorialValueWithRec {
    public static void main(String[] args) {

        factorial fact1 = new factorial();

        int result = fact1.fact(5);
        System.out.println("Factorial value is: " + result);
    }
}
