class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String binary = Integer.toBinaryString(N);
        String[] binaries = binary.split("");
        
        int max = 0;
        int count = 0;
        for(String b : binaries) {
            if(b.equals("1")) {
                max = count > max ? count : max;
                count = 0;
            }
            else {
                count++;    
            }
        }
        return max;
    }
}