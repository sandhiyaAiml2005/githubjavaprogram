import java.util.Scanner;
class Halfrevarr{
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
        for(int i=(arr.length-1)/2;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        for(int i=(arr.length/2);i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void array2(int arr[]){
        for(int i=0;i<(arr.length)/2;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=(arr.length-1);i>=(arr.length/2);i--){
            System.out.print(arr[i]+" ");
        }
        

    }
}
