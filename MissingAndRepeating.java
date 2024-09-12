class Solve {
    int[] findTwoElement(int arr[]) {
        int n = arr.length;
        long sum = 0L;
        long sumSq = 0L;
        long sumN = (long) n*(n+1)/2;
        long sumNSq = (long) n*(n+1)*(2*n+1)/6;
        int result[] = new int[2];
        for(int i=0;i<n;i++) {
            sum += arr[i];
            sumSq += (long) arr[i]*arr[i];
        }
        long eq1 = sum-sumN;
        long eq2 = sumSq-sumNSq;
        long eq3 = eq2/eq1;
        result[0] = (int)(eq3+eq1)/2;
        result[1] = (int)(eq3-result[0]);
        return result;
    }
}
