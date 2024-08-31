class Solution {
    public int print2largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i] != largest) secondLargest = arr[i];
        }
        if(secondLargest<0) return -1;
        return secondLargest;
    }
}
