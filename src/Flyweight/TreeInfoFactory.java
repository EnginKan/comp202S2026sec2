package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeInfoFactory {


    private static Map<String,TreeInfo> pool=new HashMap<String,TreeInfo>();
      //key: "name-type"
    public static TreeInfo getInfo(String name, String type){
        String key=name+"-"+type;
                if(!pool.containsKey(key))
                    pool.put(key,new TreeInfo(name,type));

                return pool.get(key);



    }
}
