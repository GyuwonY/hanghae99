import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class algo1 {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};

        int[] cnts = {0,0,0};
        for(int i = 0; i< answers.length; i++){
            if (answers[i] == num1[i%5]){
                cnts[0]++;
            }
            if(answers[i] == num2[i%8]){
                cnts[1]++;
            }
            if(answers[i] == num3[i%10]){
                cnts[2]++;
            }
        }

        int max=0;
        for(int i : cnts){
            if(max<i){
                max = i;
            }
        }

        for(int i = 0; i < cnts.length; i++){
            if(max == cnts[i]){
                list.add(i+1);
            }
        }

        Integer[] answer = list.toArray(new Integer[list.size()]);

        return Arrays.stream(answer).mapToInt(Integer::intValue).toArray();
    }
}
