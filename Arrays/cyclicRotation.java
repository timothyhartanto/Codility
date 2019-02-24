class Solution {
    public int[] solution(int[] A, int K) {
        int[] nums = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            nums[(i + K) % A.length] = A[i];
        }
        return nums;
    }
}