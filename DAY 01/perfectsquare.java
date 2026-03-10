public class Main {
    public static void main(String[] args) {   
        int n = 16;
        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                System.out.println(n + " is a perfect square.");
                return;
            }
        }
        System.out.println(n + " is not a perfect square.");
    }
}