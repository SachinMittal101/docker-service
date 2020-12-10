package practice.dynamicprogramming;

public class FactorialProgramUsingRecursion {

    public static void main(String[] args) {
        final int factorial = factorial(5);
        System.out.println(factorial);
    }

    private static int factorial(int number) {
        if (number == 0)
            return 1;
        return number * factorial(number - 1);
    }
}
