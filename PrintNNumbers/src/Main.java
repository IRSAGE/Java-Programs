import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner reader= new Scanner(System.in);
        int N = reader.nextInt();
        for (int i =40;i>=N;i=i-5)
            System.out.print(i + ",");
    }
}