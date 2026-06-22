package revision;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        while (n > 0) {

            int r = n % 10;

            if (r == 2 || r == 3 || r == 5 || r == 7) {
                count++;
            }

            n = n / 10;
        }

        System.out.println(count);
    }
}