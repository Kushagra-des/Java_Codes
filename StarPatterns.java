public class StarPatterns {
    public static void main(String[] args) {
        int n = 4; 
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" "); }
            for (int star = 1; star <= i; star++) {
                System.out.print("* "); }
            System.out.println(); }
        System.out.println();
        for (int i = n; i >= 1; i--) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" "); }
            for (int star = 1; star <= i; star++) {
                System.out.print("* "); }
            System.out.println();
        } } } 
