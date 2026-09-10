//write a program to check whether a number is Neon or not
import java.util.Scanner;
class Neonnumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        check(n);
    }
    static void check(int n){
        int square=n*n;
        int sum=0;
        int temp=n;
        while(n>0){
            
            sum+=(n%10);
            n=n/10;
        }
        //System.out.print(sum);
        if(sum==temp){
            System.out.print(temp +" is a Neon number");
        }else{
            System.out.print(temp +" is not a Neon number");
        }
    }
}