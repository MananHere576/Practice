package revision;
import java.util.Scanner;
public class rev9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        String nstr="";
        for(int i=0;i<arr.length;i++){
            char ch=arr[i].charAt(arr[i].length()-1);
            nstr=nstr+ch;
        }
        System.out.println(nstr);
    }
}
