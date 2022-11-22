package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void main(String[] args) {
        printPower(4);
    }
    public static void printPower(int power) {
        int onePower = 0;

        while (onePower <= power) {
            System.out.println(power * power);
            onePower++;
        }
    }
}
