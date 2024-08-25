class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        long oA = A, oB = B;
        long gcd = 1, lcm = 1;
        Long[] ans = new Long[2];
        while(A>0 && B>0) {
            if(A>B) A = A%B;
            else B = B%A;
        }
        if(A==0) gcd = B;
        else gcd = A;
        lcm = (oA*oB)/gcd;
        ans[0] = lcm;
        ans[1] = gcd;
        return ans;
    }
};
