package tcs_assessments;
import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int f=0;
        for (int i = 0; i <str.length(); i++) {
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch))
                f++;
        }
        System.out.println(f);
    }
}
