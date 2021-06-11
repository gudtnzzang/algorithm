import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] answer = solution(genres,plays);
        for(int a : answer) {
            System.out.println(a);
        }
    }
    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        int cnt = 0;
        HashMap<String, Integer> hm = new HashMap<>();

        for(int i=0; i<genres.length; i++) {
            hm.put(genres[i],hm.getOrDefault(genres[i],0) + plays[i]);
        }
        answer = new int[hm.size() * 2];
        for(int i=0; i<answer.length / 2; i++) {
            String maxKey = Collections.max(hm.entrySet(), HashMap.Entry.comparingByValue()).getKey();
            hm.remove(maxKey);

            HashMap<Integer, Integer> index = new HashMap<>();
            for (int j = 0; j < genres.length; j++) {
                if (genres[j] == maxKey) {
                    index.put(j, plays[j]);
                }
            }

            for(int l=0; l<2; l++) {
                Integer maxKey2 = Collections.max(index.entrySet(), HashMap.Entry.comparingByValue()).getKey();
                index.remove(maxKey2);
                answer[cnt++] = maxKey2;
            }
        }
        return answer;
    }
}