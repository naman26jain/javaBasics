import java.util.*;
class mat{
    Scanner in = new Scanner(System.in);
    int[][] ar1 = new int[3][3];
    int[][] ar2 = new int[3][3];
    int[][] sum = new int[3][3];
    void get(){
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                ar1[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                ar1[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum[i][j]=ar1[i][j]+ar2[i][j];
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
        }
    }
}
class arop{
     public static void main(String[] args) {
        mat obj = new mat();
        obj.get();
    }
}