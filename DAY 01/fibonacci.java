public class Main {
    public static void main(String[] args) {  
        int a = 0, b = 1;
        int n = 10;
        for (int i = 0; i < n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("The " + n + "th Fibonacci number is: " + a);
    }
}
