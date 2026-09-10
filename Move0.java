import java.util.Scanner;
class Move0{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        array(arr);
    }
    static void array(int arr[]){
        int  j=0;
        for(int i=0;i<arr.length;i++){
        //int j=0;(cannot declare here it resets to 0 every iteration) 
            
                if(arr[i]!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;
                }
            
           // System.out.print(arr[i]);(use a separate loop to print result)
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
        }

    }
