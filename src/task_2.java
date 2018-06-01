import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("Введите 2 любых целых числа: ");
        int a = k.nextInt();
        int b = k.nextInt();
        int f = a;
        int g = b;
        if (a > 0 & b > 0) {
            while (g != 0) {
                int tmp = f % g;
                f = g;
                g = tmp;
            }
            System.out.println("НОД чисел введенных чисел: " + f);
            int nok = a / f * b;
            System.out.println("НОК введенных чисел : " + nok);
        } else {
            System.out.println("Вы некорректно ввели числа");
        }
    }
}