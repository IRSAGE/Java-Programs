import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbers[]=new int[10];
        Scanner reader= new Scanner(System.in);

        for(int i=0;i<10;i++){
            System.out.println("Enter value for number " +(i+1) + " :");
            numbers[i]=reader.nextInt();
        }
        // Sorting the array in Descending order
        for (int j = 0; j < 10; j++) {
            for (int i = 9; i > j; i--) {
                if (numbers[i - 1] < numbers[i]) {
                    int swp = numbers[i];
                    numbers[i] = numbers[i - 1];
                    numbers[i - 1] = swp;
                }
            }
        }
        // Printing the elements
        System.out.println("Array In Descending order: ");
        for(int i=0;i<10;i++){
            System.out.print(numbers[i]+",");
        }
    }
}