import java.util.Scanner;

public class PA10 {

    public static int findCountOfEmployeesUsingCompTransport(Employee[] arr, String branch) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getBranch().equals(branch)
                    && arr[i].isCompanyTransport()) {
                count++;
            }
        }

        return count;
    }

    public static Employee findEmployeeWithSecondHighestRating(Employee[] arr) {

        Employee first = null;
        Employee second = null;

        for (int i = 0; i < arr.length; i++) {

            if (!arr[i].isCompanyTransport()) {

                if (first == null || arr[i].getRating() > first.getRating()) {
                    second = first;
                    first = arr[i];
                }
                else if (second == null || arr[i].getRating() > second.getRating()) {
                    second = arr[i];
                }
            }
        }

        return second;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee arr[] = new Employee[4];

        for (int i = 0; i < 4; i++) {

            int a = sc.nextInt();
            sc.nextLine();

            String b = sc.nextLine();
            String c = sc.nextLine();

            double d = sc.nextDouble();
            boolean e = sc.nextBoolean();
            sc.nextLine();

            arr[i] = new Employee(a, b, c, d, e);
        }

        String branch = sc.nextLine();

        int count = findCountOfEmployeesUsingCompTransport(arr, branch);

        if (count > 0) {
            System.out.println(count);
        }
        else {
            System.out.println("No such Employees");
        }

        Employee ans = findEmployeeWithSecondHighestRating(arr);

        if (ans != null) {
            System.out.println(ans.getEmployeeId());
            System.out.println(ans.getName());
        }
        else {
            System.out.println("All Employees using company transport");
        }
    }
}

class Employee {

    private int employeeId;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;

    public Employee(int employeeId, String name, String branch,
                    double rating, boolean companyTransport) {

        this.employeeId = employeeId;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.companyTransport = companyTransport;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public double getRating() {
        return rating;
    }

    public boolean isCompanyTransport() {
        return companyTransport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setCompanyTransport(boolean companyTransport) {
        this.companyTransport = companyTransport;
    }
}