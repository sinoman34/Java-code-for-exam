class Overload{
    int sum;
    int add(int a){
        System.out.println(a);
        return 0;
    }
    int add(int a, int b){
        sum = a + b;
        System.out.println(sum);
        return 0;
    }
    int add(int a, int b, int c){
        sum = a + b + c;
        System.out.println(sum);
        return 0;
    }
    double add(double a, double b, double c){
        double sum = a + b + c;
        System.out.println(sum);
        return 0;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Overload ob1 = new Overload();
        ob1.add(10);
        ob1.add(10, 10);
        ob1.add(10, 20, 20);
        ob1.add(10.5, 20.5, 10);
    }
}
