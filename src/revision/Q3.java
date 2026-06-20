package revision;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String nstr[]=str.split(" ");
        for (int i = nstr.length-1; i >=0 ; i--) {
            System.out.print(nstr[i]+" ");
        }
    }
}
