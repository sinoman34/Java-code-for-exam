public class PrimeNum {
    public static void main(String[] args) {
        int i;
        int n = 100;
        for (i=1; i < n; i++){
            if (n % i != 0){
               System.out.println(i);
            }
        }
    }
}
