import java.util.Scanner;
class Twodarrayrev{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int matrix[][]=new int[m][n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=sc.nextInt();
                 System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        Row(matrix);
        Col(matrix);
    }
    static void Row(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=(matrix[i].length)-1;j>=0;j--){                
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }        
   }
    static void Col(int matrix[][]){
        for(int i=(matrix.length)-1;i>=0;i--){
            for(int j=0;j<matrix[i].length;j++){                
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

   }

}