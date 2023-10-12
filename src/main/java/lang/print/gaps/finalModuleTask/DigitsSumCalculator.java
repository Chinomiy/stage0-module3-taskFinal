package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;

        for(int i; number != 0; number = number / 10) {

            i = number % 10;
            sum += i;
        }
        System.out.println(sum);
    }
}
