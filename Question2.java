interface Testable {
    void display(); } 
class Test implements Testable {
    public void display() {
        System.out.println("Display method implemented in Test class"); } }
abstract class AbsTest implements Testable {}
public class Question2 {
    public static void main(String[] args) {
        Test t = new Test();
        t.display(); } }
