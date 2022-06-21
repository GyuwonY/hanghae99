import java.io.IOException;
import java.util.Arrays;

class Solution1 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length-1; i++){
            if(phone_book[i].length() <= phone_book[i+1].length()){
//                if (phone_book[i].equals(phone_book[i + 1].substring(0, phone_book[i].length()))) {
                if (phone_book[i+1].startsWith(phone_book[i])) {
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
}

public class Hash1 {
    public static void main(String[] args) throws IOException {
        Solution1 solution = new Solution1();
        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123", "2","456","789"};
        String[] phone_book3 = {"12","123","1235","567","88"};
        System.out.println(solution.solution(phone_book));
        System.out.println(solution.solution(phone_book2));
        System.out.println(solution.solution(phone_book3));
    }
}
