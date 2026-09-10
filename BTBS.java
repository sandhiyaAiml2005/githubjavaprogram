//write a program for Best Time to Buy and Sell Stock
import java.util.Scanner;
class BTBS{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<prices.length;i++){
            prices[i]=sc.nextInt();
            
        }
        int Buycost=prices[0];
        
        array(prices,Buycost);

    }
    static void array(int prices[],int Buycost){
        
        int maxprofit=0;
        int Day=0;
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]<Buycost){
                Buycost=prices[i];
                Day=i+1;
            }
            //System.out.print("Best time to buy:"+(i+1));
        } 
        System.out.print("Best time to buy: Day "+ Day);
        System.out.println(); 
        for(int i=0;i<prices.length;i++) {   
            if(prices[i]>maxprofit){
                maxprofit=prices[i];
                Day=i+1;
            }
            //System.out.print("Best time to sell:"+(i+1));
        }
         System.out.print("Best time to sell: Day "+ Day);
    }
}