package November;

public class AutobiographicNumber {
    public static boolean isAutobiographic(int number) {
        String numStr = Integer.toString(number);
        int[] count = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            if (digit >= count.length || digit != count[digit]) {
                return false;
            }
            count[digit]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != numStr.charAt(i) - '0') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10000; i++) {
            if (isAutobiographic(i)) {
                System.out.println(i + " is an autobiographic number");
            }
        }
    }
}

