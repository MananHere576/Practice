package tcs_assessments;
import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Flowers arr[]=new Flowers[4];
        for (int i = 0; i <4 ; i++) {
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt();
            sc.nextLine();
            int d=sc.nextInt();
            sc.nextLine();
            String e=sc.nextLine();
            arr[i]=new Flowers(a,b,c,d,e);

        }
        String input=sc.nextLine();
        int ans=findMinPriceByType(arr,input);
        if(ans==0)
            System.out.println("There is no flower with given type");
        else
            System.out.println(ans);
    }
    public static int findMinPriceByType(Flowers arr[],String input)
    {
        int idd=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].getType().equalsIgnoreCase(input) && arr[i].getRating()>3 && arr[i].getPrice()<min)
            {
                min=arr[i].getPrice();
                idd=arr[i].getFlowerId();
            }
        }
        if(min!=Integer.MAX_VALUE)
        {
            return idd;
        }
        return 0;
    }
}

class Flowers
{
    private int flowerId;
    private String flowerName;
    private int price;
    private int rating;
    private String type;

    //parameterized constructor

    public Flowers(int flowerId, String flowerName, int price, int rating, String type) {
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }

    //getters and setters

    public int getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(int flowerId) {
        this.flowerId = flowerId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}