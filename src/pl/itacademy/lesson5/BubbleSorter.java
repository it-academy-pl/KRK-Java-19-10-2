package pl.itacademy.lesson5;

import java.util.Arrays;

public class BubbleSorter {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        boolean isSorted;
        int i = 0;
        do {
            isSorted = true;
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j - 1] > numbers[j]) {
                    int tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                    isSorted = false;
                }
            }
            i++;
        } while (!isSorted);

        System.out.println(Arrays.toString(numbers));
    }
}
