import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number of students: ");
        Scanner reader= new Scanner(System.in);
        int students = reader.nextInt();
        int i;
        int marks[]=new int[students];
        for(i=0;i<students;i++){
            System.out.println("Enter marks for student " +(i+1) + " :");
            marks[i]=reader.nextInt();
        }

        for(i=0;i<students;i++){
            switch(marks[i]) {
                case 10:
                case 9:
                    System.out.println(marks[i] + " ELITE");
                    break;
                case 8:
                    System.out.println(marks[i] + " GRAND DISTINCTION");
                    break;
                case 7:
                    System.out.println(marks[i] + " DISTINCTION");
                    break;
                case 6:
                case 5:
                    System.out.println(marks[i] + " SATISFACTION");
                    break;
                case 4:
                case 3:
                    System.out.println(marks[i] + " PASSABLE");
                    break;
                default:
                    System.out.println(marks[i] + " FAIL");
            }
        }
    }
}