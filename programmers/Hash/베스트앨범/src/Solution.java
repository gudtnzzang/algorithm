import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        solution(genres,plays);
    }
    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> hm = new HashMap<>();

        for(int i=0; i<genres.length; i++) {
            hm.put(genres[i],hm.getOrDefault(genres[i],0) + plays[i]);
        }

        String maxKey = Collections.max(hm.entrySet(), HashMap.Entry.comparingByValue()).getKey();



        return answer;
    }
}