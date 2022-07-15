import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner first=new Scanner(System.in);
        System.out.println("Enter First number: ");
        num1=first.nextInt();
        Scanner second=new Scanner(System.in);
        System.out.println("Enter Second number: ");
        num2=second.nextInt();
        Scanner third=new Scanner(System.in);
        System.out.println("Enter Third number: ");
        num3=third.nextInt();
if (num1>num2 && num1>num3){
    System.out.println("The largest of those numbers is: " + num1);
} else if (num2>num1 && num2>num3) {
    System.out.println("The largest of those numbers is: " + num2);
}else {
    System.out.println("The largest of those numbers is: " + num3);
}
    }
}
