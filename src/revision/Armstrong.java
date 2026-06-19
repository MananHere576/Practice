import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        int original = n;
        int p = 0, r;

        while (n > 0) {
            r = n % 10;
            p = p + r * r * r;
            n = n / 10;
        }

        if (p == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }
}