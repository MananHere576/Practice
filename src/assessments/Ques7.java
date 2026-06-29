package assessments;
import java.util.Scanner;
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String nstr[]=str.split(" ");
        String f="";
        for (int i = 0; i < nstr.length ; i++) {
            char ch=nstr[i].charAt(0);
            if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u' || ch=='A' || ch=='E' || ch=='O' || ch=='I' || ch=='U')
            {
                f=f+ch;
            }
        }
        System.out.println(f);
    }
}
