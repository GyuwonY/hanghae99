import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tryCnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < tryCnt; i++){
            int num = Integer.parseInt(br.readLine());

            if(num==0){
                if(priorityQueue.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(priorityQueue.poll());
                }
            }else {
                priorityQueue.add(num);
            }
        }

    }
}
