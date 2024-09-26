public class MethodUsingSum {
    public int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        MethodUsingSum obj = new MethodUsingSum();
        int result = obj.add(5, 10);
        System.out.println("Sum is: "+result);
    }
}
