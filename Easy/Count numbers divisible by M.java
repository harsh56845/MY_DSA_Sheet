// Problem Link :- https://www.geeksforgeeks.org/problems/count-numbers-divisible-by-m1524/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
//User function Template for Java
class Solution {
    static int countDivisibles(int A, int B, int M){
// Brute foree TC -> O(B-A) and SC-> O(1)
    int count = 0;
    for(int i=A;i<=B;i++) if(i%M==0){ count++;}else i++;
    return count;

// better TC -> O((B-A)/M) and SC-> O(1)
    int count = 0;
    for(int i=A;i<=B;) if(i%M==0){ count++; i=i+M;}else i++;
    return count;


//optmised  TC -> O(1) and SC-> O(1)
    return A%M==0? (B/M-A/M+1) : B/M-A/M;  
    }
}
