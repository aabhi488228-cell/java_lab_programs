import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks ");
        int marks = sc.nextInt();
    if(marks > 75)
    {
    System.out.println("pass");
    }
    else
    {
    System.out.println("fail");
    }
    sc.close();
}
}