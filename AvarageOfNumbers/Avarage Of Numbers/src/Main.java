import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,num3,num4;
        float average;
        Scanner first=new Scanner(System.in);
        System.out.println("Enter First number: ");
        num1=first.nextInt();
        Scanner second=new Scanner(System.in);
        System.out.println("Enter Second number: ");
        num2=second.nextInt();
        Scanner third=new Scanner(System.in);
        System.out.println("Enter Third number: ");
        num3=third.nextInt();
        Scanner last=new Scanner(System.in);
        System.out.println("Enter fourth number: ");
        num4=last.nextInt();
        average= (num1+num2+num3+num4)/4;
        System.out.println("The average of those numbers is: " + average);
    }
}