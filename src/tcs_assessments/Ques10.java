package tcs_assessments;
import java.util.Scanner;
public class Ques10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String nstr[]=str.split(" ");
        int x=nstr[0].length();
        String y=nstr[0];
        for (int i = 1; i <nstr.length; i++) {
            if(nstr[i].length()>x)
            {
                x=nstr[i].length();
                y=nstr[i];
            }
        }
        System.out.println(y);
    }
}
