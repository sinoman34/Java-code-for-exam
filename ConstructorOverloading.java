class Overloading{
    String name, gender;
    int age;

    Overloading() {
        System.out.println("No informations");
    }
    Overloading(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Overloading(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    void show(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}
public class ConstructorOverloading {

    public static void main(String[] args) {
        Overloading ob1 = new Overloading();
        Overloading ob2 = new Overloading("Saidul Islam", 18);
        ob2.show();
        Overloading ob3 = new Overloading("Fahmida islam", 19, "Female");
        ob3.show();
    }
    
}
