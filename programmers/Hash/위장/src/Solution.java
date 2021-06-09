import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }
    public static int solution(String[][] clothes) {
        int answer = 0;

        HashMap<String, Integer> hm = new HashMap<>();
        for(String[] c : clothes){
            hm.put(c[1], hm.getOrDefault(c[1],1) + 1);
        }

        int caseCnt = 1;
        for(String key : hm.keySet()) {
            caseCnt *= hm.get(key);
        }
        answer = caseCnt - 1;

        return answer;
    }
}