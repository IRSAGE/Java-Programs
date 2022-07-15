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
            if (marks[i]==9 || marks[i]==10){
                System.out.println(marks[i]+" ELITE");
            } else if (marks[i]==8) {
                System.out.println(marks[i]+" GRAND DISTINCTION");
            }else if (marks[i]==7) {
                System.out.println(marks[i]+" DISTINCTION");
            }else if (marks[i]==5 || marks[i]==6) {
                System.out.println(marks[i]+" SATISFACTION");
            }else if (marks[i]==4 || marks[i]==3) {
                System.out.println(marks[i]+" PASSABLE");
            }else {
                System.out.println(marks[i] + " FAIL");
            }
        }
    }
}