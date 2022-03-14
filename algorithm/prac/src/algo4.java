public class algo4 {
    public int solution(int[] nums) {
        int answer = 0;

        boolean check = true;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int num = nums[i]+nums[j]+nums[k];
                    for(int n = 2; n<=(int)Math.sqrt(num); n++){
                        if(check==true) {
                            if (num % n == 0) {
                                check = false;
                                break;
                            }
                        }
                    }
                    if(check == true){
                        answer++;
                    }
                    check = true;
                }
            }
        }
        return answer;
    }
}
