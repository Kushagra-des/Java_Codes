class Shape{
    public void area(){
        System.out.println("Display Area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(0.5*l*l);
    }
} 

public class MultiLevelInheritance {
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        t1.area(4,6);
    }
}