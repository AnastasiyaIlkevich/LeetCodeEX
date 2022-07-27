package EASY.PalindromeNumber;

public class PalindromeNumber {
    public static void main(String[] args) {
        String str = String.valueOf(121);
        String str2 = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(str2));
    }
}
