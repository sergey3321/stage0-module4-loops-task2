package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public static void main(String[] args) {
        naturalNumbersPrinter(12);
    }
    public static void naturalNumbersPrinter(int lastPrinted) {
        int numbersBeforeLastPrinted = 0;
        while (lastPrinted >= numbersBeforeLastPrinted) {
            System.out.println(numbersBeforeLastPrinted);
            numbersBeforeLastPrinted++;
        }
    }
}
