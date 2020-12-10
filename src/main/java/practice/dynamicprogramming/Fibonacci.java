package practice.dynamicprogramming;

public class Fibonacci {

    public static void main(String[] args) {

        printFibonacci(0, 100);
    }

    private static void printFibonacci(int start, int end) {
        int n1 = 0;
        int n2 = 1;

        System.out.print(n1 + " " +n2 + " ");
        int n3;
        for(int i = 2; i < end; i++){
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
