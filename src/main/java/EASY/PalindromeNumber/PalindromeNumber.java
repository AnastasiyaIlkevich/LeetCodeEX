package EASY.PalindromeNumber;

public class PalindromeNumber {
    public static void main(String[] args) {
        //1
        int x = 121;
        String str = String.valueOf(x);
        String str2 = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(str2));

        //2
        int xx = x;
        int temp = 0;
        boolean flag = false;
        while (xx > 0) {

            temp = (xx % 10) + (temp * 10);
            xx = xx / 10;
        }
        if (x == temp) {
            flag = true;
        }
        System.out.println(flag);

        //3
        boolean resaut = false;
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            resaut = true;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        resaut = x == revertedNumber || x == revertedNumber / 10;
        System.out.println(resaut);
    }
}





