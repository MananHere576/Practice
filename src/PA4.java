import java.util.Scanner;
public class PA4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        College arr[]=new College[n];
        for (int i = 0; i <n ; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt();
            sc.nextLine();
            String d=sc.nextLine();
            int e=sc.nextInt();
            sc.nextLine();

            arr[i]=new College(a,b,c,d,e);

        }
        String address=sc.nextLine();
        College pin = findCollegeWithMaximumPincode(arr);
        if(pin!=null)
        {
            System.out.println("ID : "+pin.getId());
            System.out.println("Name : "+pin.getName());
            System.out.println("Contact No : "+pin.getContactNo());
            System.out.println("Address : "+pin.getAddress());
            System.out.println("Pin : "+pin.getPincode());
        }
        else{
            System.out.println("No college found with mentioned attribute");
        }

        College add = searchCollegeByAddress(arr,address);
        if(add!=null)
        {
            System.out.println("ID : "+add.getId());
            System.out.println("Name : "+add.getName());
            System.out.println("Contact No : "+add.getContactNo());
            System.out.println("Address : "+add.getAddress());
            System.out.println("Pin : "+add.getPincode());
        }
        else{
            System.out.println("No college found with mentioned attribute");
        }
    }
    public static College findCollegeWithMaximumPincode(College arr[])
    {
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].getPincode()>max){
                max=arr[i].getPincode();
            }

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPincode()==max){
                return arr[i];
            }
        }
        return null;
    }
    public static College searchCollegeByAddress(College[] arr,String add)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i].getAddress().equalsIgnoreCase(add))
            {
                return arr[i];
            }
        }
        return null;
    }
}
class College
{
    int id;
    String name;
    int contactNo;
    String address;
    int pincode;

    //parameterized constructor

    public College(int id, String name, int contactNo, String address, int pincode) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pincode = pincode;
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}