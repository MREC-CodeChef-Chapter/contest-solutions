import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
           if(n%2==0)    //number is even
           {
               System.out.println("WIN");
           }
          else{            //number is odd
               System.out.println("FAIL");
          }
    }
}
