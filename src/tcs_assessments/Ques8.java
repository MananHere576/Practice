package tcs_assessments;
import java.util.Scanner;
public class Ques8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String f="";
        String str=sc.nextLine();
        for(int i=1;i<str.length();i+=2)
        {
            char ch=str.charAt(i);
            f=f+ch;
        }
        System.out.println(f);
    }
}
