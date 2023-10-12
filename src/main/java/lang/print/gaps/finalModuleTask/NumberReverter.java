package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        StringBuilder reverseNumber = new StringBuilder();
        for(int i; number != 0; number /= 10) {
            i = number % 10;
            reverseNumber.append(i);
        }
        System.out.println(reverseNumber);
    }
}
