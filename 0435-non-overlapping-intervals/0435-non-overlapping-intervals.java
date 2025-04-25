class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));
        int count = 0;
        int prev_e = Integer.MIN_VALUE;
        for(int[] interval : intervals){
            int start = interval[0];
            int end = interval[1];
            if(prev_e > start){
                count++;
            }else{
                prev_e = end;
            }
        }
        return count;
    }
}

