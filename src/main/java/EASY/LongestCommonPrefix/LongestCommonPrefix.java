package EASY.LongestCommonPrefix;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {



        String[] strs = {"flower","flow","flight"};
//        Set<Character> list = new LinkedHashSet<>();
//        int size = Integer.MAX_VALUE;
//        int sizeTemp = 0;
//        for (int i = 0, j = i + 1; j < strs.length; i++, j++) {
//
//            sizeTemp = 0;
//            for (int k = 0; k < strs[i].length() && k < strs[j].length(); k++) {
//                if (strs[i].charAt(k) == strs[j].charAt(k)) {
//                    list.add(strs[i].charAt(k));
//                    ++sizeTemp;
//                }else break;
//            }
//            if (size > sizeTemp) {
//                size = sizeTemp;
//            }
//        }
//        String str="";
//
//        Iterator<Character> iterator = list.iterator();
//        while (iterator.hasNext()&& size>0){
//            str = str + Character.toString(iterator.next());
//            --size;
//        }
//        System.out.println(size);
//        System.out.println("->>>>"+str);


        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) prefix = "";
            }
        if (strs.length == 0) prefix = "";
        System.out.println(prefix);
    }
}
