import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,difference;
        Scanner first=new Scanner(System.in);
        System.out.println("Enter First number: ");
         num1=first.nextInt();
        Scanner second=new Scanner(System.in);
        System.out.println("Enter Second number: ");
         num2=second.nextInt();
         if (num1>num2){
             difference=num1-num2;
         }else {
             difference=num2-num1;
         }
        System.out.println("The difference of the two numbers is: " + difference);
    }
}