package pl.javastart.task;

import java.util.Scanner;

public class ArrayUtils {

    private Scanner scanner = new Scanner(System.in);

    int getArraySize() {
        System.out.println("Podaj rozmiar tablicy");
        return scanner.nextInt();
    }

    double[] createArray(int size) {
        System.out.println("Wprowadź " + size + " liczb:");
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    double sumOfSquares(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element * element;
        }
        System.out.println("Suma kwadratów wprowadzonych liczb to " + sum);
        return sum;
    }
}
