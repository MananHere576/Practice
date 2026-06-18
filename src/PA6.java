import java.util.Scanner;
import java.util.Arrays;

public class PA6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RRT arr[] = new RRT[4];

        for(int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new RRT(a, b, c, d, e);
        }

        String input = sc.nextLine();

        RRT res = getHighestPriorityTicket(arr, input);

        if(res != null) {
            System.out.println(res.getTicketNo());
            System.out.println(res.getRaisedBy());
            System.out.println(res.getAssignedTo());
        }
        else {
            System.out.println("No such ticket.");
        }
    }

    public static RRT getHighestPriorityTicket(RRT[] arr, String input)
    {
        RRT result = null;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].getProject().equalsIgnoreCase(input))
            {
                if(result == null || arr[i].getPriority() < result.getPriority())
                {
                    result = arr[i];
                }
            }
        }

        return result;
    }
}

class RRT
{
    private int ticketNo;
    private String raisedBy;
    private String assignedTo;
    private int priority;
    private String project;

    // parameterized constructor

    public RRT(int ticketNo, String raisedBy, String assignedTo, int priority, String project) {
        this.ticketNo = ticketNo;
        this.raisedBy = raisedBy;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.project = project;
    }

    // getters and setters

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getRaisedBy() {
        return raisedBy;
    }

    public void setRaisedBy(String raisedBy) {
        this.raisedBy = raisedBy;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}