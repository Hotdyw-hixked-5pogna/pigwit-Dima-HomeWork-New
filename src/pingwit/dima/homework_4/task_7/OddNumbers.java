package pingwit.dima.homework_4.task_7;

public class OddNumbers {
    public static void main(String[] args) {
        int odd = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                odd = odd + i;
                System.out.println(i);
            }
        }
        System.out.println(odd);
    }
}
