import java.util.Scanner;
class Bring1first{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        array(arr);
        System.out.println();
        array2(arr);
    }
    static void array(int arr[]){
        int j=0;       
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=1){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        
    }
    //without reversing the array
    static void array2(int arr[]){
        int j=0;       
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}