package revision;
import java.util.*;
public class rev10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0,cnt=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            if(arr[i]> l1 && arr[i]<l2)
            {
                s+=arr[i];
                cnt++;
            }
        }
        System.out.println(s/cnt);
    }
}
