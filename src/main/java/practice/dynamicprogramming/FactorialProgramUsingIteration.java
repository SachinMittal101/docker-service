package practice.dynamicprogramming;

public class FactorialProgramUsingIteration {

    public static void main(String[] args) {
        final int factorial = factorial(6);
        System.out.println(factorial);
    }

    private static int factorial(int number) {
        if(number == 0)
            return 1;

        int factorial = 1;
        for(int i = 2; i <= number; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
