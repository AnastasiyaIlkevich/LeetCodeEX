package RomanToInteger;

public class RomanToIntegerTheBest {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int getChar = s.length() - 1;
        int sum = 0;
        int correct = 0;
        int temp = 0;
        while (getChar >= 0) {
            switch (s.charAt(getChar--)) {
                case 'I':
                    temp = 1;
                    break;
                case 'V':
                    temp = 5;
                    break;
                case 'X':
                    temp = 10;
                    break;
                case 'L':
                    temp = 50;
                    break;
                case 'C':
                    temp = 100;
                    break;
                case 'D':
                    temp = 500;
                    break;
                case 'M':
                    temp = 1000;
                    break;
            }
            if (temp < correct) {
                sum -= temp;
            } else {
                sum += temp;
            }
            correct = temp;
        }
        System.out.println(sum);
    }
}
