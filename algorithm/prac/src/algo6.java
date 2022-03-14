public class algo6 {
    public String solution(String s, int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer(s);
        for(int i=0; i<s.length(); i++){
            if((int)sb.charAt(i)!=32){
                if(Character.isUpperCase(sb.charAt(i))){
                    int c = sb.charAt(i)+n;
                    if(c>90){
                        c -= 26;
                    }
                    sb = sb.replace(i,i+1,Character.toString((char)c));
                }else {
                    int c = sb.charAt(i)+n;
                    if(c>122){
                        c -= 26;
                    }
                    sb = sb.replace(i,i+1,Character.toString((char)c));
                }
            }
        }

        answer = sb.toString();
        return answer;
    }
}
