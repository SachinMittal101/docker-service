package practice;

public class PrimeNumber {

    public static void main(String[] args) {
        if(isPrime(9)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }

    private static boolean isPrime(int number) {
        boolean flag = false;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        return flag;
    }
}
