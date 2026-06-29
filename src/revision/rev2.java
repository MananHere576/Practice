package revision;
import java.util.Scanner;
public class rev2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String nstr="";
        for (int i = 1; i < str.length(); i+=2) {
            nstr+=str.charAt(i);
        }
        System.out.println(nstr);
    }
}
