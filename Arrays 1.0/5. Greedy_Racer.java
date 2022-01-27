Programming Language: Java

i.) 
TC:O(N^2) per test case. 
SC:O(N)

import java.util.*;

public class Main{
    public static void main(String []args){
        Scanner jin=new Scanner(System.in);
        int t=jin.nextInt();
        while(t-->0){
            int n=jin.nextInt();
            int fuel[]=new int[n];
            int req_fuel[]=new int[n];
            int fuel_difference[]=new int[n];
            long sum=0L;
            for(int i=0;i<n;i++){   //reading fuel array
                fuel[i]=jin.nextInt();
            }
            for(int i=0;i<n;i++){   //reading req_fuel array
                req_fuel[i]=jin.nextInt();
            }
            for( int i=0;i<n;i++){  //difference in fuels
                fuel_difference[i]=fuel[i]-req_fuel[i];
                sum+=fuel_difference[i];
            }
            if(sum<0)System.out.println(-1);//tot fuel req is more than tot fuel we have
            else{
                sum=0L;
                int pitstop=0,flag=0;
                //considering each pitstop and checking if its possible to reach back 
                //using brute forced N^2 approach
                for(int i=0;i<n;i++){
                    int rep=0;
                    for(int j=i;j<n;j++){
                        sum+=fuel_difference[j];
                        if(sum<0){  //circuit incomplete
                            flag=1;
                            break;
                        }
                        if(j==n-1 && rep==1)break; // handle circular loop (over)
                        else if(j==n-1){    //handle circular loop (start)
                            rep=1;
                            j=-1;
                        }
                    }
                    if(flag==1){ //preparing to restart the circuit from next pitstop
                        sum=0;
                        flag=0;
                    }else if(flag==0){  //circuit complete
                        pitstop=i;
                        break;
                    }
                }
                if(flag==0)System.out.println(pitstop+1); //not 0 indexed but 1 indexed
                else System.out.println(-1);
            }
        }
    }
}

ii.) Greedy Approach

TC: O(N) per test case
SC: O(N)

import java.util.*;

public class Main{
    public static void main(String []args){
        Scanner jin=new Scanner(System.in);
        int t=jin.nextInt();
        while(t-->0){
            int n=jin.nextInt();
            int fuel[]=new int[n];
            int req_fuel[]=new int[n];
            int fuel_difference[]=new int[n];
            long sum=0L;
            for(int i=0;i<n;i++){   //reading fuel array
                fuel[i]=jin.nextInt();
            }
            for(int i=0;i<n;i++){   //reading req_fuel array
                req_fuel[i]=jin.nextInt();
            }
            for( int i=0;i<n;i++){  //finding difference
                fuel_difference[i]=fuel[i]-req_fuel[i];
                sum+=fuel_difference[i];
            }
            if(sum<0)System.out.println(-1); ////tot fuel req is more than tot fuel we have
            else{
                sum=0L;
                int pitstop=0;
                
                for(int i=0;i<n;i++){
                    sum+=fuel_difference[i];
                        //at some pitstop Pj we realize total sum of fuel is going negative from pitstop Pi
                    if(sum<0){  
                        sum=0;
                        pitstop=i+1; 
                        //skipping all pitstops from Pi to Pj as we couldn't reach from Pi we will not be able to reach from these also.
                        //greedy approach making it O(n) solution 
                    }
                }
                System.out.println(pitstop+1); //not 0 indexed but 1 indexed
            }
        }
    }
}

