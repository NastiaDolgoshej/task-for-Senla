import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("Введите 3 числа(длины сторон треугольника): ");
        int a = k.nextInt();
        int b = k.nextInt();
        int c = k.nextInt();
        if ( (a>0 && b>0 && c>0) && ((a+b) > c) || ((a+c) > b) || ((b+c) > a))
        {
            System.out.println("Треугольник построить возможно");
        }
         else {
            System.out.println("Треугольник построить нельзя");
        }
    }
}