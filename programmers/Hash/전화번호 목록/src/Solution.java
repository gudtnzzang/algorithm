import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String[] phone_book = {"14","88","1235","12","5"};
        System.out.println(solution(phone_book));
    }
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        for(int i=0; i<phone_book.length - 1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}