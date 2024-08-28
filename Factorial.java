class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        factorial(n,1,1,result);
        return result;
    }
    static void factorial(long n, long i, long fact, ArrayList<Long> result) {
        if(fact>n) return;
        
        result.add(fact);
        
        factorial(n,i+1,fact*(i+1),result);
    }
}
