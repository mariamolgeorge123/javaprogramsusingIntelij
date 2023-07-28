package ArrayPrograms;

public class TwoDDemo {
    public static void main(String[] args) {
        int arr[][]={
                    {1,2,3},
                {11,22,33},
                {101,102,103},
                    } ;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr.length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
