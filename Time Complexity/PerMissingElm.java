class Solution {
    public int solution(int[] A) {
        int res = 0;
        for(int i = 0; i < A.length; i++) {
            res ^= A[i];
        }
         for(int i = 1; i <= A.length + 1; i++) {
            res ^= i;
        }
        return res;
    }
}