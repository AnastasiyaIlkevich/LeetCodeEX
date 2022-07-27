package AddTwoNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoNumbers {

    //Input: l1 = [2,4,3], l2 = [5,6,4]
    //Output: [7,0,8]
    //Explanation: 342 + 465 = 807.

    public static void main(String[] args) {
        int[] arrayListNum1 = {0};
        int[] arrayListNum2 = {0};


        List <Integer> list = new ArrayList<>();
        int result = number(arrayListNum1) + number(arrayListNum2);
        if (result ==0){
            int[] resultArray = {0};
            System.out.println(Arrays.toString(resultArray));
            System.exit(1);
        }

        for (int i = result; i >0 ; i=i/10) {
            list.add(i%10);
        }
        int[] resultArray = new int[list.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = list.get(i);
        }
        System.out.println(Arrays.toString(resultArray));
    }

    private static int number(int[] arrayListNum1) {
        int num = 0;
        int i = arrayListNum1.length - 1;
        int j = (int) Math.pow(10, arrayListNum1.length - 1);
        for (; i >= 0; i--, j = j / 10) {
            num = num + arrayListNum1[i] * j;
        }
        System.out.println(num);
        return num;
    }

}
