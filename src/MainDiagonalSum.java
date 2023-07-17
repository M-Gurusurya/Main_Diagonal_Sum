import java.util.Scanner;

public class MainDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter row size");
        int row_size=scanner.nextInt();
        System.out.println("enter column size");
        int column_size=scanner.nextInt();
        int array[][]=new int[row_size][column_size];
        for(int i=0;i<row_size;i++)
        {
            for(int j=0;j<column_size;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }

        findMainDiagonalSum(array,row_size,column_size);
    }
    public static void findMainDiagonalSum(int array[][],int row_size,int column_size)
    {
        int sum=0;
        for(int i=0;i<row_size;i++)
        {
            sum+=array[i][i];
        }
        System.out.println(sum);
    }
}
