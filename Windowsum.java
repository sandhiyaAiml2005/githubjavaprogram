import java.util.Scanner;
class Windowsum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int windowsum=0;        
        System.out.print("Enter the window size:");
        int k=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sum(arr,k,windowsum);
    }
    static void sum(int arr[],int k,int windowsum){
        int maxsum;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        maxsum=windowsum;
        for(int i=k;i<arr.length;i++){
            windowsum+=arr[i]-arr[i-k];        
        if(windowsum>maxsum){
            maxsum=windowsum;
        }
        }
        System.out.print(maxsum);
        
    }
}