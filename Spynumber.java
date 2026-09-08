import java.util.Scanner;
class Spynumber{
    public static void Sumpro(int n){
        
        int rem;
        int sum=0;
        int pro=1;
        while(n>0){
            rem=n%10;
            sum+=rem;
            pro*=rem;
            n=n/10;

        }        
        if(sum==pro){
            System.out.print("Spy Number");
        }else{
            System.out.print("Not a Spy Number");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Sumpro(n);
    }
}