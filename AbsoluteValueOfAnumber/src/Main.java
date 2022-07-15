import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner first=new Scanner(System.in);
        System.out.println("Enter the number to find it's absolute value: ");
        number=first.nextInt();
        if (number < 0)
        {
            number = (-1) * number;
        }
        System.out.println("The absolute value of the number is : " + number);
    }
}