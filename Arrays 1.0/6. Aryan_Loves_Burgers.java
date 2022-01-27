Programming Language: JAVA

TC: O(N)+O(N*log(N))= "O(N*log(N))" per test case.
SC: O(N)

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner jin=new Scanner(System.in);
        int t=jin.nextInt();
        while(t-->0){
            int n=jin.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){   //taking input
                arr[i]=jin.nextInt();
            }
            Arrays.sort(arr);   //sorting all elements 
            //Arrays.sort() uses quick sort internally and quick sort's TC:O(n*log(n))
            
            int days_count=n/4; //finding number of days
            long sum=0L;
            for(int i=days_count;i<n;i+=3){ //as per the pattern observed incrementing count by 3 each time
                sum+=arr[i];    //adding all the elements after days_count days which are coming at index i
            }
            System.out.println(sum);    // printing the sum
        }
    }
}
