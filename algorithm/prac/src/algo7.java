public class algo7 {
    public String solution(String new_id) {
        StringBuffer sb = new StringBuffer(new_id.toLowerCase().replaceAll("[^\\-\\w._]", ""));

        boolean check = false;
        int s = 0;
        int e = 0;
        for(int i = 0; i < sb.length(); i++){
            if(!check){
                if(sb.charAt(i) == '.'){
                    check = true;
                    s = i;
                }
            }else{
                if(sb.charAt(i) != '.' || i==sb.length()-1){
                    check = false;
                    e = i;
                }
            }
        }
        System.out.println(sb +"  "+s+"  "+e);
        sb.replace(s,e+1,".");

        if(sb.length() != 0 && sb.charAt(0) == '.'){
            sb = sb.replace(0,1,"");
        }
        if( sb.length() != 0 && sb.charAt(sb.length()-1) == '.') {
            sb = sb.replace(sb.length()-1, sb.length(), "");
        }

        System.out.println(sb);
        String answer = sb.toString();
        if(answer.length() == 0){
            answer += "a";
        }
        if(answer.length()>15){
            answer = answer.substring(0,15);
        }

        while (answer.length()<3){
            answer += answer.charAt(answer.length()-1);
        }

        return answer;
    }
}
