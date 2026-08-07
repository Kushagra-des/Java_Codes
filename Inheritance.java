class Shape { // Parent Class or Super Class
    String color;
}
    class Triangle extends Shape { // Child Class or Sub Class
        public void printInfo() {
            System.out.println("Color is: " + color);
        }
    }

public class Inheritance {
    
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.color = "Red Blue Black";
        t1.printInfo();
    }
}
