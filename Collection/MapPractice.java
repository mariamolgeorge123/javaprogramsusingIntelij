package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {
        Map<String,String> num=new HashMap<>();
        num.put("name","Anu");
        num.put("Email","anu@gmail.com");
        num.put("age","18");
        num.put("null","null");
        num.put("null","data");
        System.out.println(num);
        System.out.println(num.get("name"));
        System.out.println(num.keySet());
        Set<String> s=new HashSet<>();
        s=num.keySet();
        for (String s1:s)
        {
            System.out.println(s1);
        }
        num.remove(null);
        System.out.println(num);

        num.putIfAbsent("password","123");
        num.putIfAbsent("password","234");
        System.out.println(num);
        System.out.println(num.containsKey("password"));
        System.out.println(num.containsValue("123"));
        num.remove("password","123");
        System.out.println(num);
        System.out.println(num.size());


    }
}
