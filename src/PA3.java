import java.util.Scanner;
import java.util.Arrays;
public class PA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student arr[]=new Student[4];
        for (int i = 0; i <4 ; i++) {
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            double d=sc.nextDouble();
            sc.nextLine();
            boolean e=sc.nextBoolean();
            sc.nextLine();

            arr[i]=new Student(a,b,c,d,e);
        }
        int a1=findCountOfDayscholarStudents(arr);
        if(a1>0)
        {
            System.out.println(a1);
        }
        else
        {
            System.out.println("No student found");
        }
        Student a2=findStudentwithSecondHighestScore(arr);
        if(a2== null)
        {
            System.out.println("No student found");
        }
        else{
            System.out.println(a2.getRollNo()+"#"+a2.getName()+"#"+a2.getScore());
        }
    }
    public static int findCountOfDayscholarStudents(Student arr[])
    {
        int cnt=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i].getScore()>80 && arr[i].isDayScholar()==true)
            {
                cnt++;
            }

        }
        return cnt;
    }
    public static Student findStudentwithSecondHighestScore(Student arr[])
    {
        double[] arr1 = new double[0];

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i].isDayScholar()==false)
            {
                arr1 = Arrays.copyOf(arr1, arr1.length+1);
                arr1[arr1.length-1] = arr[i].getScore();
            }
        }

        if(arr1.length < 2)
        {
            return null;
        }

        Arrays.sort(arr1);

        double shs = arr1[arr1.length-2];

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i].getScore() == shs)
            {
                return arr[i];
            }
        }

        return null;
    }
}
class Student
{
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;

    //parameterized constructor

    public Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }

    //getters and setters

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isDayScholar() {
        return dayScholar;
    }

    public void setDayScholar(boolean dayScholar) {
        this.dayScholar = dayScholar;
    }
}