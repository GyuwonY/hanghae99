package test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

    public static void main(String[] args) throws IllegalAccessException {
        Callback callback = new Callback();
        List<User> users = new ArrayList<>();

        for(long i =1L; i<= 10; i++){
            User user = new User(i);
            users.add(user);
        }

        while (true) {
            System.out.println(callback.rival(users, users.get(0)));
        }
    }

}




