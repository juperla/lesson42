package lesson4;

public class Count {
    public static void main(String[] args) {

        for (int i = 100; i > 0; i--) {
            int m = i % 4;
            if (m == 0) {
                System.out.println(i);

            }
        }

    }
}

