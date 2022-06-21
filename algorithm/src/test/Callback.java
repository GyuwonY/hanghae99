package test;


import java.util.List;
import java.util.Random;

public class Callback{
    public Long rival(List<User> users, User user){
        Random random = new Random();
        Long rival = users.get(random.nextInt(users.size())).getUserId();
        while (rival == user.getUserId()){
            rival = rival(users, user);
        }
        return rival;
    }
}