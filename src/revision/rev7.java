package revision;
import java.util.Scanner;
public class rev7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c=sc.next().charAt(0);
        String nstr="";
        for (int i = 0; i <str.length() ; i++) {
            if(c!=str.charAt(i)){
                nstr=nstr+str.charAt(i);
            }
        }
        System.out.println(nstr);
    }
}
