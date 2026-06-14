package tcs_assessments;
import java.util.Scanner;
import java.util.Arrays;
public class SimSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim[] sm = new Sim[5];
        for (int i = 0; i < sm.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();
            sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();
            String e = sc.nextLine();
            sm[i] = new Sim(a, b, c, d, e);
        }

        String c1 = sc.nextLine();
        String c2 = sc.nextLine();
        sc.close();

        Sim[] ans = transferCustomerCircle(sm, c1, c2);

        if (ans == null) {
            System.out.println("No Transfer");
        } else {
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i].getSimId() + " " + ans[i].getCustomerName() + " " + ans[i].getCircle() + " "
                        + ans[i].getRatePerSecond());
            }
        }

    }

    public static Sim[] transferCustomerCircle(Sim[] sim, String cr1, String cr2) {
        Sim[] help = new Sim[0];

        for (int i = 0; i < 5; i++) {
            if (sim[i].getCircle().equalsIgnoreCase(cr1)) {
                sim[i].setCircle(cr2);
                help = Arrays.copyOf(help, help.length + 1);
                help[help.length - 1] = sim[i];
            }
        }

        for (int i = 0; i < help.length - 1; i++) {
            for (int j = 0; j < help.length - i - 1; j++) {
                if (help[j].getRatePerSecond() < help[j + 1].getRatePerSecond()) {
                    Sim temp = help[j];
                    help[j] = help[j + 1];
                    help[j + 1] = temp;
                }
            }
        }

        if (help.length > 0)

        {
            return help;
        }

        return null;
    }
}

class Sim {
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String cricle;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String cricle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.cricle = cricle;
    }

    public int getSimId() {
        return simId;
    }

    public void setSimId(int newSimId) {
        this.simId = newSimId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String newCustomerName) {
        this.customerName = newCustomerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public void getRatePerSecond(double newRatePerSecond) {
        this.ratePerSecond = newRatePerSecond;
    }

    public String getCircle() {
        return cricle;
    }

    public void setCircle(String newCircle) {
        this.cricle = newCircle;
    }
}