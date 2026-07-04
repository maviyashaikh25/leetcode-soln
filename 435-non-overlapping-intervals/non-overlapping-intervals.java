import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Sort by end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int removals = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= prevEnd) {
                // Non-overlapping → keep it
                prevEnd = intervals[i][1];
            } else {
                // Overlap → remove this one
                removals++;
            }
        }

        return removals;
    }
}
