package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    // Getter and Setter for password
    public String getPassword() { // getter
        return this.password;
    }

    public void setPassword(String password) { //setter
        this.password = password;
    }

}


public class Bank {
    public static void main(String args[]) {
        Account a1 = new Account();
        a1.name = "Apna College";
        a1.email = "apnacollege@gmail.com";
        a1.setPassword("abcd");
        System.out.println(a1.name);
        System.out.println(a1.email);
        System.out.println(a1.getPassword());
    }
}