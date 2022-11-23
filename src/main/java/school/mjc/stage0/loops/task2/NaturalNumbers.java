package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int numbersBeforeLastPrinted = 0;
        while (lastPrinted >= numbersBeforeLastPrinted) {
            System.out.println(numbersBeforeLastPrinted);
            numbersBeforeLastPrinted++;
        }
    }
}
