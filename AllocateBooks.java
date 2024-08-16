public class Solution {
    // Helper function to check if it's possible to allocate books such that
    // no student reads more than maxPages
    private boolean isPossible(ArrayList<Integer> A, int B, int maxPages) {
        int studentCount = 1;
        int currentPages = 0;

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > maxPages) {
                return false;
            }

            if (currentPages + A.get(i) > maxPages) {
                studentCount++;
                currentPages = A.get(i);

                if (studentCount > B) {
                    return false;
                }
            } else {
                currentPages += A.get(i);
            }
        }

        return true;
    }

    public int books(ArrayList<Integer> A, int B) {
        if (B > A.size()) {
            return -1;
        }

        int start = 0;
        int end = 0;
        for (int i = 0; i < A.size(); i++) {
            end += A.get(i);
        }

        int result = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(A, B, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }
}
