class Solution {
    public int[] solution(int N, int[] A) {
        int[] numbers = new int[N];
        int max = 0;
        int valueSetToMax = 0;
        boolean setToMax = false;
        for(int i = 0; i < A.length; i++) {
            if(A[i] > N){
                setToMax = true;
                valueSetToMax = max;
                continue;
            }
            else if(numbers[A[i] - 1] < valueSetToMax && setToMax){
                numbers[A[i] - 1] = valueSetToMax + 1;
            }
            else{
                numbers[A[i] - 1]++;
            }
            
            if(numbers[A[i] -1] > max){
                max = numbers[A[i] -1];
            }
        }
        for(int i = 0; i < N; i++) {
            if(numbers[i] < valueSetToMax){
                numbers[i] = valueSetToMax;
            }
        }
        return numbers;
    }
}