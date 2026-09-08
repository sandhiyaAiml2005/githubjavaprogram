import java.util.Scanner;
class Binarysearch{
    static void Array(int arr[],int target,int flag){
        int left=0,right=arr.length-1;
        while(left<right){
            int mid=(right+left)/2;
            if(arr[mid]==target){
                flag=1;
                System.out.print(mid);
                break;
            }else if(arr[mid]<target){
                left=mid+1;
            }else if(arr[mid]>target){
                right=mid-1;
            }
        }
        if(flag==0){
            System.out.print("Element not found");
        }
    }
    
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
           // int n=sc.nextInt();
            int flag=0;
            int target=50;
            int left=0,right=n-1;
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            //int left=0,right=n-1;
            //Elementsearch s=new Elementsearch();
            Array(arr,target,flag);

        }
    }
    
    
