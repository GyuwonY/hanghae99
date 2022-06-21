import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution2 {
    public int solution(String[][] clothes) {
        int answer = 1;
        Set<String> type = new HashSet<>();

        for(String[] a : clothes){
            type.add(a[1]);
        }

        Iterator<String> types = type.iterator();

        while (types.hasNext()){
            int cnt = 0;
            String t = types.next();
            for(String[] a : clothes){
                if(a[1].equals(t)){
                    cnt++;
                }
            }
            answer = answer * (cnt+1);
        }

        return answer-1;
    }
}

public class Hash2 {
    public static void main(String[] args) throws IOException {
        Solution2 solution = new Solution2();
        String[][] phone_book = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] phone_book2 = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution.solution(phone_book));
        System.out.println(solution.solution(phone_book2));
    }
}
