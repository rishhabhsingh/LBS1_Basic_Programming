public class Main {
    public static void main(String[] args) {
        boolean isPrime = true;
        int num = 9;
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("Prime Hai");
        }
        else
        {
            System.out.println("Prime Nahi Hai");
        }
    }
}
