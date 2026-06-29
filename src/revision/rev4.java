package revision;
import java.util.Scanner;
public class rev4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0,p=n;
        while(p>0)
        {
            int x=p%10;
            if(x%2==0)
            {
                cnt++;
            }
            p=p/10;
        }
        if(cnt>2)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
