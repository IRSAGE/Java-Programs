import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter Number of N fibonacci series: ");
        int n =reader.nextInt();
        int n1=0,n2=1,n3,i;
        System.out.print("The Fibonacci series of "+n +" is: ");
        System.out.print(n1+","+n2);
        for(i=2;i<n;++i)
        {
            n3=n1+n2;
            System.out.print(","+n3);
            n1=n2;
            n2=n3;
        }

    }
}