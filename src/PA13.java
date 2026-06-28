import java.util.Scanner;
import java.util.Arrays;
public class PA13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AutonomousCar arr[]=new AutonomousCar[4];
        for (int i = 0; i <4 ; i++) {
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt();
            sc.nextLine();
            int d=sc.nextInt();
            sc.nextLine();
            String e=sc.nextLine();

            arr[i]=new AutonomousCar(a, b, c, d, e);
        }
        String inp1=sc.nextLine();
        String inp2=sc.nextLine();
        int res=findTestPassedByEnv(arr,inp1);
        if(res>0)
            System.out.println(res);
        else
            System.out.println("There are no tests passed in this particular environment");
        AutonomousCar[] ans2 = updateCarGrade(arr,inp2);
        if(ans2!=null)
        {
            for (int i = 0; i < ans2.length; i++) {
                int grade = ans2[i].noOfTestPassed*100/ans2[i].noOfTestsConducted;
                if(grade>=80)
                {
                    System.out.println(ans2[i].getBrand()+"::A1");
                }
                else
                {
                    System.out.println(ans2[i].getBrand()+"::B2");
                }
            }
        }
        else
        {
            System.out.println("No Car is available with the specified brand");
        }
    }
    public static int findTestPassedByEnv(AutonomousCar arr[],String inp1)
    {
        int s=0;
        for(int i=0;i<4;i++)
        {
            if(arr[i].getEnvironment().equalsIgnoreCase(inp1))
            {
                s=s+arr[i].noOfTestPassed;
            }
        }
        if(s>0)
            return s;
        else
            return 0;
    }
    public static AutonomousCar[] updateCarGrade(AutonomousCar[] arr, String inp2)
    {
        AutonomousCar brr[]=new AutonomousCar[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].brand.equalsIgnoreCase(inp2))
            {
                brr = Arrays.copyOf(brr, brr.length+1);
                brr[brr.length-1]=arr[i];
            }
        }
        if(brr.length>0)
            return brr;
        else
            return null;
    }
}
class AutonomousCar
{
    int carId;
    String brand;
    int noOfTestsConducted;
    int noOfTestPassed;
    String environment;

    //parameterized constructor

    public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestPassed, String environment) {
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestPassed = noOfTestPassed;
        this.environment = environment;
    }

    //getters and setters

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNoOfTestsConducted() {
        return noOfTestsConducted;
    }

    public void setNoOfTestsConducted(int noOfTestsConducted) {
        this.noOfTestsConducted = noOfTestsConducted;
    }

    public int getNoOfTestPassed() {
        return noOfTestPassed;
    }

    public void setNoOfTestPassed(int noOfTestPassed) {
        this.noOfTestPassed = noOfTestPassed;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}