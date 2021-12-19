package sii.maroc;

import java.util.HashMap;
import java.util.Map;

public class Pizza implements Recipe{
    public static Map<String,Integer> ingredients = new HashMap<String,Integer>(){{
        put("olive oil", -1);
        put("ball of Mozzarella",1);
        put("tomatoes",2);
    }

    };
    public static int prepTime  = 10;
}
