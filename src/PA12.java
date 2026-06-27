import java.util.*;

public class PA12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Medicine arr[] = new Medicine[4];

        for (int i = 0; i < 4; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();

            arr[i] = new Medicine(a, b, c, d);
        }

        String input = sc.nextLine();

        int crr[] = getPriceByDisease(arr, input);

        if (crr != null) {
            for (int i = 0; i < crr.length; i++) {
                System.out.println(crr[i]);
            }
        } else {
            System.out.println("No Medicine Found");
        }
    }

    public static int[] getPriceByDisease(Medicine arr[], String input) {

        int count = 0;

        // Count matching medicines
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDisease().equalsIgnoreCase(input)) {
                count++;
            }
        }

        if (count == 0)
            return null;

        int brr[] = new int[count];
        int x = 0;

        // Store prices
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDisease().equalsIgnoreCase(input)) {
                brr[x] = arr[i].getPrice();
                x++;
            }
        }

        Arrays.sort(brr);
        return brr;
    }
}

class Medicine {
    String MedicineName;
    String batch;
    String disease;
    int price;

    public Medicine(String medicineName, String batch, String disease, int price) {
        MedicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedicineName() {
        return MedicineName;
    }

    public void setMedicineName(String medicineName) {
        MedicineName = medicineName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}