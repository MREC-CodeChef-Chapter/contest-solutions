import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
              Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();  //reading test-cases
             while(t-->0)
             {
                 int quantity=sc.nextInt();  //reading quantity
                 int price=sc.nextInt();  //price
                   int total_price=quantity*price;   //total amount
                 int answer=0;
                    if(total_price > 1000)   //to check whether can we get the discount
                    {
                        int discount=total_price/10;
                         answer=total_price-discount;
                         System.out.println(answer);
                    }
                 else{
                     answer=total_price;
                      System.out.println(answer);
                 }
             }
    }
}
