package tcs_assessments;

import java.util.*;
public class courseProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Course arr[] = new Course[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            int e = sc.nextInt();
            sc.nextLine();
            arr[i] = new Course(a, b, c, d, e);
        }
        String admin = sc.nextLine();
        int hand = sc.nextInt();

        int avg = findAvgOfQuizByAdmin(arr, admin);

        if (avg == 0)
            System.out.println("No Course found");
        else
            System.out.println(avg);

        Course res[] = sortCourseByHandsOn(arr, hand);

        if (res == null)
            System.out.println("No Course found with mentioned attribute.");
        else {
            for (Course c : res) {
                System.out.println(c.getCourseName());
            }
        }
    }

    public static int findAvgOfQuizByAdmin(Course arr[], String admin) {

        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getCourseAdmin().equalsIgnoreCase(admin)) {
                sum += arr[i].getQuiz();
                count++;
            }
        }

        if (count == 0)
            return 0;

        return sum / count;
    }

    public static Course[] sortCourseByHandsOn(Course arr[], int hand) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getHandson() < hand) {
                count++;
            }
        }

        if (count == 0)
            return null;

        Course result[] = new Course[count];

        int k = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getHandson() < hand) {
                result[k++] = arr[i];
            }
        }

        // Bubble Sort (Ascending Handson)

        for (int i = 0; i < result.length - 1; i++) {

            for (int j = 0; j < result.length - i - 1; j++) {

                if (result[j].getHandson() > result[j + 1].getHandson()) {

                    Course temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        return result;
    }
}

class Course {

    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public Course(int courseId, String courseName, String courseAdmin,
                  int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public void setCourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public int getHandson() {
        return handson;
    }

    public void setHandson(int handson) {
        this.handson = handson;
    }
}