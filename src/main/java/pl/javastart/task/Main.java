package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        ArrayUtils util = new ArrayUtils();
        int size = util.getArraySize();
        double[] array = util.createArray(size);
        double sum = util.sumOfSquares(array);
    }
}
