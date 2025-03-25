package renuka;

import java.util.*;

public class RelativeRank {
    Map<Integer, String> medalMap;

    public RelativeRank() {
        medalMap = new HashMap();
        medalMap.put(1, "Gold Medal");
        medalMap.put(2, "Silver Medal");
        medalMap.put(3, "Bronze Medal");
    }

    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        int[] arrayCopy = Arrays.copyOf(score, score.length);
        arrayCopy = Arrays.stream(arrayCopy).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
//        Arrays.sort(score, (a, b) -> (score[b] - score[a])); // requires type T
        int index = 1;
        Map<Integer, Integer> position = new HashMap<>();
        for (int i : arrayCopy) {
            position.put(i, index++);
        }
        System.out.println("position map = "+ position);
        for (int i = 1; i <= score.length; i++) { // 10,3,8,9,4
            Integer rank = position.get(score[i-1]);
            if (rank <= medalMap.size()) {
                answer[i-1] = medalMap.get(rank);
            } else {
                answer[i - 1] = String.valueOf(rank);
            }
        }
        return answer;
    }
}

class RelativeRankUsingHeap extends RelativeRank {

    @Override
    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
                Comparator.<Integer>comparingInt(o -> score[o]).reversed());
        //Comparator<Integer> c=(x,y)-> Integer.compare(score[x],score[y]);
        // equivalent to (o1, o2) -> Integer.compare(score[o2], score[o1])
        for (int i = 0; i < score.length; i++) {
            maxHeap.add(i);
        }
        for (int i = 0; i < score.length; i++) { // 3,8,9,4,1    0 1 2 3 4
            Integer index = maxHeap.remove();
            if (i < medalMap.size()) {
                answer[index] = medalMap.get(i+1);
            } else {
                answer[index] = String.valueOf(i+1);
            }
        }
        return answer;
    }
}