import java.io.IOException;
import java.util.*;

class Solution3 {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreMap = new HashMap<>();

        for(int i = 0; i < genres.length; i++){
            genreMap.put(genres[i], genreMap.getOrDefault(genres[i], 0)+plays[i]);
        }

        List<String> genreList = new ArrayList<>();

        while (!genreMap.isEmpty()){
            int a = 0;
            String t = "";
            for(String genre : genreMap.keySet()){
                if(a<genreMap.get(genre)){
                    a = genreMap.get(genre);
                    t = genre;
                }
            }
            genreMap.remove(t);
            genreList.add(t);
        }

        List<Integer> answerList = new ArrayList<>();

        for(String compare : genreList){
            int a = -1;
            int b = -1;
            int indexA = 0;
            int indexB = 0;

            for(int i = 0; i < genres.length; i++){
                if(compare.equals(genres[i])){
                    if(a <= plays[i]){
                        b = a;
                        a = plays[i];
                        indexB = indexA;
                        indexA = i;
                    }
                }
            }

            if(b!=-1) {
                if (a == b) {
                    answerList.add(Math.min(indexA, indexB));
                    answerList.add(Math.max(indexA, indexB));
                } else {
                    answerList.add(indexA);
                    answerList.add(indexB);
                }
            }else {
                answerList.add(indexA);
            }
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class Hash3 {
    public static void main(String[] args) throws IOException {
        Solution3 solution = new Solution3();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        //                    0       1        2         3       4          5         6         7
        String[] genres2 = {"jazz", "jazz", "classic", "pop", "classic", "classic", "pop", "ballad"};
        int[] plays2 =     {   300,    500,       500,   600,       150,       800,  2500,    900};
        String[] genres3 = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays3 = {1000, 800, 50, 1200, 2500};
        String[] genres4 = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays4 = {500, 600, 150, 800, 2500};

        String[] genres5 = {"classic", "pop", "classic", "classic", "pop", "jpop"};
        int[] plays5 = {          500,   600,       150,       800,  2500,   3000};

        //                     0          1       2            3        4
        String[] genres6 = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays6 = {          500,   600,       800,       800,  2500};

        System.out.println(Arrays.toString(solution.solution(genres5, plays5)));


    }
}
