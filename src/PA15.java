import java.util.Scanner;
public class PA15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Phone arr[]=new Phone[4];
        for (int i = 0; i <4 ; i++) {
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();
            sc.nextLine();
            arr[i]=new Phone(a,b,c,d);
        }
        String inp1=sc.nextLine();
        String inp2=sc.nextLine();
        int ans1=findPriceForGivenBrand(arr,inp1);
        if(ans1==0)
            System.out.println("The given Brand is not available");
        else
            System.out.println(ans1);
        Phone crr[]=getPhoneIdBasedOnOs(arr,inp2);
        if(crr==null)
            System.out.println("No phones are available with specified os and price range");
        else
            System.out.println(crr[0].getPhoneId());
    }
    public static int findPriceForGivenBrand(Phone arr[],String inp1)
    {
        int s=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].getBrand().equalsIgnoreCase(inp1)) {
                s+=arr[i].getPrice();
            }
        }
        return s;
    }
    public static Phone[] getPhoneIdBasedOnOs(Phone arr[],String inp2)
    {
        int cnt=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].getOs().equalsIgnoreCase(inp2) && arr[i].getPrice()>=50000) {
                cnt++;
            }
        }
        if(cnt==0)
            return null;
        Phone brr[]=new Phone[cnt];
        int k=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].getOs().equalsIgnoreCase(inp2) && arr[i].getPrice()>=50000) {
                brr[k++]=arr[i];
            }
        }
        return brr;
    }
}
class Phone
{
    int phoneId;
    String os;
    String brand;
    int price;

    //parameterized constructor

    public Phone(int phoneId, String os, String brand, int price)
    {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    //getters and setters


    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
