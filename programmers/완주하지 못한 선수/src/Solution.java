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
            if(hm.get(p) != null) {
                hm.put(p, hm.get(p) + 1);
            }
            else {
                hm.put(p, 1);
            }
        }

        for(String c : completion) {
            hm.put(c, hm.get(c) - 1);
        }

        for(String p : participant) {
            if(hm.get(p) != 0) {
                answer = p;
            }
        }

        return answer;
    }
}