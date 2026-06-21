class Solution {
    public int climbStairs(int n) {
       if(n ==1) return 1;
       if(n ==2) return 2;

       int n1 =1;
       int n2 = 2;
       int crr =0;
       for(int i =3;i<=n;i++){
         crr = n1+n2;
         n1 = n2;
         n2 = crr;
       }
       return crr;
    }
}

// time complexity is t(n) = 2k + t(n-1) +t(n-2);

// time complexity is o(2^n); this is going to run because or n is small 1 <= n <= 45 

// class Solution {
//     public int climbStairs(int n) {
//         // base case 
//         if(n ==1){
//             return 1;
//         }
//         if(n==2){
//             return 2;
//         }

//         int ans = climbStairs(n-1) + climbStairs(n-2);
//         return ans;
//     }
// }