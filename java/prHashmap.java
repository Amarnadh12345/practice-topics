
import java.util.*;
public class prHashmap {
    public static void main(String[] args) {
        HashMap<String ,Integer> map=new HashMap<>();
        map.put("INDIA",60);
        map.put("Russia",70);
        map.put("US",90);
        System.out.println(map);
        //using conatinsKey metohd to check wether the given key contains in hashmap or not
        if(map.containsKey("Russia")){
            System.out.println("Key is present");
        }
        else{
            System.out.println("Key is not present");
        }
        //using 'get' method  to get value at the key
        System.out.println(map.get("INDIA"));
        System.out.println(map.get("Russia"));
        System.out.println(map.get("US"));;
        System.out.println(map.get("CHina"));// if the key is not present in exsisting hashmap it gives 'null' as a value
        // for(Map.Entry<String ,Integer> e : map.entrySet()){    //for loop to get map to set and get keys and values seperately
        //     System.out.println(e.getKey()); 
        //     System.out.println(e.getValue());
        // }
        // another iteration method to iterate with for loop using 'key' set
        Set<String> keys= map.keySet();
        for(String key:keys){
            System.out.println(key+ " "+map.get(key));
        }
        //using remove function we can remove map elements
        map.remove("US");
        System.out.println(map);


    }
}
