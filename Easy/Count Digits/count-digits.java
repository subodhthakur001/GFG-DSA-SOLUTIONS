//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static int evenlyDivides(int N){
        int totalSum = 0;
        int number = N;
        while(N > 0){
            int lastDigit = N % 10;
            if(lastDigit != 0){
              if(number % lastDigit == 0){
              totalSum++;
            }
                
            }
            
            N = N / 10;
        }
        return totalSum;
    }
    
}