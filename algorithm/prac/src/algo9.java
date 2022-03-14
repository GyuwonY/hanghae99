public class algo9 {
    public int solution(int n) {
        int answer = n;
        for(int i =1; i<=Math.ceil(n/2); i++){
            if(n%i == 0){
                answer += i;
            }
        }
        return answer;
    }
}
