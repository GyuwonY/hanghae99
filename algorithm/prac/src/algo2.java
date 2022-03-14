import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class algo2 {
    public String[] solution(String[] strings, int n) {
        List<String> answer = new ArrayList<>();
        List<String> list = new ArrayList<>();

        Arrays.sort(strings);

        for (String s : strings) {
            list.add(s);
        }

        String min = list.get(0);
        while (answer.size() <= strings.length) {
            for (String s : list) {
                if ((int) s.charAt(n) < (int) min.charAt(n)) {
                    min = s;
                }
            }
            if(list.size() == 1){
                answer.add(list.get(0));
                break;
            }
            answer.add(min);
            list.remove(min);
            min = list.get(0);
        }
        return answer.toArray(new String[answer.size()]);
    }
}
