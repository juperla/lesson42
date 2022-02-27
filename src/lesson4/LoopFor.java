package lesson4;

public class LoopFor {
    static final int start = 100;
    static final int end = 1;

    public static void main(String[] args) {

        for (int i = start; i > end; i--) {
            if (isFourNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isFourNumber(int n) {
        if (n % 4 == 0) {
            return true;
        }
        return false;
    }
}
