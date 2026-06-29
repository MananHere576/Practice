package revision;
import java.util.Scanner;
public class rev1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int f=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                f++;
            }
        }
        System.out.println(f);
    }
}
