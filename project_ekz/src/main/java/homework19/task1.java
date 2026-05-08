package main.java.homework19;

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите первое число: ");
        int start = scanner.nextInt();
        System.out.print("введите второе число: ");
        int end = scanner.nextInt();
        System.out.print("введите шаг: ");
        int step = scanner.nextInt();
        printMultiplicationTable(start, end, step);
        scanner.close();
    }

    public static void printMultiplicationTable(int start, int end, int step) {
        java.util.List<Integer> numbers = new java.util.ArrayList<>();
        for (int i = start; i <= end; i += step) {
            numbers.add(i);
        }

        if (numbers.get(numbers.size() - 1) != end) {
            numbers.add(end);
        }

        int maxWidth = 0;
        for (int num : numbers) {
            maxWidth = Math.max(maxWidth, getCellWidth(num));
            for (int num2 : numbers) {
                int product = num * num2;
                maxWidth = Math.max(maxWidth, getCellWidth(product));
            }
        }
        maxWidth = Math.max(maxWidth, 2);
        System.out.print(" ".repeat(maxWidth));
        for (int num : numbers) {
            System.out.print(String.format("%" + maxWidth + "d", num));
        }
        System.out.println();
        for (int row : numbers) {
            System.out.print(String.format("%" + maxWidth + "d", row));
            for (int col : numbers) {
                int product = row * col;
                System.out.print(String.format("%" + maxWidth + "d", product));
            }
            System.out.println();
        }
    }
    public static int getCellWidth(int number) {
        String data = String.valueOf(number);
        return data.length();
    }
}
