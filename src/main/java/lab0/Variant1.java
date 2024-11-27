package lab0;

import java.util.ArrayList;

public class Variant1 {

    public enum DAY_OF_WEEK {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // Одномірні масиви
    public int[] arrayTask(int n) {
        assert n > 0 : "N must be greater than 0";
        int[] oddNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            oddNumbers[i] = 2 * i + 1;
        }
        return oddNumbers;
    }

    // Логічні вирази
    public boolean booleanTask(int a) {
        return a > 0;
    }

    // Оператор вибору
    public DAY_OF_WEEK switchTask(int number) {
        assert number >= 1 && number <= 7 : "Number must be in range 1-7";
        return DAY_OF_WEEK.values()[number - 1];
    }

    // Цикл з параметром
    public int[] forTask(int k, int n) {
        assert n > 0 : "N must be greater than 0";
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = k;
        }
        return result;
    }

    // Умовний оператор
    public int ifTask(int parameter) {
        if (parameter > 0) {
            return parameter + 1;
        }
        return parameter;
    }

    // Цілі числа
    public int integerNumbersTask(int l) {
        assert l >= 0 : "Distance must be non-negative";
        return l / 100;
    }

    // Двовимірні масиви
    public int[][] twoDimensionArrayTask(int m, int n) {
        assert m > 0 && n > 0 : "Matrix dimensions must be positive";
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 10 * (i + 1);
            }
        }
        return matrix;
    }

    // Цикл з умовою
    public int whileTask(int a, int b) {
        assert a > b : "A must be greater than B";
        while (a >= b) {
            a -= b;
        }
        return a;
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }
}
