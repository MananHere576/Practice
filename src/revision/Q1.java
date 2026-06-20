package revision;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int u=0,l=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                l++;
            }
            else if(ch>='A'&&ch<='Z'){
                u++;
            }
            else
                continue;
        }
        System.out.println("Uppercase:"+u);
        System.out.println("Lowercase:"+l);
    }
}
