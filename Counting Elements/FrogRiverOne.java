class Solution {
    public int solution(int X, int[] A) {
        int[] leaves = new int[X + 1];
        int count = 0;
        for(int i = 0; i < A.length; i++) {
            if(leaves[A[i]] == 0){
                leaves[A[i]] = 1;
                count++;
            }
            if(count == X)
                return i;
        }
        return -1;
    }
}