package org.itstep;

import org.itstep.models.Person;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        //Shift + F6 - rename
        //Ctrl + P - просмотр параметров метода
        //Alt + Ins - автогенерация кода

        // write your code here
        //объявление константы
        final float PI = 3.14f;

        int val = 100_000;

        //вывод данных на консоль
        System.out.println("Hello world");
        System.out.println(String.format("My name is %s", "Vasya"));
        System.out.println(String.format("PI = %f", PI));


        //Ввод данных
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        //ожидание ввода
        //String inputText = scanner.next();  //чтение до пробела
        String inputText = scanner.nextLine();  //чтение всей строки
        System.out.println(String.format("Your string - %s", inputText));

        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.println(String.format("a = %d", a));*/

        //объявление одномерного массива
        /*int[] nums = new int[10];
        System.out.println(String.format("Length = %s", nums.length));
        Random rnd = new Random();

        //заполнение массива случайными числами
        for (int i = 0; i < nums.length; i++) {
            //генерирование случайного значения
            nums[i] = ThreadLocalRandom.current().nextInt(0, 20);
            //System.out.println(nums[i]);
        }

        //вывод элементов
        for (int item : nums) {
            System.out.println(item);
        }*/

        //объявление двумерного массива
        /*int[][] vals = new int[5][7];
        System.out.println(vals.length);
        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < vals[i].length; j++) {
                //генерирование случайного значения
                vals[i][j] = ThreadLocalRandom.current().nextInt(0, 20);
                System.out.print(String.format("%d ", vals[i][j]));
            }
            System.out.println();
        }*/


        try {

        }
        catch(Exception ex)
        {

        }
        finally {

        }

        String str = "Helo world";


        Person person = new Person();
    }

    static void demo() {

    }
}
