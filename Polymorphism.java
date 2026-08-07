class Student {
	String name;
	int age;
	
    // Polymorphism: Method Overloading OR Function Overloading

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printinfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " & " + age);
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("This is an example of Polymorphism in Java");
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 20;

        s1.printInfo(s1.name, s1.age);
    }
}
