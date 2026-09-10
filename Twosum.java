import java.util.Scanner;
class Twosum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the target Sum:");
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sum(arr,target);
    }
    static void sum(int arr[],int target){
        int left=0,right=arr.length-1;
        int  currentsum=0;
        while(left<right){
            currentsum=arr[left]+arr[right];       
            if(currentsum==target){
                System.out.print(left+" "+right);
                break;//without break looping again and again
            }
            else if(currentsum<target){
                left++;
            }
            else if(currentsum>target){
                right--;
            }
        }

        
        
    }
}