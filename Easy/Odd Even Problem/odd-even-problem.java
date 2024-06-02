//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.oddEven(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static String oddEven(String s) {
        int evenCount = 0;
        int oddCount = 0;
        HashMap<Character, Integer> checkPositionMap = new HashMap<>();
        HashMap<Character, Integer> checkFrequencyMap = new HashMap<>();
        for(char ch = 'a'; ch <= 'z'; ch++){
            checkPositionMap.put(ch, ch - 'a' + 1);
        }
        for(int i = 0; i < s.length(); i++){
            checkFrequencyMap.put(s.charAt(i), checkFrequencyMap.getOrDefault(s.charAt(i),0)+1);
        }
        for(char ch : checkFrequencyMap.keySet()){
            if(checkPositionMap.get(ch) % 2 == 0){
                if(checkFrequencyMap.get(ch) % 2 == 0){
                    evenCount++;
                }
            }
            else{
                if(checkFrequencyMap.get(ch) % 2 != 0){
                    oddCount++;
                }
            }
        }
        int check = evenCount + oddCount;
        if(check % 2 == 0){
            return "EVEN";
        }
        return "ODD";
    }
}
