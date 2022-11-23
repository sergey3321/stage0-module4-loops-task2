package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int onePower = 0;

        while (onePower <= power) {
            System.out.println(power * power);
            onePower++;
        }
    }
}
