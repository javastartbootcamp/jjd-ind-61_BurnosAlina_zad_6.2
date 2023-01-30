package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        ArrayUtils util = new ArrayUtils();
        util.getArraySize();
        util.createArray(util.getSize());
        util.sum(util.getArray());
    }
}
