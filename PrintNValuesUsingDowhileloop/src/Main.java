import java.util.Scanner;

public class Main {
    static boolean isPrime(int n){
        if(n==1||n==0)return false;
        if(n==1||n==0)return false;
        for(int i=2; i<n; i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println("Enter the value of N: ");
        Scanner reader= new Scanner(System.in);
        int N = reader.nextInt();
        int i =1;
        System.out.println("All prime integer numbers between 1 and "+ N + " Are :");
        do {
            if(isPrime(i)) {
                System.out.print(i + ", ");
            }
            i++;
        }
        while (i<N);
    }
}