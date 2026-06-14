package tcs_assessments;
import java.util.Scanner;
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String nstr[]=str.split(" ");
        int cnt=nstr.length-1;
        if(cnt>=3)
            System.out.println(cnt);
        else
            System.out.println("NA");
    }
}
