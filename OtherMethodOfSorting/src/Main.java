import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int[]A=new int[10];
        System.out.println("init the 10 integer numbers in A");
        for(int i=0;i<10;i++)
        {
            A[i]=ip.nextInt();
        }
        System.out.println("Value of Vector A before Sorting\n");
        for(int i=0;i<10;i++)
        {
            System.out.println("A["+i+"]="+A[i]);
        }

        int sid,sm,temp;
        for(int j=0;j<10;j++)
        {
            sm=A[j];
            sid=j;
            for(int i=j+1;i<10;i++)
            {
                if(A[i]<sm)
                {
                    sm=A[i];
                    sid=i;
                }

            }
            temp=A[j];
            A[j]=sm;
            A[sid]=temp;
        }
        System.out.println("after sorting in ascending order\n");
        for(int i=0;i<10;i++)
        {
            System.out.println("A["+i+"]="+A[i]);
        }
        System.out.println("in descending order\n");
        for(int i=9;i>=0;i--)
        {
            System.out.println("A["+i+"]="+A[i]);
        }
    }


}