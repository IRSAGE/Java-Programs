import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbers[]=new int[10];
        int i,positive=0,negative=0;
        Scanner reader= new Scanner(System.in);

        for(i=0;i<10;i++){
            System.out.println("Enter value for number " +(i+1) + " :");
            numbers[i]=reader.nextInt();
        }

        for( i=0;i<10;i++) {
            if (numbers[i]<0) {
                negative++;
            }else {
                positive++;
            }
        }
        System.out.println("The number of Positive numbers is: " + positive);
        System.out.println("The number of Negative numbers is: " + negative);
    }
}