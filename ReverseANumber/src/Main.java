import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int number = input.nextInt();
        int digits=0,sum=0;
        String reverseNumber="";
        String allDigits="";
        for (int divisor=number;divisor !=0;divisor=divisor/10){
            reverseNumber+=divisor%10;
            sum+=divisor%10;
            digits++;
        }
        for (int divisor=Integer.parseInt(reverseNumber);divisor !=0;divisor=divisor/10){
            allDigits=allDigits+divisor%10+" ";
        }
        System.out.println("You entered: "+number);
        System.out.println("Number in reverse: "+reverseNumber);
        System.out.println("Number of digits: "+digits);
        System.out.println("All digits: "+allDigits);
        System.out.println("Sum of digits: "+sum);
    }
}