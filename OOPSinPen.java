class Pen {
	String color;
	String type; // Ballpoint or Gel

	public void write(){
		System.out.println("Writing Something"); // this is a method of the class Pen
	}

	public void printColor() {
		System.out.println(this.color); // this is used to refer to the current object i.e., color of the current object pen1
	}

	public void printType() {
		System.out.println(this.type); // this is used to refer to the current object i.e., type of the current object pen1
	}
}

public class OOPSinPen {
	public static void main(String agrs[]) { // main method is the entry point of the program
	Pen pen1 = new Pen(); // creating an object of the class Pen
	pen1.color = "Blue"; // accessing the instance variable color of the object pen1
	pen1.type = "Gel"; // accessing the instance variable type of the object pen1
	pen1.printColor(); // calling the method printColor of the object pen1
	pen1.printType(); // calling the method printType of the object pen1

	Pen pen2  = new Pen(); // creating another object of the class Pen
	pen2.color = "Black"; // accessing the instance variable color of the object pen2
	pen2.type = "Ballpoint"; // accessing the instance variable type of the object pen2
	pen2.printColor(); // calling the method printColor of the object pen2
	pen2.printType(); // calling the method printType of the object pen2

	pen1.write(); // calling the method write of the object pen1
	}
}