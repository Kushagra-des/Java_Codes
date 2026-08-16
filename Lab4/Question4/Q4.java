class Shape {
    Shape() {
        System.out.println("Shape created");
    }
}

class Rectangle extends Shape {
    Rectangle() {
        System.out.println("Rectangle created");
    }
}

public class Q4 {
    public static void main(String[] args) {
        new Rectangle();
    }
}
