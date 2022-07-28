package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        char[] charArr = s.toCharArray();
        int num = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (i == charArr.length - 1) {
                num = num + map.get(String.valueOf(charArr[i]));
                break;
            }

            String str = Character.toString(charArr[i]) + Character.toString(charArr[i + 1]);
            if (map.containsKey(str)) {
                num = num + map.get(str);
                ++i;
            } else {
                num = num + map.get(String.valueOf(charArr[i]));
            }
        }
        System.out.println(num);
    }
}
