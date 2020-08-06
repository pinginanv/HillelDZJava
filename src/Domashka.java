import java.util.Scanner;

public class Domashka {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
             /* Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
      1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
      Написать двумя способами. If и switch.
      */
        System.out.println("Введіть число 1, 2 чи 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        //Спосіб SWITCH
        switch (i) {
            case 1:
                System.out.println("Ввели 1 (Switch)");
                break;
            case 2:
                System.out.println("Ввели 2 (Switch)");
                break;
            case 3:
                System.out.println("Ввели 3 (Switch)");
                break;
            default:
                System.out.println("Ввели невірне число. (Switch)");
                break;
        }
        //Спосіб IF
        if (i == 1) {
            System.out.println("Ввели 1 (if)");
        } else if (i == 2) {
            System.out.println("Ввели 2 (if)");
        } else if (i == 3) {
            System.out.println("Ввели 3 (if)");
        } else System.out.println("Ввели невірне число (if)");


        System.out.println("=================");
        System.out.println("Задача 2:");
        /*Необходимо вывести на экран числа от 5 до 1. На экране должно быть:  5 4 3 2 1*/
        for (int j = 5; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println("");
        System.out.println("=================");
        System.out.println("Задача 3:");
        /*Необходимо вывести на экран таблицу умножения на 3:*/
        for (int j = 1; j < 11; j++) {
            System.out.println("3*" + j + "=" + 3 * j);

        }

        System.out.println("=================");
        System.out.println("Задача 4:");
        /*  Найти среднее значение суммы чисел от 1 до 100 */
        int sum = 0;

        for (int j = 1; j < 101; j++) {
            sum = sum + j;
        }

        System.out.println("Середнє значення: " + sum / 100);

        System.out.println("=================");
        System.out.println("Задача 5:");
        // Найти максимальное число в массиве int [] array = {5,2,4,8,88,22,10}
        int[] array = {5, 2, 4, 8, 88, 22, 10};
        int max = array[0];
        for (int k : array) {
            if (k > max) max = k;
        }
        System.out.println("Максимальне значення: " + max);

    }
}
