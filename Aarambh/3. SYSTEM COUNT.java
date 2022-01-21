import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           int t=sc.nextInt();  //reading test-cases
           while(t-->0){
          int n=sc.nextInt();   //reading n
          int m=sc.nextInt();   //reading m
        int ans=0;
           int a[][]=new int[n][m]; //creating 2-d array of size n*m
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();   //reading elements in 2-d array
                     if(a[i][j]==0)  //checking whether element is 0 or not
                     {
                         ans++;     
                     }
                }
            }
        System.out.println(ans);
           }
    }
}
