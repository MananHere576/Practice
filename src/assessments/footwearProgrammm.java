package assessments;
import java.util.Scanner;
import java.util.Arrays;

public class footwearProgrammm
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Footwear footwears[]=new Footwear[5];
        for (int i = 0; i <5 ; i++) {
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();
            sc.nextLine();

            footwears[i]= new Footwear(a,b,c,d);
        }
        String inputFootwearType=sc.nextLine();
        String inputFootwearName=sc.nextLine();

        int count=getCountByType(footwears, inputFootwearType);
        if(count>0)
        {
            System.out.println(count);
        }
        else
        {
            System.out.println("Footwear Not Available");
        }
         Footwear obj=getSecondHighestPriceByBrand(footwears,inputFootwearName);
        if(obj==null)
        {
            System.out.println("Brand Not Available");
        }
        else
        {
            System.out.println(obj.getFootwearId());
            System.out.println(obj.getFootwearName());
            System.out.println(obj.getPrice());
        }
    }
    public static int getCountByType(Footwear footwears[], String inputFootwearType)
    {
        int count=0;
        for (int i = 0; i <5 ; i++) {
            if(footwears[i].getFootwearType().equalsIgnoreCase(inputFootwearType))
            {
                count++;
            }
        }
        return count;

    }
    public static Footwear getSecondHighestPriceByBrand(Footwear[] footwears, String inputFootwearName)
    {
        int arr[]=new int[0];
        for (int i = 0; i < 5; i++) {
            if(footwears[i].getFootwearName().equalsIgnoreCase(inputFootwearName))
            {
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=footwears[i].getPrice();
            }

        }
        Arrays.sort(arr);
        if(arr.length>0)
        {
            int x=arr[arr.length-2];
            for (int i = 0; i <5 ; i++) {
                if(footwears[i].getPrice()==x)
                    return footwears[i];

            }
        }
        return null;
    }


}

class Footwear {

    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    // Parameterized Constructor
    public Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    // Getter Methods
    public int getFootwearId() {
        return footwearId;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public String getFootwearType() {
        return footwearType;
    }

    public int getPrice() {
        return price;
    }

    // Setter Methods
    public void setFootwearId(int footwearId) {
        this.footwearId = footwearId;
    }

    public void setFootwearName(String footwearName) {
        this.footwearName = footwearName;
    }

    public void setFootwearType(String footwearType) {
        this.footwearType = footwearType;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}