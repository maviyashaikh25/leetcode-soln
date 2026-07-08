import java.util.*;

class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(freqMap.entrySet());

        StringBuilder sb = new StringBuilder();
        while (maxHeap.size() > 1) {
            Map.Entry<Character, Integer> first = maxHeap.poll();
            Map.Entry<Character, Integer> second = maxHeap.poll();

            sb.append(first.getKey());
            sb.append(second.getKey());

            if (first.getValue() - 1 > 0) {
                first.setValue(first.getValue() - 1);
                maxHeap.offer(first);
            }
            if (second.getValue() - 1 > 0) {
                second.setValue(second.getValue() - 1);
                maxHeap.offer(second);
            }
        }

        if (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> last = maxHeap.poll();
            if (last.getValue() > 1) return "";
            sb.append(last.getKey());
        }

        return sb.toString();
    }
}
