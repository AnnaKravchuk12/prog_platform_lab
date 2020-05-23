//Count of numbers between range having only non-zero digits whose sum of digits is N and number is divisible by M

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
      
static int M = 20;  
  
// states - position, sum, rem, tight  
// sum can have values upto 162, if we  
// are dealing with numbers upto 10^18  
// when all 18 digits are 9, then sum  
// is 18 * 9 = 162  
static int dp[][][][] = new int [M][165][M][2];  
  
// n is the sum of digits and number should  
// be divisible by m  
static int n, m;  
  
// Function to return the count of  
// required numbers from 0 to num  
static int count(int pos, int sum, int rem, int tight,  
        int nonz, Vector<Integer> num)  
{  
    // Last position  
    if (pos == num.size()) 
    {  
        if (rem == 0 && sum == n)  
            return 1;  
        return 0;  
    }  
  
    // If this result is already computed  
    // simply return it  
    if (dp[pos][sum][rem][tight] != -1)  
        return dp[pos][sum][rem][tight];  
  
    int ans = 0;  
  
    // Maximum limit upto which we can place  
    // digit. If tight is 1, means number has  
    // already become smaller so we can place  
    // any digit, otherwise num[pos]  
    int limit = (tight != 0 ? 9 : num.get(pos));  
  
    for (int d = 0; d <= limit; d++) 
    {  
  
        // If the current digit is zero  
        // and nonz is 1, we can't place it  
        if (d == 0 && nonz != 0)  
            continue;  
        int currSum = sum + d;  
        int currRem = (rem * 10 + d) % m;  
        int currF = (tight != 0 || (d < num.get(pos))) ? 1 : 0;  
        ans += count(pos + 1, currSum, currRem,  
                    currF, (nonz != 0 || d != 0) ? 1 : 0, num);  
    }  
    return dp[pos][sum][rem][tight] = ans;  
}  
  
// Function to convert x into its digit vector  
// and uses count() function to return the  
// required count  
static int solve(int x)  
{  
    Vector<Integer> num = new Vector<Integer>();  
    while (x != 0)  
    {  
        num.add(x % 10);  
        x /= 10;  
    }  
    Collections.reverse(num);  
  
    // Initialize dp  
    for(int i = 0; i < M; i++) 
        for(int j = 0; j < 165; j++) 
            for(int k = 0; k < M; k++) 
                for(int l = 0; l < 2; l++) 
                    dp[i][j][k][l]=-1; 
      
    return count(0, 0, 0, 0, 0, num);  
}  
  
// Driver code  
public static void main(String args[])  
{  
    int L = 1, R = 100;  
    n = 8; m = 2;  
    System.out.print( solve(R) - solve(L));  
}  
} 
