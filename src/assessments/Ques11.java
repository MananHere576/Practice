package assessments;
import java.util.Scanner;
public class Ques11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i <5 ; i++) {
            arr[i]=sc.nextInt();
            sc.nextLine();
        }
        int l1=sc.nextInt();
        sc.nextLine();
        int l2=sc.nextInt();
        sc.nextLine();
        int sum=0,cnt=0;
        for (int i = 0; i <5 ; i++) {
            if(arr[i]>l1 && arr[i]<l2){
                cnt++;
                sum+=arr[i];
            }
        }
        System.out.println(sum/cnt);
    }
}
