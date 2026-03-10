public class Main {
    public static void main(String[] args) 
    {
        long result = 1;
        int num = 15;
        for(int i = 2; i <= num; i++)
        {
            result = result * i;
        }
        System.out.println("Factorial of " + num + " is: " + result);
    }
}