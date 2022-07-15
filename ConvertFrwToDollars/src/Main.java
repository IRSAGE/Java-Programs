import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Type 1 for Dollar to Rwandan Conversion");
        System.out.println("Type 2 for Rwandan to Dollar Conversion");
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter Your Choice:");
        int choice = reader.nextInt();
        int amount;
        switch(choice) {
            case 1:
                System.out.println("Enter Dollar Amount:");
                amount = reader.nextInt();
                System.out.println(amount + " $ => " + (amount * 1028) + " Rwf");
                break;
            case 2:
                System.out.println("Enter Rwandan Amount:");
                amount = reader.nextInt();
                System.out.println(amount + " Rwf => " + (amount / 1028)+"."+(amount % 1028) + " $");
                break;
            default:
                System.out.println("Wrong Choice, please type only 1 or 2");
        }
    }
}