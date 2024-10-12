class Solution {
    public int generateKey(int num1, int num2, int num3) {
      StringBuilder result = new StringBuilder();
      while(num1 != 0 && num2 != 0 && num3 != 0) {
        int rem1 = num1%10, rem2 = num2%10, rem3 = num3%10;
        result.insert(0,Math.min(rem1,Math.min(rem2,rem3)));
        num1 /= 10; num2 /= 10; num3 /= 10;
      }
      return Integer.parseInt(result.toString());  
    }
}
