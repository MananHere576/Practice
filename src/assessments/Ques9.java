package assessments;
import java.util.Scanner;
public class Ques9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        int p=num;
        int s=0,d=0;
        while(p>0)
        {
            d=p%10;
            p=p/10;
            s=s+d;
        }
        if(s%3==0)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
