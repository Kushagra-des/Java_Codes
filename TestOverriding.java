
class Mother {
    void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother {
    @Override
    void show() {
        System.out.println("Hello JUET");
    }
}


public class TestOverriding {
    public static void main(String[] args) {
        Mother m = new Mother();   
        m.show();                

        Child c = new Child();     
        c.show();                 

        Mother mc = new Child();   
        mc.show();               
    }
}
