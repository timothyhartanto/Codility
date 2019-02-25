class Solution {
    public int solution(int[] A) {
        int firstSum = A[0];
        int secondSum = 0;
        for(int i = 1; i < A.length; i++){
            secondSum += A[i];
        }
        int min = Math.abs(secondSum - firstSum);
        int diff = 0;
        for(int i = 1; i < A.length; i++){
            if(Math.abs(secondSum - firstSum) < min)
                min = Math.abs(secondSum - firstSum); 
            firstSum += A[i];
            secondSum -= A[i];
        }
        return min;
    }
}