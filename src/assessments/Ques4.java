package assessments;
import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int s=0,c=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                s++;
            }
            else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            {
                c++;
            }
        }
        System.out.println(s+" "+c);
    }
}
