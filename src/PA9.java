import java.util.Scanner;

public class PA9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book arr[] = new Book[4];

        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();

            String c = sc.nextLine();
            String d = sc.nextLine();
            double e = sc.nextDouble();
            sc.nextLine();

            arr[i] = new Book(a, b, c, d, e);
        }

        String title = sc.nextLine();

        Book maxBook = findBookWithMaximumPrice(arr);

        if (maxBook != null) {
            System.out.println(maxBook.getId() + " " + maxBook.getTitle());
        } else {
            System.out.println("No Book found with mentioned attribute.");
        }

        Book searchedBook = searchBookByTitle(arr, title);

        if (searchedBook != null) {
            System.out.println(searchedBook.getId());
            System.out.println(searchedBook.getPages());
        } else {
            System.out.println("No Book found with mentioned attribute.");
        }
    }

    public static Book findBookWithMaximumPrice(Book[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Book maxBook = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getPrice() > maxBook.getPrice()) {
                maxBook = arr[i];
            }
        }

        return maxBook;
    }

    public static Book searchBookByTitle(Book[] arr, String title) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getTitle().equals(title)) {
                return arr[i];
            }
        }
        return null;
    }
}

class Book {
    private int id;
    private int pages;
    private String title;
    private String author;
    private double price;

    public Book(int id, int pages, String title, String author, double price) {
        this.id = id;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}