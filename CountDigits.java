class Solution{
    static int evenlyDivides(int N){
        int count = 0;
        int n = N;
        while(n!=0) {
            int digit = n%10;
            n = n/10;
            if(digit == 0) continue;
            if(N%digit == 0) count++;
        }
        return count;
    }
}
