package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //key value pair
        Map<String,String> map=new HashMap<>();
        map.put("name","john");
        map.put("Email","aa@gmail.com");
        map.put("car","null");
        map.put(null,"234");
        map.put(null,"123456234");
        System.out.println(map);


        map.putIfAbsent("password","abc123");
        map.putIfAbsent("password","abc1200003");//not over ride
        System.out.println(map);

        System.out.println(map.get("name"));

    }
}
