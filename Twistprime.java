import java.util.Scanner;
class Twistprime{
    public static void Prime(int n,int rev){
        int flag=0;
        int temp=0;
         for(int i=0;i<n-1;i++){
            if(n%i==0){
                temp=1;
                break;
            }
        }
        for(int i=2;i<rev-1;i++){
            if(rev%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1 || temp==1){
            System.out.print("Not a Twisted prime");
        }else{
            System.out.print("Twisted prime");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem,rev=0;
        while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        Prime(n,rev);
        
        

        }
    }
