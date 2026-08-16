class One {
    One(int x) {
        System.out.println("Constructor of One called with value: " + x);
    }
}
class Two extends One {
}
public class TestConstructor {
    public static void main(String[] args) {
        Two obj = new Two(10);
    }
}
