import java.util.Scanner;

public class PA8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hotel[] arr = new Hotel[4];

        for (int i = 0; i < 4; i++) {
            int hotelId = sc.nextInt();
            sc.nextLine();

            String hotelName = sc.nextLine();
            String dateOfBooking = sc.nextLine();

            int noOfRoomsBooked = sc.nextInt();
            sc.nextLine();

            String wifiFacility = sc.nextLine();

            double totalBill = sc.nextDouble();
            sc.nextLine();

            arr[i] = new Hotel(hotelId, hotelName, dateOfBooking,
                    noOfRoomsBooked, wifiFacility, totalBill);
        }

        String month = sc.nextLine();
        String wifiOption = sc.nextLine();

        int totalRooms = noOfRoomsBookedInGivenMonth(arr, month);

        if (totalRooms > 0) {
            System.out.println(totalRooms);
        } else {
            System.out.println("No rooms booked in the given month");
        }

        Hotel result = searchHotelByWifiOption(arr, wifiOption);

        if (result != null) {
            System.out.println(result.getHotelId());
        } else {
            System.out.println("No such option available");
        }
    }

    public static int noOfRoomsBookedInGivenMonth(Hotel[] arr, String month) {
        int totalRooms = 0;

        for (int i = 0; i < arr.length; i++) {
            String[] parts = arr[i].getDateOfBooking().split("-");
            String bookedMonth = parts[1];

            if (bookedMonth.equalsIgnoreCase(month)) {
                totalRooms += arr[i].getNoOfRoomsBooked();
            }
        }

        return totalRooms;
    }

    public static Hotel searchHotelByWifiOption(Hotel[] arr, String wifiOption) {
        Hotel highest = null;
        Hotel secondHighest = null;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getWifiFacility().equalsIgnoreCase(wifiOption)) {

                if (highest == null ||
                        arr[i].getTotalBill() > highest.getTotalBill()) {

                    secondHighest = highest;
                    highest = arr[i];
                }
                else if (secondHighest == null ||
                        arr[i].getTotalBill() > secondHighest.getTotalBill()) {

                    secondHighest = arr[i];
                }
            }
        }

        return secondHighest;
    }
}

class Hotel {
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public Hotel(int hotelId, String hotelName, String dateOfBooking,
                 int noOfRoomsBooked, String wifiFacility, double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
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

    public String getWifiFacility() {
        return wifiFacility;
    }

    public void setWifiFacility(String wifiFacility) {
        this.wifiFacility = wifiFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}