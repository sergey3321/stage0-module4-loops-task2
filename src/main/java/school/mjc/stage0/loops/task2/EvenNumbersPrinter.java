package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public static void main(String[] args) {
        printEvenNumbers(9);
    }
    public static void printEvenNumbers(int printTillInclusive) {
        int numbersEvenBeforeIntTillInclusive = 0;

        while (printTillInclusive > numbersEvenBeforeIntTillInclusive) {
            numbersEvenBeforeIntTillInclusive++;
            if (numbersEvenBeforeIntTillInclusive % 2 == 0) {
                System.out.println(numbersEvenBeforeIntTillInclusive);
            }
            }

    }
}
