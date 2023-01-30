package pl.javastart.task;

import java.util.Scanner;

public class ArrayUtils {

    private Scanner scanner = new Scanner(System.in);
    private int size;
    private double[] array;
    private double sum = 0;

    void getArraySize() {
        System.out.println("Podaj rozmiar tablicy");
        size = scanner.nextInt();
    }

    void createArray(int size) {
        System.out.println("Wprowadź " + size + " liczb:");
        array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
    }

    void sum(double[] array) {
        for (double element : array) {
            sum += element * element;
        }
        System.out.println("Suma kwadratów wprowadzonych liczb to " + sum);
    }

    int getSize() {
        return size;
    }

    void setSize(int size) {
        this.size = size;
    }

    double getSum() {
        return sum;
    }

    void setSum(double sum) {
        this.sum = sum;
    }

    double[] getArray() {
        return array;
    }

    void setArray(double[] array) {
        this.array = array;
    }
}
