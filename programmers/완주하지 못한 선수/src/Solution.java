import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

        HashMap<String,Integer> h = new HashMap<>();

        String[] array_1 = {"a", "a", "b", "c", "d"};
        String[] array_2 = {"a", "b", "c", "a"};
        System.out.println(solution(array_1, array_2));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String,Integer> hm = new HashMap<>();
        for(String p : participant) {
            hm.put(p, hm.getOrDefault(p,0) + 1);
        }

        for(String c : completion) {
            hm.put(c, hm.get(c) - 1);
        }

        for(String key : hm.keySet()) {
            if(hm.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }
}