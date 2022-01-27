
Programming Language: JAVA

i.) Using "%" operator:

TC: O(N) per test case.
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
            int even_Cnt=0,odd_cnt=0,max=0,min=10001;
            for(int i=0;i<n;i++){	
                arr[i]=jin.nextInt();		//reading input
                if(arr[i]>max)max=arr[i];	//finding max element
                if(arr[i]<min)min=arr[i];	//finding min element
            }
            for(int i=0;i<n;i++){	//this loop counts no. of even and odd elements
                if((arr[i]%2)==0){
                    even_Cnt++;
                }else{
                    odd_cnt++;
                }
            }
            if(even_Cnt!=n && odd_cnt!=n){	//if even count is not n and odd count is not n
                System.out.println(-1);		//print -1
            }else{
                int diff=max-min;		//find the difference and print diff/2
                System.out.println(diff/2);
            }
        }
    }
}

ii.) Using bitwise and operator


TC: O(N) per test case.
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
            int even_Cnt=0,odd_cnt=0,max=0,min=10001;
            int flag=0; //even 10 & 01= 0
            for(int i=0;i<n;i++){		//reading all elements and finding min and max
                arr[i]=jin.nextInt();
                if(arr[i]>max)max=arr[i];
                if(arr[i]<min)min=arr[i];
            }
            if((arr[0]&1)==1)flag=1; //first elements is odd
            boolean res=true;
            for(int i=0;i<n;i++){	// checking if all elements are odd or all are even
                //prefix bitwise "and"
                int value=arr[i]&1;
                if(value!=flag)  // if one is odd other is even, vice versa so neither all odd neither all even so break
                {
                    res=false;
                    break;
                }
                
            }
            if(!res){
                System.out.println(-1);
            }else{			// printing diff/2
                //max-min
                int diff=max-min;
                System.out.println(diff/2);
            }
        }
    }
}

iii.) Optimized space complexity.

TC: O(N) per test case.
SC: O(1)

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner jin=new Scanner(System.in);
        int t=jin.nextInt();
        while(t-->0){
            int n=jin.nextInt();
            int even_Cnt=0,odd_cnt=0,max=0,min=10001;
            
            for(int i=0;i<n;i++){    
                int value =jin.nextInt();        //reading input
                if(value>max)max=value;    //finding max element
                if(value<min)min=value;    //finding min element
                if((value%2)==0) even_Cnt++; //find even count and odd count
                else odd_cnt++;
            }
            if(even_Cnt!=n && odd_cnt!=n){    //if even count is not n and odd count is not n
                System.out.println(-1);        //print -1
            }else{
                int diff=max-min;        //find the difference and print diff/2
                System.out.println(diff/2);
            }
        }
    }
}
