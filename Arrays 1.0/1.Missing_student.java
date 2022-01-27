import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int t,n;// t is for test cases and n is the size of the Array
        t=s.nextInt();
        while(t-->0)
        {
            n=s.nextInt();// size of array
            int A[]=new int[n]; // is the array
            for(int i=1;i<n;i++)
            A[i]=s.nextInt();//roll numbers
            for(int i=1;i<n;i++)
            {
                if(A[i]!=i)
                {
                    System.out.println(i);
                    break;
                }
            }
            if(A[n-1]!=n)
            System.out.println(n);
            
        }
    }
}
