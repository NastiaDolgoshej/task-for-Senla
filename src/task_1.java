import java.util.Scanner;

public class task_1 {
    public static void main(String[] args)
    {
        System.out.println("Введите целое число ");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        if (number % 1 == 0)
        {
            if (number % 2 == 0)
            {
                System.out.print("Данное число четное");
            }
            else { System.out.print("Данное число нечетное"); }

            for ( int i=2; i < number; i++) {
            if ( number%i == 0)
            {
                System.out.println(" и составное!");
                return;
            }
        }
            System.out.println(" и простое!");
        }
        else
            {
                System.out.println("Вы ввели не целое число!");
            }

    }
}
