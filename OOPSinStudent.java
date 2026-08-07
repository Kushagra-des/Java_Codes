class Student {
	String name;
	int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

	Student() { 
		System.out.println("Non-Parameterized Constructor is called");
	}

	Student(String name, int age) { // Parameterized Constructor 
		System.err.println("Parameterized Constructor is called");
		this.name = name; 
		this.age = age; 
	}

}
public class OOPSinStudent {
	public static void main(String args[]) {

		Student s1 = new Student("Aman", 24); // Student() is the constructor of the class Student which is used to create an object of the class Student
		// s1.name = "Aman";
		// s1.age = 20;

		//Student s2 = new Student();
		//s2.name = "Shradha"; 
		//s2.age = 22;

        s1.printInfo();
        //s2.printInfo();
	}
}