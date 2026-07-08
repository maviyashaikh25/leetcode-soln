import java.util.*;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0) return result;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]])
        );

        minHeap.offer(new int[]{0, 0});
        Set<String> visited = new HashSet<>();
        visited.add("0,0");

        while (!minHeap.isEmpty() && result.size() < k) {
            int[] pair = minHeap.poll();
            int i = pair[0], j = pair[1];
            result.add(Arrays.asList(nums1[i], nums2[j]));

            if (i + 1 < nums1.length && visited.add((i+1) + "," + j)) {
                minHeap.offer(new int[]{i+1, j});
            }
            if (j + 1 < nums2.length && visited.add(i + "," + (j+1))) {
                minHeap.offer(new int[]{i, j+1});
            }
        }
        return result;
    }
}
