import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int maxStart = A[0] * A[1] * A[A.length - 1];
        int maxEnd = A[A.length - 3] * A[A.length - 2] * A[A.length - 1];
        return maxStart > maxEnd ? maxStart : maxEnd;
    }
}