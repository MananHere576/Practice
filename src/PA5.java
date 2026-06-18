import java.util.Scanner;
public class PA5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Motel arr[]=new Motel[4];
        for (int i = 0; i <4 ; i++) {
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();
            sc.nextLine();
            String e=sc.nextLine();
            double f=sc.nextDouble();
            sc.nextLine();

            arr[i]=new Motel(a,b,c,d,e,f);

        }
        String input=sc.nextLine();
        int res=totalNoOfRoomsBooked(arr,input);
        if(res>0)
            System.out.println(res);
        else
            System.out.println("No match found");
    }
    public static int totalNoOfRoomsBooked(Motel[] arr, String input)
    {
        int sum = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getCabFacility().equalsIgnoreCase(input)
                    && arr[i].getNoOfRoomsBooked() > 5)
            {
                sum += arr[i].getNoOfRoomsBooked();
            }
        }

        return sum;
    }
}
class Motel
{
    private int motelId;
    private String motelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;

    //parameterized constructor

    public Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility, double totalBill) {
        this.motelId = motelId;
        this.motelName = motelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;
    }

    //getters and setters

    public int getMotelId() {
        return motelId;
    }

    public void setMotelId(int motelId) {
        this.motelId = motelId;
    }

    public String getMotelName() {
        return motelName;
    }

    public void setMotelName(String motelName) {
        this.motelName = motelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public String getCabFacility() {
        return cabFacility;
    }

    public void setCabFacility(String cabFacility) {
        this.cabFacility = cabFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}