package revision;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int spaces = 0;
        int characters = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ') {
                spaces++;
            }
            else {
                characters++;
            }
        }

        System.out.println("Spaces: " + spaces);
        System.out.println("Characters (excluding spaces): " + characters);
    }
}
