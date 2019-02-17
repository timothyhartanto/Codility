class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] numbers = new int[1000001];
        int value = 0;
        for(int i = 0; i < A.length; i++) {
            value = A[i];
            if(value > 0 && numbers[value] == 0) {
                numbers[value] = 1;
            }
        }
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] == 0)
                return i;
        }
        return 1;
    }
}