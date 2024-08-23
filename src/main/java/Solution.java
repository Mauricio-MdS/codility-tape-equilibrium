class Solution {
    public int solution(int[] A) {
        long totalSum = 0;
        long leftSum = 0;

        for (int n : A) {
            totalSum += n;
        }

        long minimumDifference =  Long.MAX_VALUE;

        for (int n : A) {
            leftSum += n;
            long rightSum = totalSum - leftSum;
            minimumDifference = Math.min(minimumDifference, Math.abs(leftSum - rightSum));
        }

        return (int) minimumDifference;
    }
}
