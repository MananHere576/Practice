package revision;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int f=0;
        String nstr[]=str.split(" ");
        for(int i=0;i<nstr.length;i++){
            char ch=nstr[i].charAt(0);
            if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u'){
                f++;
            }
        }
        if(f>0)
            System.out.println(f);
        else
            System.out.println("No string found");
    }
}
