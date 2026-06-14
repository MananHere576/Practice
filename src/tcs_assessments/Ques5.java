package tcs_assessments;
import java.util.Scanner;
public class Ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String nstr[]=str.split(" ");
        for (int i = 0; i < nstr.length ; i++) {
            String word=nstr[i];
            char ch=word.charAt(word.length()-1);
            if(Character.isDigit(ch))
            {
                continue;
            }
            System.out.print(ch);

        }
    }
}
